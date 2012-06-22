/*
 * Copyright (c) 2006 Consolidated Court Automation Programs.
 * All rights reserved.
 */
package gov.wicourts.functest;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.hyades.execution.runtime.datapool.IDatapoolCell;

import com.rational.test.ft.BadArgumentException;
import com.rational.test.ft.WrappedException;
import com.rational.test.ft.script.RationalTestScript;
import com.rational.test.ft.script.RationalTestScriptException;

/**
 * CCAPTestScript
 */
public abstract class CCAPTestScript extends RationalTestScript
{
	protected CCAPDatabaseTestCase _testCase;
	protected Map _replacements;
	
	/**
	 * @see RationalTestScript#onInitialize()
	 */
	public void onInitialize()
	{
		if (isMainScript())
		{
			try
			{
				if (getTestCase() != null)
				{
					Map replacements = getTestCase().getReplacements();
					for (int i = 0; i < dpCurrent().getCellCount(); i++)
					{
						IDatapoolCell dpCell = dpCurrent().getCell(i);
						String cellName = (String)dpCell.getCellVariable().getName();
						String cellValue = (String)dpCell.getCellValue();
						//System.out.println(cellName + "=" + cellValue);
						replacements.put(
						    TestUtils.formatRepl(cellName),
							TestUtils.pad(cellName, cellValue)
							);
					}
					System.out.println(getReplacements());
					getTestCase().doSetUp();
				}
			}
			catch (ClasspathDataSetNotFoundException dsnfe)
			{
				logInfo(dsnfe.getMessage());
			}
			catch (Exception e)
			{
				throw new RationalTestScriptException(getScriptName(), getLineNumber(), e);
			}
		}
	}
	
	/**
	 * @see RationalTestScript#onTerminate()
	 */
	public void onTerminate()
	{
		if (isMainScript())
		{
			try
			{
				if (getTestCase() != null)
					getTestCase().doTearDown();
			}
			catch (ClasspathDataSetNotFoundException dsnfe)
			{
				logInfo(dsnfe.getMessage());
			}
			catch (Exception e)
			{
				throw new RationalTestScriptException(getScriptName(), getLineNumber(), e);
			}
		}
	}
	
	public void setTestCase(CCAPDatabaseTestCase testCase)
	{
		_testCase = testCase;
	}

	public CCAPDatabaseTestCase getTestCase()
	{
		if (_testCase == null)
			logWarning("No DBUnit test case defined for this script.");
		
		return _testCase;
	}
	
	public Map getReplacements() {
		return _testCase.getReplacements();
	}
	
	public void setReplacements(Map replacements) {
		_testCase.setReplacements(replacements);
	}
	
    public void checkOpenLauncher()
    {
    	if (isMainScript()) callScript("OpenLauncher");
    }
    
    public void checkOpenCaseMgmt()
    {
        if (isMainScript()) callScript("OpenCaseMgmt");
    }
    
    public void checkCloseCaseMgmt()
    {
        if (isMainScript()) callScript("CloseCaseMgmt");
    }
    
    public void checkCloseLauncher()
    {
        if (isMainScript()) callScript("CloseLauncher");
    }

    public void checkScriptArgs(int numArgsRequired)
    {
        if (isMainScript())
        {
    		if (getScriptArgs() == null || getScriptArgs().length != numArgsRequired)
    			throw new BadArgumentException(
    			    "Requires " + numArgsRequired + " arguments.  Num arguments passed: " + getScriptArgs().length
				);
    		
    		for (int i = 0; i < getScriptArgs().length; i++)
    		{
        		if (!(getScriptArgs()[i] instanceof String))
        			throw new BadArgumentException("At least one argument of wrong type - not a String.");    			
    		}
        }
    }
    
    public void testDatabase()
    {
		try
		{
			if (getTestCase() != null)
			{
				getTestCase().testFinalDataState();
			}
		}
		catch (ClasspathDataSetNotFoundException dsnfe)
		{
			logInfo(dsnfe.getMessage());
		}
		catch (Exception e)
		{
			throw new WrappedException(e);
		}
    }
}
