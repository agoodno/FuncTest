

import resources.LaunchButtonsHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

/**
 * 
 */
public class LaunchButtons extends LaunchButtonsHelper
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
		checkCloseLauncher();
	}
	
	/**
	 * @param args arguments passed in to this test
	 * @see RationalTestScript#testMain()
	 */
	public void testMain(Object[] args) 
	{
		//Frame: Court Applications
		Case_standardVP().performTest();
		Maintenance_standardVP().performTest();
		Jury_standardVP().performTest();
		Financial_standardVP().performTest();
		Reports_standardVP().performTest();
	}
}