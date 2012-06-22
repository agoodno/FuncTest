/*
 * Copyright (c) 2006 Consolidated Court Automation Programs.
 * All rights reserved.
 */
package gov.wicourts.functest;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

import org.dbunit.Assertion;
import org.dbunit.DatabaseTestCase;
import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ReplacementDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.DatabaseOperation;

/**
 * CCAPDatabaseTestCase
 */
public abstract class CCAPDatabaseTestCase extends DatabaseTestCase
{
	protected Connection _conn;
	protected IDatabaseConnection _dbConn;
	protected Map _replacements = new HashMap();
	
    private String _dbDriver = "com.sybase.jdbc2.jdbc.SybDriver";
    private String _dbUrl = "jdbc:sybase:Tds:localhost:5000/ccap";
    private String _dbUser = "ccap";
    private String _dbPass = "ICHHAV8";
    private IDataSet _popDataSet;
    private IDataSet _pushDataSet;
    private IDataSet _expectedDataSet;
    private IDataSet _actualDataSet;
    private IDataSet _mockPopDataSet;
    private IDataSet _mockPushDataSet;
    
    
    public CCAPDatabaseTestCase()
    {
        super();
    }
    
    public CCAPDatabaseTestCase(Map replacements)
    {
        this();
        _replacements = replacements;
    }

    public void doSetUp()
    	throws ClassNotFoundException, ClasspathDataSetNotFoundException, DatabaseUnitException,
			   IOException, SQLException
    {
        getPopSetUpOperation().execute(getConnection(), getPopDataSet());
        getPushSetUpOperation().execute(getConnection(), getPushDataSet());
    }
    
    public void doTearDown()
    	throws ClassNotFoundException, ClasspathDataSetNotFoundException, DatabaseUnitException,
			   IOException, SQLException
    {
        getPopTearDownOperation().execute(getConnection(), getPopDataSet());
        getPushTearDownOperation().execute(getConnection(), getPushDataSet());
    }
    
    public void doMockData()
		throws ClassNotFoundException, ClasspathDataSetNotFoundException, DatabaseUnitException,
			   IOException, SQLException
	{
    	getPopSetUpOperation().execute(getConnection(), getMockPopDataSet());
    	getPushSetUpOperation().execute(getConnection(), getMockPushDataSet());
	}
    
    public void testFinalDataState()
    	throws ClasspathDataSetNotFoundException, DataSetException, DatabaseUnitException,
			   IOException, SQLException
    {
    	IDataSet expected = getExpectedDataSet();
    	IDataSet actual = getActualDataSet();
    	Assertion.assertEquals(expected, actual);
    }

	/**
	 * 
	 * @see gov.wicourts.functest.CCAPDatabaseTestCase#getReplacements()
	 */
	public Map getReplacements() {
		return _replacements;
	}
	
	/**
	 * 
	 * @see gov.wicourts.functest.CCAPDatabaseTestCase#getReplacements()
	 */
	public void setReplacements(Map replacements) {
		_replacements = replacements;
		System.out.println(_replacements);
	}
	
    public Integer getNextSeqNo(String table, String seqNoColumn, Map seqKeys)
    	throws ClassNotFoundException, SQLException
    {
    	return new Integer(getNextSeqNoInt(table, seqNoColumn, seqKeys));
    }
    
    public abstract IDataSet getActualDataSet() throws SQLException;
    
    
    protected DatabaseOperation getPopSetUpOperation()
    {
        return DatabaseOperation.DELETE;
    }
    
    protected DatabaseOperation getPushSetUpOperation()
    {
        return DatabaseOperation.REFRESH;
    }

    protected DatabaseOperation getPopTearDownOperation()
    {
        return DatabaseOperation.NONE;
    }
    
    protected DatabaseOperation getPushTearDownOperation()
    {
        return DatabaseOperation.NONE;
    }
    
    protected Connection getSqlConnection() throws ClassNotFoundException, SQLException
    {
    	if (_conn == null)
    	{
	        Class.forName(_dbDriver);
	        _conn = DriverManager.getConnection(_dbUrl, _dbUser, _dbPass);
    	}
    	return _conn;
    }
    
