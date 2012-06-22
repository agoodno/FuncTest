/*
 * Copyright (c) 2006 Consolidated Court Automation Programs.
 * All rights reserved.
 */
package gov.wicourts.functest.data;
import gov.wicourts.functest.CCAPDatabaseTestCase;
import gov.wicourts.functest.TestUtils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.IDataSet;

/**
 * UseFastEventsTestCase
 */
public class UseFastEventsTestCase extends CCAPDatabaseTestCase
{
	
	
    public UseFastEventsTestCase()
    {
        super();
    }
    
    public UseFastEventsTestCase(Map replacements)
    {
        super(replacements);
    }
	
	/**
	 * 
	 * @see gov.wicourts.functest.CCAPDatabaseTestCase#getActualDataSet()
	 */
	public IDataSet getActualDataSet() throws SQLException {
		QueryDataSet qDataSet = new QueryDataSet(_dbConn);
		qDataSet.addTable(
		    "TxtType",
			"SELECT * FROM \"TxtType\" WHERE \"txtType\" = 'CF'"
			);
		qDataSet.addTable(
		    "StdData",
			"SELECT * FROM \"StdData\" WHERE \"txtKey\" = 'GP'"
			);
		qDataSet.addTable(
		    "CaseHist",
			"SELECT" +
			" \"caseNo\"," +
			" \"histSeqNo\"," +
			" \"countyNo\"," +
			" \"eventType\"" +
			" FROM \"CaseHist\"" +
			" WHERE \"caseNo\" = '" + _replacements.get("[CASE_NO]") + "'" +
			" AND \"histSeqNo\" = " + _replacements.get("[HIST_SEQ_NO]") +
			" AND \"countyNo\" = " + _replacements.get("[COUNTY_NO]")
			);
//		qDataSet.addTable(
//			    "CaseHist",
//				"SELECT \"caseNo\", \"histSeqNo\", \"countyNo\"" +
//				" FROM \"CaseHist\"" +
//				" WHERE \"caseNo\" = '[CASE_NO]'" +
//				" AND \"histSeqNo\" = [HIST_SEQ_NO]" +
//				" AND \"countyNo\" = [COUNTY_NO]");
//		ReplacementDataSet repDataSet = new ReplacementDataSet(qDataSet, _replacements, null);
//		return repDataSet;
		return qDataSet;
	}
	
	protected int getNextSeqNoInt(String table, String seqNoColumn, Map seqKeys)
		throws ClassNotFoundException, SQLException
	{
		int nextSeqNo = 1;
		Statement stmt = null;
		try
		{
			StringBuffer sb = new StringBuffer();
			for (Iterator seqKeysItr = seqKeys.entrySet().iterator(); seqKeysItr.hasNext();)
			{
	            Map.Entry seqKeysEntry = (Map.Entry)seqKeysItr.next();
	            String colName = (String)seqKeysEntry.getKey();
	            Object colValue = seqKeysEntry.getValue();
	            if (sb.length() == 0)
	            	sb.append(" WHERE ");
	            else
	            	sb.append(" AND ");
	            sb.append("\"" + colName + "\"=" + TestUtils.checkQuotes(colValue));
			}
			String sql = "SELECT \"" + seqNoColumn + "\" + 1 FROM \"" + table + "\"" + sb.toString();
			System.out.println(sql);
	    	stmt = getSqlConnection().createStatement();
	    	ResultSet rs = stmt.executeQuery(sql);
	    	rs.next();
	    	nextSeqNo = rs.getInt(1);
		}
		finally
		{
			if (stmt != null)
				stmt.close();
		}
		return nextSeqNo;
	}
	

	public static void main(String[] args) throws Exception
    {
		UseFastEventsTestCase testCase = new UseFastEventsTestCase();
		
		Map replacements = new HashMap();
		replacements.put("[COUNTY_NO]", "63");
		replacements.put("[CASE_NO]", TestUtils.pad("CASE_NO", "2006CF000006"));
		replacements.put("[USER_ID]", TestUtils.pad("USER_ID", "AGOODNO"));
		replacements.put("[EVENT_TYPE]", TestUtils.pad("EVENT_TYPE", "CT"));
		replacements.put("[STD_TXT_CODE]", TestUtils.pad("STD_TXT_CODE", "GP"));
		replacements.put("[STD_TXT_DESC]", TestUtils.pad("STD_TXT_DESC", "Guilty plea entered"));
		replacements.put("[STD_TXT_TEXT]", TestUtils.pad("STD_TXT_TEXT", "Guilty plea entered."));
		replacements.put("[TXT_TYPE_CODE]", TestUtils.pad("TXT_TYPE_CODE", "CF"));
		replacements.put("[TXT_TYPE_DESC]", TestUtils.pad("TXT_TYPE_DESC", "Felony"));
		
		Map maxKeys = new HashMap();
		maxKeys.put("countyNo", new Integer(63));
		maxKeys.put("caseNo", "2006CF000006");
		Integer nextSeqNo = testCase.getNextSeqNo("Case", "lastHistSeqNo", maxKeys);
		replacements.put("[HIST_SEQ_NO]", nextSeqNo);

		//TestRunner.run(UseFastEventsTestCase.class);

		testCase.setReplacements(replacements);
    	testCase.doSetUp();
    	testCase.doMockData();
    	testCase.testFinalDataState();
    	testCase.doTearDown();
    }

}