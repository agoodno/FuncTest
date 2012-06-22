

import resources.DataBrowserCheckHelper;

import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

/**
 * Description   : Functional Test Script
 * @author agoodno
 */
public class DataBrowserCheck extends DataBrowserCheckHelper
{
	
	private static final String defaultSql = "select * from StdData";
		
	/**
	 * Script Name   : <b>DataBrowserCheck</b>
	 * Generated     : <b>Nov 24, 2006 1:29:09 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 5.0  Build 2195 (S)
	 * 
	 * @since  2006/11/24
	 * @author agoodno
	 */
	public void testMain(Object[] args) 
	{
		String sql = null;
		if (args.length == 0)
			sql = defaultSql;
		else
			sql = (String)args[0];
		
		startApp("databrowser");
		
		// Frame: DataBrowser
		textPlain().click(atPoint(484,107));
		jMenuBar().click(atPath("Database"));
		jMenuBar().click(atPath("Database->Recent Connections->ccap on Sybase JConnect55(127.0.0.1:5000/)"));
		
		// Frame: ccap on Sybase JConnect55(127.0.0.1:5000/)
		dataBrowser().inputChars(sql);
		dataBrowser().inputKeys("%q");
		// TabbedPage: StdData
		jTable().click(atCell(atRow("txtKey", "ANDY0", "descr", 
                              "Testing insert"), 
                        atColumn("txtKey")), 
                 atPoint(22,5));
		JTable_selectedVP().performTest();
		jMenuBar2().click(atPath("Database"));
		jMenuBar2().click(atPath("Database->Disconnect"));
		dataBrowser(ANY,MAY_EXIT).close();
	}
}
