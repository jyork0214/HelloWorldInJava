//  Class:  _Utilities
// Author:  James York
//   Date:  2/8/2022, 1:35:08 PM
package com.example.springboot;

import java.util.Date;
import java.sql.Timestamp;

public final class _Utilities
{
    // Public Data Members.
    public static final String OK = "OK";
    public static final String ER = "ER";
	public static final String NEW_LINE = "\r\n";
	public static final String NEW_LINE_HTML = "<br />";

	// Public Operations.
	public static String getCurrentTimestamp()
	{
        String methodName = "_Utilities.getCurrentTimestamp";
		String retVal = "";
		try
		{
			Date date= new Date();
			long time = date.getTime();
			Timestamp ts = new Timestamp(time);
			
			retVal += ts.toString();
			retVal += "  (" + methodName + ") ";
		}
		catch(Exception x)
		{ retVal = "ER:  " + x.getMessage() + "  (" + methodName + ") "; }
		return retVal;
	}
}  // END:  _Utilities

