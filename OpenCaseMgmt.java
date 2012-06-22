

import resources.OpenCaseMgmtHelper;

import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

/**
 * 
 */
public class OpenCaseMgmt extends OpenCaseMgmtHelper
{
	/**
	 * @see RationalTestScript#onInitialize()
	 */
	public void onInitialize()
	{
		checkOpenLauncher();
	}
	
	/**
	 * @see RationalTestScript#onTerminate()
	 */
	public void onTerminate()
	{
		checkCloseCaseMgmt();
		checkCloseLauncher();
	}
	
	/**
	 * @param args arguments passed in to this test
	 * @see RationalTestScript#testMain()
	 */
	public void testMain(Object[] args) 
	{
		//Open CaseMgmt application
		_case().click();
		
		caseAppFrame().waitForExistence();
	}
}
