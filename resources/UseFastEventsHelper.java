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
 * Script Name   : <b>UseFastEvents</b><br>
 * Generated     : <b>2006/11/24 1:43:04 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 2000 x86 5.0 <br>
 * 
 * @since  November 24, 2006
 * @author agoodno
 */
public abstract class UseFastEventsHelper extends gov.wicourts.functest.CCAPTestScript
{
	/**
	 * _Text: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		.priorLabel : $
	 * 		name : eventAmt
	 * 		.classIndex : 5
	 */
	protected TextGuiSubitemTestObject _Text() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("_Text"));
	}
	/**
	 * _Text: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		.priorLabel : $
	 * 		name : eventAmt
	 * 		.classIndex : 5
	 */
	protected TextGuiSubitemTestObject _Text(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("_Text"), anchor, flags);
	}
	
	/**
	 * Case: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Case
	 * 		name : JB_Case
	 * 		iconDescription : Case.jpg
	 * 		.classIndex : 0
	 */
	protected GuiTestObject _case() 
	{
		return new GuiTestObject(
                        getMappedTestObject("_case"));
	}
	/**
	 * Case: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Case
	 * 		name : JB_Case
	 * 		iconDescription : Case.jpg
	 * 		.classIndex : 0
	 */
	protected GuiTestObject _case(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("_case"), anchor, flags);
	}
	
	/**
	 * Case: with default state.
	 *		.tabText : Case
	 * 		.class : us.wi.state.courts.jade.client.caseapp.Case
	 * 		name : CaseTP
	 */
	protected GuiTestObject _case2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("_case2"));
	}
	/**
	 * Case: with specific test context and state.
	 *		.tabText : Case
	 * 		.class : us.wi.state.courts.jade.client.caseapp.Case
	 * 		name : CaseTP
	 */
	protected GuiTestObject _case2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("_case2"), anchor, flags);
	}
	
	/**
	 * AdditionalTextText: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		.priorLabel : Additional Text:
	 * 		name : eventDate
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject additionalTextText() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("additionalTextText"));
	}
	/**
	 * AdditionalTextText: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		.priorLabel : Additional Text:
	 * 		name : eventDate
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject additionalTextText(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("additionalTextText"), anchor, flags);
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
	 * CaseList1: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeInternalFrame
	 * 		accessibleContext.accessibleName : RegularExpression(Case List \d)
	 * 		title : RegularExpression(Case List \d)
	 */
	protected InternalFrameTestObject caseList1() 
	{
		return new InternalFrameTestObject(
                        getMappedTestObject("caseList1"));
	}
	/**
	 * CaseList1: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeInternalFrame
	 * 		accessibleContext.accessibleName : RegularExpression(Case List \d)
	 * 		title : RegularExpression(Case List \d)
	 */
	protected InternalFrameTestObject caseList1(TestObject anchor, long flags) 
	{
		return new InternalFrameTestObject(
                        getMappedTestObject("caseList1"), anchor, flags);
	}
	
	/**
	 * caseNo: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : caseNo
	 * 		.classIndex : 1
	 */
	protected TextGuiSubitemTestObject caseNo() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("caseNo"));
	}
	/**
	 * caseNo: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : caseNo
	 * 		.classIndex : 1
	 */
	protected TextGuiSubitemTestObject caseNo(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("caseNo"), anchor, flags);
	}
	
	/**
	 * CaseTabbedPane: with default state.
	 *		tabCount : 10
	 * 		.class : gov.wicourts.jade.gui.JadeTabbedPane
	 * 		.tabs : {Case,Parties,Citations,Charges,Assess,Receipts/Receivables,Judgments,Payables,D ...
	 * 		name : CaseTabbedPane
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject caseTabbedPane() 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("caseTabbedPane"));
	}
	/**
	 * CaseTabbedPane: with specific test context and state.
	 *		tabCount : 10
	 * 		.class : gov.wicourts.jade.gui.JadeTabbedPane
	 * 		.tabs : {Case,Parties,Citations,Charges,Assess,Receipts/Receivables,Judgments,Payables,D ...
	 * 		name : CaseTabbedPane
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject caseTabbedPane(TestObject anchor, long flags) 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("caseTabbedPane"), anchor, flags);
	}
	
	/**
	 * courtRecordJTP: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeTable
	 * 		.priorLabel : Branch:
	 * 		name : courtRecordJTP
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject courtRecordJTP() 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("courtRecordJTP"));
	}
	/**
	 * courtRecordJTP: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeTable
	 * 		.priorLabel : Branch:
	 * 		name : courtRecordJTP
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject courtRecordJTP(TestObject anchor, long flags) 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("courtRecordJTP"), anchor, flags);
	}
	
	/**
	 * courtRptrCode: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeDropBox
	 * 		name : courtRptrCode
	 * 		.classIndex : 2
	 */
	protected GuiTestObject courtRptrCode() 
	{
		return new GuiTestObject(
                        getMappedTestObject("courtRptrCode"));
	}
	/**
	 * courtRptrCode: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeDropBox
	 * 		name : courtRptrCode
	 * 		.classIndex : 2
	 */
	protected GuiTestObject courtRptrCode(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("courtRptrCode"), anchor, flags);
	}
	
	/**
	 * courtRptrCodeButton: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeArrowButton
	 * 		accessibleContext.accessibleName : 
	 * 		name : courtRptrCode.button
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject courtRptrCodeButton() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("courtRptrCodeButton"));
	}
	/**
	 * courtRptrCodeButton: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeArrowButton
	 * 		accessibleContext.accessibleName : 
	 * 		name : courtRptrCode.button
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject courtRptrCodeButton(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("courtRptrCodeButton"), anchor, flags);
	}
	
	/**
	 * courtRptrCodeCodeField: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : courtRptrCode.codeField
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject courtRptrCodeCodeField() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("courtRptrCodeCodeField"));
	}
	/**
	 * courtRptrCodeCodeField: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : courtRptrCode.codeField
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject courtRptrCodeCodeField(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("courtRptrCodeCodeField"), anchor, flags);
	}
	
	/**
	 * courtRptrCodeTranField: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : courtRptrCode.tranField
	 * 		.classIndex : 1
	 */
	protected TextGuiSubitemTestObject courtRptrCodeTranField() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("courtRptrCodeTranField"));
	}
	/**
	 * courtRptrCodeTranField: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : courtRptrCode.tranField
	 * 		.classIndex : 1
	 */
	protected TextGuiSubitemTestObject courtRptrCodeTranField(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("courtRptrCodeTranField"), anchor, flags);
	}
	
	/**
	 * ctofcNo: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeDropBox
	 * 		name : ctofcNo
	 * 		.classIndex : 1
	 */
	protected GuiTestObject ctofcNo() 
	{
		return new GuiTestObject(
                        getMappedTestObject("ctofcNo"));
	}
	/**
	 * ctofcNo: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeDropBox
	 * 		name : ctofcNo
	 * 		.classIndex : 1
	 */
	protected GuiTestObject ctofcNo(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("ctofcNo"), anchor, flags);
	}
	
	/**
	 * ctofcNoButton: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeArrowButton
	 * 		accessibleContext.accessibleName : 
	 * 		name : ctofcNo.button
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject ctofcNoButton() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("ctofcNoButton"));
	}
	/**
	 * ctofcNoButton: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeArrowButton
	 * 		accessibleContext.accessibleName : 
	 * 		name : ctofcNo.button
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject ctofcNoButton(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("ctofcNoButton"), anchor, flags);
	}
	
	/**
	 * ctofcNoCodeField: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : ctofcNo.codeField
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject ctofcNoCodeField() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("ctofcNoCodeField"));
	}
	/**
	 * ctofcNoCodeField: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : ctofcNo.codeField
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject ctofcNoCodeField(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("ctofcNoCodeField"), anchor, flags);
	}
	
	/**
	 * ctofcNoTranField: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : ctofcNo.tranField
	 * 		.classIndex : 1
	 */
	protected TextGuiSubitemTestObject ctofcNoTranField() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("ctofcNoTranField"));
	}
	/**
	 * ctofcNoTranField: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : ctofcNo.tranField
	 * 		.classIndex : 1
	 */
	protected TextGuiSubitemTestObject ctofcNoTranField(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("ctofcNoTranField"), anchor, flags);
	}
	
	/**
	 * dispEvent: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeDropBox
	 * 		.priorLabel : Disposition
	 * 		name : dispEvent
	 * 		.classIndex : 5
	 */
	protected GuiTestObject dispEvent() 
	{
		return new GuiTestObject(
                        getMappedTestObject("dispEvent"));
	}
	/**
	 * dispEvent: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeDropBox
	 * 		.priorLabel : Disposition
	 * 		name : dispEvent
	 * 		.classIndex : 5
	 */
	protected GuiTestObject dispEvent(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("dispEvent"), anchor, flags);
	}
	
	/**
	 * dispEventButton: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeArrowButton
	 * 		accessibleContext.accessibleName : 
	 * 		name : dispEvent.button
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject dispEventButton() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("dispEventButton"));
	}
	/**
	 * dispEventButton: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeArrowButton
	 * 		accessibleContext.accessibleName : 
	 * 		name : dispEvent.button
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject dispEventButton(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("dispEventButton"), anchor, flags);
	}
	
	/**
	 * dispEventCodeField: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : dispEvent.codeField
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject dispEventCodeField() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("dispEventCodeField"));
	}
	/**
	 * dispEventCodeField: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : dispEvent.codeField
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject dispEventCodeField(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("dispEventCodeField"), anchor, flags);
	}
	
	/**
	 * dispEventTranField: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : dispEvent.tranField
	 * 		.classIndex : 1
	 */
	protected TextGuiSubitemTestObject dispEventTranField() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("dispEventTranField"));
	}
	/**
	 * dispEventTranField: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : dispEvent.tranField
	 * 		.classIndex : 1
	 */
	protected TextGuiSubitemTestObject dispEventTranField(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("dispEventTranField"), anchor, flags);
	}
	
	/**
	 * dktTxt: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeMle
	 * 		name : dktTxt
	 * 		.classIndex : 0
	 */
	protected GuiTestObject dktTxt() 
	{
		return new GuiTestObject(
                        getMappedTestObject("dktTxt"));
	}
	/**
	 * dktTxt: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeMle
	 * 		name : dktTxt
	 * 		.classIndex : 0
	 */
	protected GuiTestObject dktTxt(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("dktTxt"), anchor, flags);
	}
	
	/**
	 * eventType: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeDropBox
	 * 		.priorLabel : RegularExpression(State of Wisconsin vs\. .*)
	 * 		name : eventType
	 * 		.classIndex : 0
	 */
	protected GuiTestObject eventType() 
	{
		return new GuiTestObject(
                        getMappedTestObject("eventType"));
	}
	/**
	 * eventType: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeDropBox
	 * 		.priorLabel : RegularExpression(State of Wisconsin vs\. .*)
	 * 		name : eventType
	 * 		.classIndex : 0
	 */
	protected GuiTestObject eventType(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("eventType"), anchor, flags);
	}
	
	/**
	 * eventTypeButton: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeArrowButton
	 * 		accessibleContext.accessibleName : 
	 * 		name : eventType.button
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject eventTypeButton() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("eventTypeButton"));
	}
	/**
	 * eventTypeButton: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeArrowButton
	 * 		accessibleContext.accessibleName : 
	 * 		name : eventType.button
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject eventTypeButton(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("eventTypeButton"), anchor, flags);
	}
	
	/**
	 * eventTypeCodeField: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : eventType.codeField
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject eventTypeCodeField() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("eventTypeCodeField"));
	}
	/**
	 * eventTypeCodeField: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : eventType.codeField
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject eventTypeCodeField(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("eventTypeCodeField"), anchor, flags);
	}
	
	/**
	 * eventTypeTranField: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : eventType.tranField
	 * 		.classIndex : 1
	 */
	protected TextGuiSubitemTestObject eventTypeTranField() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("eventTypeTranField"));
	}
	/**
	 * eventTypeTranField: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : eventType.tranField
	 * 		.classIndex : 1
	 */
	protected TextGuiSubitemTestObject eventTypeTranField(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("eventTypeTranField"), anchor, flags);
	}
	
	/**
	 * FastEvent: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeInternalFrame
	 * 		accessibleContext.accessibleName : Fast Event
	 * 		title : Fast Event
	 */
	protected InternalFrameTestObject fastEvent() 
	{
		return new InternalFrameTestObject(
                        getMappedTestObject("fastEvent"));
	}
	/**
	 * FastEvent: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeInternalFrame
	 * 		accessibleContext.accessibleName : Fast Event
	 * 		title : Fast Event
	 */
	protected InternalFrameTestObject fastEvent(TestObject anchor, long flags) 
	{
		return new InternalFrameTestObject(
                        getMappedTestObject("fastEvent"), anchor, flags);
	}
	
	/**
	 * InquiryCase: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeInternalFrame
	 * 		accessibleContext.accessibleName : RegularExpression(Inquiry \- Case\: [a-zA-Z0-9])
	 * 		title : RegularExpression(Inquiry \- Case\: [a-zA-Z0-9])
	 */
	protected InternalFrameTestObject inquiryCase() 
	{
		return new InternalFrameTestObject(
                        getMappedTestObject("inquiryCase"));
	}
	/**
	 * InquiryCase: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeInternalFrame
	 * 		accessibleContext.accessibleName : RegularExpression(Inquiry \- Case\: [a-zA-Z0-9])
	 * 		title : RegularExpression(Inquiry \- Case\: [a-zA-Z0-9])
	 */
	protected InternalFrameTestObject inquiryCase(TestObject anchor, long flags) 
	{
		return new InternalFrameTestObject(
                        getMappedTestObject("inquiryCase"), anchor, flags);
	}
	
	/**
	 * JScrollPane: with default state.
	 *		.class : javax.swing.JScrollPane
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject jScrollPane() 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("jScrollPane"));
	}
	/**
	 * JScrollPane: with specific test context and state.
	 *		.class : javax.swing.JScrollPane
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject jScrollPane(TestObject anchor, long flags) 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("jScrollPane"), anchor, flags);
	}
	
	/**
	 * JScrollPane: with default state.
	 *		.class : javax.swing.JScrollPane
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject jScrollPane2() 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("jScrollPane2"));
	}
	/**
	 * JScrollPane: with specific test context and state.
	 *		.class : javax.swing.JScrollPane
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject jScrollPane2(TestObject anchor, long flags) 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("jScrollPane2"), anchor, flags);
	}
	
	/**
	 * JadeDialog: with default state.
	 *		.captionText : New - Case Selection
	 * 		.class : gov.wicourts.jade.gui.JadeDialog
	 */
	protected TopLevelTestObject jadeDialog() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("jadeDialog"));
	}
	/**
	 * JadeDialog: with specific test context and state.
	 *		.captionText : New - Case Selection
	 * 		.class : gov.wicourts.jade.gui.JadeDialog
	 */
	protected TopLevelTestObject jadeDialog(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("jadeDialog"), anchor, flags);
	}
	
	/**
	 * JadeFrame: with default state.
	 *		.captionText : RegularExpression(.* County \- Court Applications \- .*)
	 * 		.class : gov.wicourts.jade.gui.JadeFrame
	 * 		accessibleContext.accessibleName : RegularExpression(.* County \- Court Applications \- .*)
	 */
	protected TopLevelTestObject jadeFrame() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("jadeFrame"));
	}
	/**
	 * JadeFrame: with specific test context and state.
	 *		.captionText : RegularExpression(.* County \- Court Applications \- .*)
	 * 		.class : gov.wicourts.jade.gui.JadeFrame
	 * 		accessibleContext.accessibleName : RegularExpression(.* County \- Court Applications \- .*)
	 */
	protected TopLevelTestObject jadeFrame(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("jadeFrame"), anchor, flags);
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
	 * JadeTextArea: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeTextArea
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject jadeTextArea() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("jadeTextArea"));
	}
	/**
	 * JadeTextArea: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeTextArea
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject jadeTextArea(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("jadeTextArea"), anchor, flags);
	}
	
	/**
	 * OK: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeOKButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : JadeOKButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok() 
	{
		return new GuiTestObject(
                        getMappedTestObject("ok"));
	}
	/**
	 * OK: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeOKButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : JadeOKButton
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
	 * Special: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeMenu
	 * 		accessibleContext.accessibleName : Special
	 * 		name : Special
	 */
	protected ToggleGUITestObject special() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("special"));
	}
	/**
	 * Special: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeMenu
	 * 		accessibleContext.accessibleName : Special
	 * 		name : Special
	 */
	protected ToggleGUITestObject special(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("special"), anchor, flags);
	}
	
	/**
	 * StateOfWisconsinVs: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeProtectedField
	 * 		accessibleContext.accessibleName : RegularExpression(State of Wisconsin vs\. .*)
	 * 		name : caption
	 * 		.classIndex : 0
	 */
	protected GuiTestObject stateOfWisconsinVs() 
	{
		return new GuiTestObject(
                        getMappedTestObject("stateOfWisconsinVs"));
	}
	/**
	 * StateOfWisconsinVs: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeProtectedField
	 * 		accessibleContext.accessibleName : RegularExpression(State of Wisconsin vs\. .*)
	 * 		name : caption
	 * 		.classIndex : 0
	 */
	protected GuiTestObject stateOfWisconsinVs(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("stateOfWisconsinVs"), anchor, flags);
	}
	
	/**
	 * tag: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : tag
	 * 		.classIndex : 2
	 */
	protected TextGuiSubitemTestObject tag() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("tag"));
	}
	/**
	 * tag: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : tag
	 * 		.classIndex : 2
	 */
	protected TextGuiSubitemTestObject tag(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("tag"), anchor, flags);
	}
	
	/**
	 * tapeCounterNo: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : tapeCounterNo
	 * 		.classIndex : 3
	 */
	protected TextGuiSubitemTestObject tapeCounterNo() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("tapeCounterNo"));
	}
	/**
	 * tapeCounterNo: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : tapeCounterNo
	 * 		.classIndex : 3
	 */
	protected TextGuiSubitemTestObject tapeCounterNo(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("tapeCounterNo"), anchor, flags);
	}
	
	/**
	 * txtKey: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeDropBox
	 * 		name : txtKey
	 * 		.classIndex : 3
	 */
	protected GuiTestObject txtKey() 
	{
		return new GuiTestObject(
                        getMappedTestObject("txtKey"));
	}
	/**
	 * txtKey: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeDropBox
	 * 		name : txtKey
	 * 		.classIndex : 3
	 */
	protected GuiTestObject txtKey(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("txtKey"), anchor, flags);
	}
	
	/**
	 * txtKeyButton: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeArrowButton
	 * 		accessibleContext.accessibleName : 
	 * 		name : txtKey.button
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject txtKeyButton() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("txtKeyButton"));
	}
	/**
	 * txtKeyButton: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeArrowButton
	 * 		accessibleContext.accessibleName : 
	 * 		name : txtKey.button
	 * 		.classIndex : 0
	 */
	protected ToggleGUITestObject txtKeyButton(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("txtKeyButton"), anchor, flags);
	}
	
	/**
	 * txtKeyCodeField: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : txtKey.codeField
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject txtKeyCodeField() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("txtKeyCodeField"));
	}
	/**
	 * txtKeyCodeField: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : txtKey.codeField
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject txtKeyCodeField(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("txtKeyCodeField"), anchor, flags);
	}
	
	/**
	 * txtKeyTranField: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : txtKey.tranField
	 * 		.classIndex : 1
	 */
	protected TextGuiSubitemTestObject txtKeyTranField() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("txtKeyTranField"));
	}
	/**
	 * txtKeyTranField: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeEntryField
	 * 		name : txtKey.tranField
	 * 		.classIndex : 1
	 */
	protected TextGuiSubitemTestObject txtKeyTranField(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("txtKeyTranField"), anchor, flags);
	}
	
	/**
	 * Locate and return the verification point caseHist_selected object in the SUT.
	 */
	protected IFtVerificationPoint caseHist_selectedVP() 
	{
		return vp("caseHist_selected");
	}
	protected IFtVerificationPoint caseHist_selectedVP(TestObject anchor)
	{
		return vp("caseHist_selected", anchor);
	}
	
	/**
	 * Locate and return the verification point caseNo_text object in the SUT.
	 */
	protected IFtVerificationPoint caseNo_textVP() 
	{
		return vp("caseNo_text");
	}
	protected IFtVerificationPoint caseNo_textVP(TestObject anchor)
	{
		return vp("caseNo_text", anchor);
	}
	
	/**
	 * Locate and return the verification point courtRecordJTP_selected object in the SUT.
	 */
	protected IFtVerificationPoint courtRecordJTP_selectedVP() 
	{
		return vp("courtRecordJTP_selected");
	}
	protected IFtVerificationPoint courtRecordJTP_selectedVP(TestObject anchor)
	{
		return vp("courtRecordJTP_selected", anchor);
	}
	
	/**
	 * Locate and return the verification point courtRptrCode_standard object in the SUT.
	 */
	protected IFtVerificationPoint courtRptrCode_standardVP() 
	{
		return vp("courtRptrCode_standard");
	}
	protected IFtVerificationPoint courtRptrCode_standardVP(TestObject anchor)
	{
		return vp("courtRptrCode_standard", anchor);
	}
	
	/**
	 * Locate and return the verification point ctofcNoCodeField_text object in the SUT.
	 */
	protected IFtVerificationPoint ctofcNoCodeField_textVP() 
	{
		return vp("ctofcNoCodeField_text");
	}
	protected IFtVerificationPoint ctofcNoCodeField_textVP(TestObject anchor)
	{
		return vp("ctofcNoCodeField_text", anchor);
	}
	
	/**
	 * Locate and return the verification point ctofcNo_standard object in the SUT.
	 */
	protected IFtVerificationPoint ctofcNo_standardVP() 
	{
		return vp("ctofcNo_standard");
	}
	protected IFtVerificationPoint ctofcNo_standardVP(TestObject anchor)
	{
		return vp("ctofcNo_standard", anchor);
	}
	
	/**
	 * Locate and return the verification point DataSetViewerTablePanelMyJT_2 object in the SUT.
	 */
	protected IFtVerificationPoint DataSetViewerTablePanelMyJT_2VP() 
	{
		return vp("DataSetViewerTablePanelMyJT_2");
	}
	protected IFtVerificationPoint DataSetViewerTablePanelMyJT_2VP(TestObject anchor)
	{
		return vp("DataSetViewerTablePanelMyJT_2", anchor);
	}
	
	/**
	 * Locate and return the verification point dispEvent_standard object in the SUT.
	 */
	protected IFtVerificationPoint dispEvent_standardVP() 
	{
		return vp("dispEvent_standard");
	}
	protected IFtVerificationPoint dispEvent_standardVP(TestObject anchor)
	{
		return vp("dispEvent_standard", anchor);
	}
	
	/**
	 * Locate and return the verification point eventAmt_text object in the SUT.
	 */
	protected IFtVerificationPoint eventAmt_textVP() 
	{
		return vp("eventAmt_text");
	}
	protected IFtVerificationPoint eventAmt_textVP(TestObject anchor)
	{
		return vp("eventAmt_text", anchor);
	}
	
	/**
	 * Locate and return the verification point eventDate_selected object in the SUT.
	 */
	protected IFtVerificationPoint eventDate_selectedVP() 
	{
		return vp("eventDate_selected");
	}
	protected IFtVerificationPoint eventDate_selectedVP(TestObject anchor)
	{
		return vp("eventDate_selected", anchor);
	}
	
	/**
	 * Locate and return the verification point eventType_standard object in the SUT.
	 */
	protected IFtVerificationPoint eventType_standardVP() 
	{
		return vp("eventType_standard");
	}
	protected IFtVerificationPoint eventType_standardVP(TestObject anchor)
	{
		return vp("eventType_standard", anchor);
	}
	
	/**
	 * Locate and return the verification point JadeTextArea_text object in the SUT.
	 */
	protected IFtVerificationPoint JadeTextArea_textVP() 
	{
		return vp("JadeTextArea_text");
	}
	protected IFtVerificationPoint JadeTextArea_textVP(TestObject anchor)
	{
		return vp("JadeTextArea_text", anchor);
	}
	
	/**
	 * Locate and return the verification point Special_menu object in the SUT.
	 */
	protected IFtVerificationPoint Special_menuVP() 
	{
		return vp("Special_menu");
	}
	protected IFtVerificationPoint Special_menuVP(TestObject anchor)
	{
		return vp("Special_menu", anchor);
	}
	
	/**
	 * Locate and return the verification point StateOfWisconsinVs object in the SUT.
	 */
	protected IFtVerificationPoint StateOfWisconsinVsVP() 
	{
		return vp("StateOfWisconsinVs");
	}
	protected IFtVerificationPoint StateOfWisconsinVsVP(TestObject anchor)
	{
		return vp("StateOfWisconsinVs", anchor);
	}
	
	/**
	 * Locate and return the verification point tag_text object in the SUT.
	 */
	protected IFtVerificationPoint tag_textVP() 
	{
		return vp("tag_text");
	}
	protected IFtVerificationPoint tag_textVP(TestObject anchor)
	{
		return vp("tag_text", anchor);
	}
	
	/**
	 * Locate and return the verification point tapeCounterNo_text object in the SUT.
	 */
	protected IFtVerificationPoint tapeCounterNo_textVP() 
	{
		return vp("tapeCounterNo_text");
	}
	protected IFtVerificationPoint tapeCounterNo_textVP(TestObject anchor)
	{
		return vp("tapeCounterNo_text", anchor);
	}
	
	/**
	 * Locate and return the verification point txtKey_standard object in the SUT.
	 */
	protected IFtVerificationPoint txtKey_standardVP() 
	{
		return vp("txtKey_standard");
	}
	protected IFtVerificationPoint txtKey_standardVP(TestObject anchor)
	{
		return vp("txtKey_standard", anchor);
	}
	
	

	protected UseFastEventsHelper()
	{
		setScriptName("UseFastEvents");
	}
	
}