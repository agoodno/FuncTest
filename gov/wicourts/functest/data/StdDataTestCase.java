/*
 * Copyright (c) 2006 Consolidated Court Automation Programs.
 * All rights reserved.
 */
package gov.wicourts.functest.data;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import gov.wicourts.functest.CCAPDatabaseTestCase;

import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.IDataSet;

/**
 * StdDataTestCase
 */
public class StdDataTestCase extends CCAPDatabaseTestCase
{
	
	/**
	 * 
	 * @throws SQLException
	 * @see gov.wicourts.functest.CCAPDatabaseTestCase#getActualDataSet()
	 */
	public IDataSet getActualDataSet() throws SQLException {
		QueryDataSet qDataSet = new QueryDataSet(_dbConn);
		qDataSet.addTable(
		    "StdData",
			"SELECT * FROM \"StdData\" WHERE \"txtKey\" LIKE 'ANDY%'"
			);
		return qDataSet;
	}
    
	/**
	 * 
	 * @see gov.wicourts.functest.CCAPDatabaseTestCase#getReplacementMap()
	 */
	public Map getReplacementMap() {
		return null;
	}
	
    public static void main(String[] args) throws Exception
    {
        //TestRunner.run(StdDataTestCase.class);
    	StdDataTestCase testCase = new StdDataTestCase();
    	testCase.doSetUp();
    	testCase.doMockData();
    	testCase.testFinalDataState();
    	testCase.doTearDown();
    }
    
}