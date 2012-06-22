

import gov.wicourts.functest.data.StdDataTestCase;
import resources.StdDataHelper;

import com.rational.test.ft.script.RationalTestScript;

/**
 * Description   : Functional Test Script
 * @author agoodno
 */
public class StdData extends StdDataHelper
{

	public StdData()
	{
		super();
		setTestCase(new StdDataTestCase());
	}

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
		checkScriptArgs(3);

		String stdTxtCode = (String)args[0];
		String stdTxtDesc = (String)args[1];
		String stdTxt = (String)args[2];

		// Frame: RegularExpression(.* County \- Case Management \- .*)
		caseAppFrame().waitForExistence();

		//INSERT
		jadeMenuBar().click(atPath("File"));
		jadeMenuBar().click(atPath("File->Other->Standard Text Codes..."));
		caseAppFrame().inputKeys(stdTxtCode + "{TAB}");
		caseAppFrame().inputKeys(stdTxtDesc + "{TAB}");
		caseAppFrame().inputKeys(stdTxt + "{TAB}");
		jadeTabbedPane().click(atText("Case Types  (0)"));
		caseAppFrame().inputKeys("+{F2}");
		ok().click();
		caseAppFrame().inputKeys("cf{TAB}");
		ok2().click();
		ok3().click();
		StandardTextCodeJTP_selecteVP().performTest();
		standardTextCodesList1().close();

//		vpManual("stdTxtCode", stdTxtCode, (String)standardTextCodeText().getProperty("text")).performTest();
//		vpManual("stdTxtDesc", stdTxtCode, (String)standardTextDescriptionText().getProperty("text")).performTest();
//		vpManual("stdTxt", stdTxtCode, (String)standardTextTxtText().getProperty("text")).performTest();

		//SELECT
		jadeMenuBar().click(atPath("View"));
		jadeMenuBar().click(atPath("View->Other->Standard Text Codes..."));
		standardTextCodeText2().click(atPoint(16,7));
		jadeDialog2().inputKeys("ANDY1{ENTER}");
		Select_txtKey_textVP().performTest();
		Select_descr_textVP().performTest();
		Select_descr_textVP().performTest();
		ok5().click();

		//UPDATE
		caseAppFrame().inputKeys("^l");
		jadeDialog3().inputKeys("{BKSP}2{ENTER}");
		caseAppFrame().inputKeys("+{F4}");
		caseAppFrame().inputKeys("{TAB}");
		caseAppFrame().inputKeys("{ExtEnd}d{TAB}");
		caseAppFrame().inputKeys("{ExtLeft}d");
		ok6().click();

		//DELETE
		caseAppFrame().inputKeys("^l");
		jadeDialog3().inputKeys("{BKSP}3{ENTER}");
		caseAppFrame().inputKeys("+{F5}");
		ok7().click();
		yes().click();
		standardTextCodesList1_2().close();


	}

}