    protected IDatabaseConnection getConnection() throws ClassNotFoundException, SQLException
    {
    	if (_dbConn == null)
    	{
	        _dbConn = new DatabaseConnection(getSqlConnection());
//	        _dbConn.getConfig().setProperty(
//	            DatabaseConfig.PROPERTY_RESULTSET_TABLE_FACTORY, new ForwardOnlyResultSetTableFactory()
//			);
    	}
    	return _dbConn;
    }
	
    protected DatabaseOperation getSetUpOperation()
    {
        return getPopSetUpOperation();
    }

    protected DatabaseOperation getTearDownOperation()
    {
        return getPopTearDownOperation();
    }

    /**
     * CCAP doesn't run the tests in the normal way, but if the test was run in the normal way, this would make sure
     * the Push data was run into the database so the test would succeed - only an insert could fail because the Pop
     * wasn't run to make sure it didn't already exist.
     * 
     * @see DatabaseTestCase#getDataSet() 
     */
    protected IDataSet getDataSet() throws DataSetException, IOException
    {
        return getPopDataSet();
    }
    
    protected IDataSet getPopDataSet()
    	throws DataSetException, ClasspathDataSetNotFoundException, IOException
    {
    	if (_popDataSet == null)
    		_popDataSet = getClasspathDataSet("pop");
    	return _popDataSet;
    }
    
    protected IDataSet getPushDataSet()
    	throws DataSetException, ClasspathDataSetNotFoundException, IOException
    {
    	if (_pushDataSet == null)
    		_pushDataSet = getClasspathDataSet("push");
    	return _pushDataSet;
    }
    
    protected IDataSet getExpectedDataSet()
    	throws DataSetException, ClasspathDataSetNotFoundException, IOException
    {
    	if (_expectedDataSet == null)
    		_expectedDataSet = getClasspathDataSet("exp");
    	return _expectedDataSet;
    }
    
    protected IDataSet getMockPopDataSet()
	throws DataSetException, ClasspathDataSetNotFoundException, IOException
	{
		if (_mockPopDataSet == null)
			_mockPopDataSet = getClasspathDataSet("mockpop");
		return _mockPopDataSet;
	}
	
	protected IDataSet getMockPushDataSet()
		throws DataSetException, ClasspathDataSetNotFoundException, IOException
	{
		if (_mockPushDataSet == null)
			_mockPushDataSet = getClasspathDataSet("mockpush");
		return _mockPushDataSet;
	}

    protected String getDbDriver()
    {
        return _dbDriver;
    }

    protected void setDbDriver(String dbDriver)
    {
        _dbDriver = dbDriver;
    }

    protected String getDbPass()
    {
        return _dbPass;
    }

    protected void setDbPass(String dbPass)
    {
        _dbPass = dbPass;
    }

    protected String getDbUrl()
    {
        return _dbUrl;
    }

    protected void setDbUrl(String dbUrl)
    {
        _dbUrl = dbUrl;
    }

    protected String getDbUser()
    {
        return _dbUser;
    }

    protected void setDbUser(String dbUser)
    {
        _dbUser = dbUser;
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
			String sql = "SELECT MAX(\"" + seqNoColumn + "\") + 1 FROM " + table + sb.toString();
			//System.out.println(sql);
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
	
    private IDataSet getClasspathDataSet(String ext)
    	throws DataSetException, ClasspathDataSetNotFoundException, IOException
	{
    	IDataSet dataSet = new FlatXmlDataSet(getClasspathUrl(ext));
    	
    	if (_replacements != null)
	    	dataSet = new ReplacementDataSet(dataSet, _replacements, null);

    	return dataSet;
	}

	private URL getClasspathUrl(String ext)
    	throws DataSetException, ClasspathDataSetNotFoundException, IOException
	{
		StringTokenizer st = new StringTokenizer(this.getClass().getName(), ".");
		String baseName = null;
		while(st.hasMoreTokens())
			baseName = st.nextToken();
		st = null;
		
		String dataSetFileName = "/gov/wicourts/functest/data/" + baseName + "-" + ext + ".xml";
	
		URL dataSetUrl = 
			CCAPDatabaseTestCase.class.getResource(dataSetFileName);
		
		if (dataSetUrl == null)
			throw new ClasspathDataSetNotFoundException(dataSetFileName);
	
		return dataSetUrl;
	}
    

    
}
