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
 * Script Name   : <b>CheckMenu</b><br>
 * Generated     : <b>2006/11/22 10:36:49 AM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 2000 x86 5.0 <br>
 * 
 * @since  November 22, 2006
 * @author agoodno
 */
public abstract class CheckMenuHelper extends gov.wicourts.functest.CCAPTestScript
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
	 * Edit: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeMenu
	 * 		accessibleContext.accessibleName : Edit
	 * 		name : Edit
	 */
	protected ToggleGUITestObject edit() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("edit"));
	}
	/**
	 * Edit: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeMenu
	 * 		accessibleContext.accessibleName : Edit
	 * 		name : Edit
	 */
	protected ToggleGUITestObject edit(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("edit"), anchor, flags);
	}
	
	/**
	 * File: with default state.
	 *		.class : gov.wicourts.jade.gui.JadeMenu
	 * 		accessibleContext.accessibleName : File
	 * 		name : File
	 */
	protected ToggleGUITestObject file() 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("file"));
	}
	/**
	 * File: with specific test context and state.
	 *		.class : gov.wicourts.jade.gui.JadeMenu
	 * 		accessibleContext.accessibleName : File
	 * 		name : File
	 */
	protected ToggleGUITestObject file(TestObject anchor, long flags) 
	{
		return new ToggleGUITestObject(
                        getMappedTestObject("file"), anchor, flags);
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
	 * Locate and return the verification point Edit_menu object in the SUT.
	 */
	protected IFtVerificationPoint Edit_menuVP() 
	{
		return vp("Edit_menu");
	}
	protected IFtVerificationPoint Edit_menuVP(TestObject anchor)
	{
		return vp("Edit_menu", anchor);
	}
	
	/**
	 * Locate and return the verification point File_extendedMenu object in the SUT.
	 */
	protected IFtVerificationPoint File_extendedMenuVP() 
	{
		return vp("File_extendedMenu");
	}
	protected IFtVerificationPoint File_extendedMenuVP(TestObject anchor)
	{
		return vp("File_extendedMenu", anchor);
	}
	
	

	protected CheckMenuHelper()
	{
		setScriptName("CheckMenu");
	}
	
}