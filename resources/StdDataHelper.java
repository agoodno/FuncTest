// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources;
import gov.wicourts.functest.CCAPTestScript;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;

/**
 * Script Name   : <b>StdData</b><br>
 * Generated     : <b>2006/11/22 2:23:07 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 2000 x86 5.0 <br>
 *
 * @since  November 22, 2006
 * @author agoodno
 */
public abstract class StdDataHelper extends gov.wicourts.functest.CCAPTestScript
{
	/**
	 * Cancel: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeCancelButton
	 * 		accessibleContext.accessibleName : Cancel
	 * 		name : JadeCancelButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject cancel()
	{
		return new GuiTestObject(
                        getMappedTestObject("cancel"));
	}
	/**
	 * Cancel: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeCancelButton
	 * 		accessibleContext.accessibleName : Cancel
	 * 		name : JadeCancelButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject cancel(TestObject anchor, long flags)
	{
		return new GuiTestObject(
                        getMappedTestObject("cancel"), anchor, flags);
	}

	/**
	 * CaseAppFrame: with default state.
	 *		.captionText : RegularExpression(.* County \- Case Management \- .*)
	 * 		.class : us.wi.state.courts.jade.client.caseapp.CaseAF
	 * 		accessibleContext.accessibleName : RegularExpression(.* County \- Case Management \- .*)
	 * 		name : CaseAppFrame
	 */
	protected TopLevelTestObject caseAppFrame()
	{
		return new TopLevelTestObject(
                        getMappedTestObject("caseAppFrame"));
	}
	/**
	 * CaseAppFrame: with specific test context and state.
	 *		.captionText : RegularExpression(.* County \- Case Management \- .*)
	 * 		.class : us.wi.state.courts.jade.client.caseapp.CaseAF
	 * 		accessibleContext.accessibleName : RegularExpression(.* County \- Case Management \- .*)
	 * 		name : CaseAppFrame
	 */
	protected TopLevelTestObject caseAppFrame(TestObject anchor, long flags)
	{
		return new TopLevelTestObject(
                        getMappedTestObject("caseAppFrame"), anchor, flags);
	}

	/**
	 * JadeDialog: with default state.
	 *		.captionText : Last Query: Standard Text Codes... Selection
	 * 		.class : gov.wicourts.jade.gui.JadeDialog
	 */
	protected TopLevelTestObject jadeDialog()
	{
		return new TopLevelTestObject(
                        getMappedTestObject("jadeDialog"));
	}
	/**
	 * JadeDialog: with specific test context and state.
	 *		.captionText : Last Query: Standard Text Codes... Selection
	 * 		.class : gov.wicourts.jade.gui.JadeDialog
	 */
	protected TopLevelTestObject jadeDialog(TestObject anchor, long flags)
	{
		return new TopLevelTestObject(
                        getMappedTestObject("jadeDialog"), anchor, flags);
	}

	/**
	 * JadeDialog: with default state.
	 *		.captionText : New - Standard Text Codes Selection
	 * 		.class : gov.wicourts.jade.gui.JadeDialog
	 */
	protected TopLevelTestObject jadeDialog2()
	{
		return new TopLevelTestObject(
                        getMappedTestObject("jadeDialog2"));
	}
	/**
	 * JadeDialog: with specific test context and state.
	 *		.captionText : New - Standard Text Codes Selection
	 * 		.class : gov.wicourts.jade.gui.JadeDialog
	 */
	protected TopLevelTestObject jadeDialog2(TestObject anchor, long flags)
	{
		return new TopLevelTestObject(
                        getMappedTestObject("jadeDialog2"), anchor, flags);
	}

	/**
	 * JadeDialog: with default state.
	 *		.captionText : Last Query: Standard Text Codes Selection
	 * 		.class : gov.wicourts.jade.gui.JadeDialog
	 */
	protected TopLevelTestObject jadeDialog3()
	{
		return new TopLevelTestObject(
                        getMappedTestObject("jadeDialog3"));
	}
	/**
	 * JadeDialog: with specific test context and state.
	 *		.captionText : Last Query: Standard Text Codes Selection
	 * 		.class : gov.wicourts.jade.gui.JadeDialog
	 */
	protected TopLevelTestObject jadeDialog3(TestObject anchor, long flags)
	{
		return new TopLevelTestObject(
                        getMappedTestObject("jadeDialog3"), anchor, flags);
	}

