

import resources.CloseLauncherHelper;

import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

/**
 * 
 */
public class CloseLauncher extends CloseLauncherHelper
{
	/**
	 * @see RationalTestScript#onInitialize()
	 */
	public void onInitialize()
	{
		checkOpenLauncher();
	}
	
	/**
	 * @param args arguments passed in to this test
	 * @see RationalTestScript#testMain()
	 */
	public void testMain(Object[] args) 
	{
		// Frame: Washington County - Court Applications - dev
		jadeFrame(ANY,MAY_EXIT).close();
	}
}
