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
 * Script Name   : <b>CurList</b><br>
 * Generated     : <b>2006/11/22 10:37:33 AM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 2000 x86 5.0 <br>
 * 
 * @since  November 22, 2006
 * @author agoodno
 */
public abstract class CurListHelper extends gov.wicourts.functest.CCAPTestScript
{
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
	 * CourtOfficialList1: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeInternalFrame
	 * 		accessibleContext.accessibleName : RegularExpression(Court Official List \d)
	 * 		title : RegularExpression(Court Official List \d)
	 */
	protected InternalFrameTestObject courtOfficialList1() 
	{
		return new InternalFrameTestObject(
                        getMappedTestObject("courtOfficialList1"));
	}
	/**
	 * CourtOfficialList1: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeInternalFrame
	 * 		accessibleContext.accessibleName : RegularExpression(Court Official List \d)
	 * 		title : RegularExpression(Court Official List \d)
	 */
	protected InternalFrameTestObject courtOfficialList1(TestObject anchor, long flags) 
	{
		return new InternalFrameTestObject(
                        getMappedTestObject("courtOfficialList1"), anchor, flags);
	}
	
	/**
	 * CtofcJTP: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeTable
	 * 		name : CtofcJTP
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject ctofcJTP() 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("ctofcJTP"));
	}
	/**
	 * CtofcJTP: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeTable
	 * 		name : CtofcJTP
	 * 		.classIndex : 0
	 */
	protected GuiSubitemTestObject ctofcJTP(TestObject anchor, long flags) 
	{
		return new GuiSubitemTestObject(
                        getMappedTestObject("ctofcJTP"), anchor, flags);
	}
	
	/**
	 * DocumentPreviewer: with default state.
	 *		.captionText : RegularExpression(CCAP Document Previewer \- CurList\-\d)
	 * 		.class : us.wi.state.courts.ccap.printing.manager.DocumentPreviewer
	 * 		accessibleContext.accessibleName : RegularExpression(CCAP Document Previewer \- CurList\-\d)
	 */
	protected TopLevelTestObject documentPreviewer() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("documentPreviewer"));
	}
	/**
	 * DocumentPreviewer: with specific test context and state.
	 *		.captionText : RegularExpression(CCAP Document Previewer \- CurList\-\d)
	 * 		.class : us.wi.state.courts.ccap.printing.manager.DocumentPreviewer
	 * 		accessibleContext.accessibleName : RegularExpression(CCAP Document Previewer \- CurList\-\d)
	 */
	protected TopLevelTestObject documentPreviewer(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("documentPreviewer"), anchor, flags);
	}
	
	/**
	 * JLabel: with default state.
	 *		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : 
	 * 		iconDescription : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject jLabel() 
	{
		return new GuiTestObject(
                        getMappedTestObject("jLabel"));
	}
	/**
	 * JLabel: with specific test context and state.
	 *		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : 
	 * 		iconDescription : 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject jLabel(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("jLabel"), anchor, flags);
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
	 * Preview: with default state.
	 *		.class : gov.wicourts.jade.gui.HookButton
	 * 		accessibleContext.accessibleName : Preview...
	 * 		name : previewButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject preview() 
	{
		return new GuiTestObject(
                        getMappedTestObject("preview"));
	}
	/**
	 * Preview: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.HookButton
	 * 		accessibleContext.accessibleName : Preview...
	 * 		name : previewButton
	 * 		.classIndex : 0
	 */
	protected GuiTestObject preview(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("preview"), anchor, flags);
	}
	
	/**
	 * Locate and return the verification point CtofcJTP_selected object in the SUT.
	 */
	protected IFtVerificationPoint CtofcJTP_selectedVP() 
	{
		return vp("CtofcJTP_selected");
	}
	protected IFtVerificationPoint CtofcJTP_selectedVP(TestObject anchor)
	{
		return vp("CtofcJTP_selected", anchor);
	}
	
	/**
	 * Locate and return the verification point JLabel_icontext object in the SUT.
	 */
	protected IFtVerificationPoint JLabel_icontextVP() 
	{
		return vp("JLabel_icontext");
	}
	protected IFtVerificationPoint JLabel_icontextVP(TestObject anchor)
	{
		return vp("JLabel_icontext", anchor);
	}
	
	

	protected CurListHelper()
	{
		setScriptName("CurList");
	}
	
}