	/**
	 * JadeMenuBar: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeMenuBar
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject jadeMenuBar()
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("jadeMenuBar"));
	}
	/**
	 * JadeMenuBar: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeMenuBar
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject jadeMenuBar(TestObject anchor, long flags)
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("jadeMenuBar"), anchor, flags);
	}

	/**
	 * JadeTabbedPane: with default state.
	 *		tabCount : 2
	 * 		.class : gov.wicourts.jade.gui.JadeTabbedPane
	 * 		.tabs : {Standard Text,Case Types  (0)}
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject jadeTabbedPane()
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("jadeTabbedPane"));
	}
	/**
	 * JadeTabbedPane: with specific test context and state.
	 *		tabCount : 2
	 * 		.class : gov.wicourts.jade.gui.JadeTabbedPane
	 * 		.tabs : {Standard Text,Case Types  (0)}
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject jadeTabbedPane(TestObject anchor, long flags)
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("jadeTabbedPane"), anchor, flags);
	}

	/**
	 * OK: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeButton
	 * 		accessibleContext.accessibleName : OK
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok()
	{
		return new GuiTestObject(
                        getMappedTestObject("ok"));
	}
	/**
	 * OK: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeButton
	 * 		accessibleContext.accessibleName : OK
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok(TestObject anchor, long flags)
	{
		return new GuiTestObject(
                        getMappedTestObject("ok"), anchor, flags);
	}

	/**
	 * OK: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeOKButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : JadeOKButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok2()
	{
		return new GuiTestObject(
                        getMappedTestObject("ok2"));
	}
	/**
	 * OK: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeOKButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : JadeOKButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok2(TestObject anchor, long flags)
	{
		return new GuiTestObject(
                        getMappedTestObject("ok2"), anchor, flags);
	}

	/**
	 * OK: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeOKButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : JadeOKButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok3()
	{
		return new GuiTestObject(
                        getMappedTestObject("ok3"));
	}
	/**
	 * OK: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeOKButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : JadeOKButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok3(TestObject anchor, long flags)
	{
		return new GuiTestObject(
                        getMappedTestObject("ok3"), anchor, flags);
	}

	/**
	 * OK: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeOKButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : JadeOKButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok4()
	{
		return new GuiTestObject(
                        getMappedTestObject("ok4"));
	}
	/**
	 * OK: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeOKButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : JadeOKButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok4(TestObject anchor, long flags)
	{
		return new GuiTestObject(
                        getMappedTestObject("ok4"), anchor, flags);
	}

	/**
	 * OK: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeOKButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : JadeOKButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok5()
	{
		return new GuiTestObject(
                        getMappedTestObject("ok5"));
	}
	/**
	 * OK: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeOKButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : JadeOKButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok5(TestObject anchor, long flags)
	{
		return new GuiTestObject(
                        getMappedTestObject("ok5"), anchor, flags);
	}

	/**
	 * OK: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeOKButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : JadeOKButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok6()
	{
		return new GuiTestObject(
                        getMappedTestObject("ok6"));
	}
	/**
	 * OK: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeOKButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : JadeOKButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok6(TestObject anchor, long flags)
	{
		return new GuiTestObject(
                        getMappedTestObject("ok6"), anchor, flags);
	}

	/**
	 * OK: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeOKButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : JadeOKButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok7()
	{
		return new GuiTestObject(
                        getMappedTestObject("ok7"));
	}
	/**
	 * OK: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeOKButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : JadeOKButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok7(TestObject anchor, long flags)
	{
		return new GuiTestObject(
                        getMappedTestObject("ok7"), anchor, flags);
	}

	/**
	 * StandardTextCodeJTP: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeTable
	 * 		name : StandardTextCodeJTP
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject standardTextCodeJTP()
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("standardTextCodeJTP"));
	}
	/**
	 * StandardTextCodeJTP: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeTable
	 * 		name : StandardTextCodeJTP
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject standardTextCodeJTP(TestObject anchor, long flags)
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("standardTextCodeJTP"), anchor, flags);
	}

	/**
	 * StandardTextCodeText: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		.priorLabel : Standard Text Code:
	 * 		name : txtKey
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject standardTextCodeText()
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("standardTextCodeText"));
	}
	/**
	 * StandardTextCodeText: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		.priorLabel : Standard Text Code:
	 * 		name : txtKey
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject standardTextCodeText(TestObject anchor, long flags)
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("standardTextCodeText"), anchor, flags);
	}

	/**
	 * StandardTextCodeText: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		.priorLabel : Standard Text Code:
	 * 		name : txtKey
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject standardTextCodeText2()
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("standardTextCodeText2"));
	}
	/**
	 * StandardTextCodeText: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		.priorLabel : Standard Text Code:
	 * 		name : txtKey
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject standardTextCodeText2(TestObject anchor, long flags)
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("standardTextCodeText2"), anchor, flags);
	}

	/**
	 * StandardTextCodesList1: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeInternalFrame
	 * 		accessibleContext.accessibleName : Standard Text Codes... List 1
	 * 		title : Standard Text Codes... List 1
	 */
	protected InternalFrameTestObject standardTextCodesList1()
	{
		return new InternalFrameTestObject(
                        getMappedTestObject("standardTextCodesList1"));
	}
	/**
	 * StandardTextCodesList1: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeInternalFrame
	 * 		accessibleContext.accessibleName : Standard Text Codes... List 1
	 * 		title : Standard Text Codes... List 1
	 */
	protected InternalFrameTestObject standardTextCodesList1(TestObject anchor, long flags)
	{
		return new InternalFrameTestObject(
                        getMappedTestObject("standardTextCodesList1"), anchor, flags);
	}

