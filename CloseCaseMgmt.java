

import resources.CloseCaseMgmtHelper;

import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

/**
 *
 */
public class CloseCaseMgmt extends CloseCaseMgmtHelper
{
	/**
	 * @see RationalTestScript#onInitialize()
	 */
	public void onInitialize()
	{
		checkOpenLauncher();
		checkOpenCaseMgmt();
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
		// Frame: Washington County - Case Management - dev
		caseAppFrame().close();
	}
}
