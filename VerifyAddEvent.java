

import resources.VerifyAddEventHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

/**
 * 
 */
public class VerifyAddEvent extends VerifyAddEventHelper
{
	/**
	 * @see RationalTestScript#onInitialize()
	 */
	public void onInitialize()
	{
		super.onInitialize();
		checkOpenLauncher();
		checkOpenCaseMgmt();
	}
	
	/**
	 * @see RationalTestScript#onTerminate()
	 */
	public void onTerminate()
	{
		try
		{
			super.onTerminate();
		}
		finally
		{
			checkCloseCaseMgmt();
			checkCloseLauncher();
		}
	}
	
	/**
	 * @param args arguments passed in to this test
	 * @see RationalTestScript#testMain()
	 */
	public void testMain(Object[] args) 
	{
		checkScriptArgs(2);

		String eventType = (String)args[0];
		String eventDesc = (String)args[1];

		// Frame: Washington County - Case Management - dev
		jadeMenuBar().click(atPath("View"));
		jadeMenuBar().click(atPath("View->New..."));
		jadeDialog().inputKeys(dpString("ABBREV_CASE_NO") + "{ENTER}");
		
		// TabbedPage: Case
		courtRecordJTP().click(
	        atCell(
	            atRow("Event Type", eventType, "Event Description", eventDesc), 
                atColumn("Event Date")
				), 
            atPoint(47,8)
		);
		
		courtRecordJTP_selectedVP().performTest();
	}
}