	/**
	 * StandardTextCodesList1: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeInternalFrame
	 * 		accessibleContext.accessibleName : Standard Text Codes List 1
	 * 		title : Standard Text Codes List 1
	 */
	protected InternalFrameTestObject standardTextCodesList1_2()
	{
		return new InternalFrameTestObject(
                        getMappedTestObject("standardTextCodesList1_2"));
	}
	/**
	 * StandardTextCodesList1: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeInternalFrame
	 * 		accessibleContext.accessibleName : Standard Text Codes List 1
	 * 		title : Standard Text Codes List 1
	 */
	protected InternalFrameTestObject standardTextCodesList1_2(TestObject anchor, long flags)
	{
		return new InternalFrameTestObject(
                        getMappedTestObject("standardTextCodesList1_2"), anchor, flags);
	}

	/**
	 * StandardTextDescriptionText: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		.priorLabel : Description:
	 * 		name : descr
	 * 		.classIndex : 1
	 */
	protected TextGuiSubitemTestObject standardTextDescriptionText()
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("standardTextDescriptionText"));
	}
	/**
	 * StandardTextDescriptionText: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		.priorLabel : Description:
	 * 		name : descr
	 * 		.classIndex : 1
	 */
	protected TextGuiSubitemTestObject standardTextDescriptionText(TestObject anchor, long flags)
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("standardTextDescriptionText"), anchor, flags);
	}

	/**
	 * The Jade MLE Jade Text area with default state.
	 *		.class : gov.wicourts.jade.gui.JadeTextArea
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject standardTextTxtText()
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("standardTextTxtText"));
	}
	/**
	 * The Jade MLE Jade Text area with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeTextArea
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject standardTextTxtText(TestObject anchor, long flags)
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("standardTextTxtText"), anchor, flags);
	}

	/**
	 * Yes: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeButton
	 * 		accessibleContext.accessibleName : Yes
	 * 		.classIndex : 0
	 */
	protected GuiTestObject yes()
	{
		return new GuiTestObject(
                        getMappedTestObject("yes"));
	}
	/**
	 * Yes: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeButton
	 * 		accessibleContext.accessibleName : Yes
	 * 		.classIndex : 0
	 */
	protected GuiTestObject yes(TestObject anchor, long flags)
	{
		return new GuiTestObject(
                        getMappedTestObject("yes"), anchor, flags);
	}

	/**
	 * Locate and return the verification point Select_descr_text object in the SUT.
	 */
	protected IFtVerificationPoint Select_descr_textVP()
	{
		return vp("Select_descr_text");
	}
	protected IFtVerificationPoint Select_descr_textVP(TestObject anchor)
	{
		return vp("Select_descr_text", anchor);
	}

	/**
	 * Locate and return the verification point Select_txtKey_text object in the SUT.
	 */
	protected IFtVerificationPoint Select_txtKey_textVP()
	{
		return vp("Select_txtKey_text");
	}
	protected IFtVerificationPoint Select_txtKey_textVP(TestObject anchor)
	{
		return vp("Select_txtKey_text", anchor);
	}

	/**
	 * Locate and return the verification point Select_txt_text object in the SUT.
	 */
	protected IFtVerificationPoint Select_txt_textVP()
	{
		return vp("Select_txt_text");
	}
	protected IFtVerificationPoint Select_txt_textVP(TestObject anchor)
	{
		return vp("Select_txt_text", anchor);
	}

	/**
	 * Locate and return the verification point StandardTextCodeJTP_selecte object in the SUT.
	 */
	protected IFtVerificationPoint StandardTextCodeJTP_selecteVP()
	{
		return vp("StandardTextCodeJTP_selecte");
	}
	protected IFtVerificationPoint StandardTextCodeJTP_selecteVP(TestObject anchor)
	{
		return vp("StandardTextCodeJTP_selecte", anchor);
	}

	/**
	 * Locate and return the verification point StandardTextCodeJTP_selected object in the SUT.
	 */
	protected IFtVerificationPoint StandardTextCodeJTP_selectedVP()
	{
		return vp("StandardTextCodeJTP_selected");
	}
	protected IFtVerificationPoint StandardTextCodeJTP_selectedVP(TestObject anchor)
	{
		return vp("StandardTextCodeJTP_selected", anchor);
	}



	protected StdDataHelper()
	{
		setScriptName("StdData");
	}

}