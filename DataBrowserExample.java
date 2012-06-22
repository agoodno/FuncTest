

import resources.DataBrowserExampleHelper;

import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

/**
 * Description   : Functional Test Script
 * @author agoodno
 */
public class DataBrowserExample extends DataBrowserExampleHelper
{
	/**
	 * Script Name   : <b>DataBrowserExample</b>
	 * Generated     : <b>Nov 24, 2006 1:05:12 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.0  Build 2195 (S)
	 * 
	 * @since  2006/11/24
	 * @author agoodno
	 */
	public void testMain(Object[] args) 
	{
		callScript("DataBrowserCheck", new Object[]{"select * from \"CaseHist\" where \"caseNo\" = '" + dpString("CASE_NO") + "' and \"countyNo\" = " + dpString("COUNTY_NO") + " order by \"histSeqNo\" desc"});
	}
}
