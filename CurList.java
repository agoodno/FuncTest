

import resources.CurListHelper;

import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

/**
 * 
 */
public class CurList extends CurListHelper
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
		checkCloseCaseMgmt();
		checkCloseLauncher();
	}
	
	/**
	 * @param args arguments passed in to this test
	 * @see RationalTestScript#testMain()
	 */
	public void testMain(Object[] args) 
	{
		// Frame: Washington County - Case Management - dev
		jadeMenuBar().click(atPath("View"));
		jadeMenuBar().click(atPath("View->Other->Court Official..."));
		
		// 
		ok().click();
		
		// Frame: Washington County - Case Management - dev
		ctofcJTP().drag(atCell(atRow("C.O. No.", "0870", "C.O. Type", 
                               "D", "Name", "Anderson, Bruce"), 
                         atColumn("C.O. Type")), 
                  atPoint(50,3), atCell(atRow(
                                        "C.O. No.", "1785", 
                                        "C.O. Type", "J", "Name", 
                                        "Anderson, John P."), 
                                        atColumn("C.O. Type")), 
                  atPoint(52,2));
		jadeMenuBar().click(atPath("File"));
		jadeMenuBar().click(atPath("File->Print..."));
		
		CtofcJTP_selectedVP().performTest();
		
		preview().click();
		
		// Frame: CCAP Document Previewer - CurList-0
		JLabel_icontextVP().performTest();
		documentPreviewer().close();
	}
}
