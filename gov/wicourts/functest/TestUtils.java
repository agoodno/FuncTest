/*
 * Copyright (c) 2006 Consolidated Court Automation Programs.
 * All rights reserved.
 */
package gov.wicourts.functest;

import java.util.HashMap;
import java.util.Map;

/**
 * TestUtils
 */
public final class TestUtils {

	public static Map _colLengths = new HashMap();
	
    static
	{
    	_colLengths.put("CASE_NO", new Integer(14));
    	_colLengths.put("EVENT_TYPE", new Integer(5));
    	_colLengths.put("STD_TXT_CODE", new Integer(5));
    	_colLengths.put("STD_TXT_DESC", new Integer(20));
    	_colLengths.put("TXT_TYPE_DESC", new Integer(45));
    	_colLengths.put("USER_ID", new Integer(8));
	}
    
	public static Object checkQuotes(Object obj)
    {
        if (obj instanceof String)
            return "'" + obj.toString() + "'";
        return obj;
    }
    
    public static String formatRepl(String str)
    {
        return "[" + str + "]";
    }
    
    public static String pad(String colName, String colValue)
    {
    	int colLength = colValue.length();
    	if (_colLengths.containsKey(colName))
    		colLength = ((Integer)_colLengths.get(colName)).intValue();
    	
    	String paddedStr = colValue;
    	if (colLength > 0)
    	{
    		StringBuffer sb = new StringBuffer();
    		for (int i = colValue.length(); i < colLength; i++)
    			sb.append(" ");
    		paddedStr += sb.toString();
    	}
        return paddedStr;
    }
}
