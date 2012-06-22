

import resources.OpenLauncherHelper;

import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

/**
 * 
 */
public class OpenLauncher extends OpenLauncherHelper
{
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
		setOption(IOptionName.RECOGNITION_THRESHOLD_WARNING, 20000);
		
		//logInfo("starting through the bootstrap...");
		
		startApp("CC_ANDY");
		//startApp("CC_Q406_TR_Sybase");

		// Frame: Washington County - Court Applications - dev
		jadeFrame().waitForExistence();
	}
}
