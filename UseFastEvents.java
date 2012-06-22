

import gov.wicourts.functest.TestUtils;
import gov.wicourts.functest.data.UseFastEventsTestCase;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.hyades.execution.runtime.datapool.IDatapoolCell;

import resources.UseFastEventsHelper;

import com.rational.test.ft.WrappedException;
import com.rational.test.ft.script.RationalTestScript;

/**
 * 
 */
public class UseFastEvents extends UseFastEventsHelper
{
	
	public UseFastEvents()
	{
		super();
		_testCase = new UseFastEventsTestCase();
	}
	
	/**
	 * @see RationalTestScript#onInitialize()
	 */
	public void onInitialize()
	{
		try
		{
			Map maxKeys = new HashMap();
			maxKeys.put("countyNo", new Integer(dpInt("COUNTY_NO")));
			maxKeys.put("caseNo", dpString("CASE_NO"));

			Integer nextSeqNo = getTestCase().getNextSeqNo("CaseHist", "histSeqNo", maxKeys);
			getReplacements().put(
					TestUtils.formatRepl("HIST_SEQ_NO"),
					nextSeqNo
					);
		}
		catch (Exception e)
		{
			throw new WrappedException(e);
		}
		System.out.println(getReplacements());
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
		Special_menuVP().performTest();
		
		// Frame: .* County \- Case Management \- .*
		jadeMenuBar().click(atPath("Special"));
		jadeMenuBar().click(atPath("Special->Case->Fast Event..."));

		//Date:
		caseAppFrame().inputKeys("{F12}");
		eventDate_selectedVP().performTest();
		caseAppFrame().inputKeys("{TAB}");
		
		//Case Number:
		caseAppFrame().inputChars(dpString("ABBREV_CASE_NO"));
		caseAppFrame().inputKeys("{TAB}");
		caseNo_textVP().performTest();
		
		//Caption:
		StateOfWisconsinVsVP().performTest();		
		
		//Event:
		eventTypeCodeField().click(atPoint(43,7));
		caseAppFrame().inputChars(dpString("EVENT_TYPE"));
		caseAppFrame().inputKeys("{TAB}");
		eventType_standardVP().performTest();

		//(unlabled)Event Amt:		
		eventAmt_textVP().performTest();
		
		//Disposition:
		dispEvent_standardVP().performTest();
		
		//Tag:
		tag_textVP().performTest();
		
		//C.O.:
		ctofcNo_standardVP().performTest();
		
		//Reporter:
		courtRptrCode_standardVP().performTest();
		
		//Tape #:
		tapeCounterNo_textVP().performTest();
		
		//Std. Text:
		txtKeyCodeField().click(atPoint(29,4));
		caseAppFrame().inputKeys(dpString("STD_TXT_CODE") + "{TAB}");
		
		sleep(1.0);
		
		//Additional Text:
		JadeTextArea_textVP().performTest();
		
		//Std. Text: post
		txtKey_standardVP().performTest();
			
		//Save Fast Event
		ok().click();

		testDatabase();
		
		callScript("VerifyAddEvent",
					new Object[] {
					    	dpString("EVENT_TYPE"),
							dpString("EVENT_DESC")
						}
				  );
	}
}
