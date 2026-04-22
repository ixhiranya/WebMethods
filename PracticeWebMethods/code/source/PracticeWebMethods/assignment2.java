package PracticeWebMethods;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class assignment2

{
	// ---( internal utility methods )---

	final static assignment2 _instance = new assignment2();

	static assignment2 _newInstance() { return new assignment2(); }

	static assignment2 _cast(Object o) { return (assignment2)o; }

	// ---( server methods )---




	public static final void monthlyIntrest (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(monthlyIntrest)>> ---
		// @sigtype java 3.5
		// [i] field:0:required R
		// [o] field:0:required r
		IDataCursor cursor = pipeline.getCursor();
		
		// Input
		String rStr = IDataUtil.getString(cursor, "R");
		
		// Convert to double
		double R = Double.parseDouble(rStr);
		
		// Logic: r = R / 1200
		double r = R / 1200;
		
		// Output
		IDataUtil.put(cursor, "r", r);
		
		cursor.destroy();
		// --- <<IS-END>> ---

                
	}



	public static final void power (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(power)>> ---
		// @sigtype java 3.5
		// [i] field:0:required base
		// [i] field:0:required exp
		// [o] field:0:required result
		IDataCursor cursor = pipeline.getCursor();
		
		// Get inputs
		String baseStr = IDataUtil.getString(cursor, "base");
		String expStr = IDataUtil.getString(cursor, "exp");
		
		double base = Double.parseDouble(baseStr);
		int exp = Integer.parseInt(expStr);
		
		double result = 1;
		
		for(int i = 1; i <= exp; i++) {
		    result = result * base;
		}
		
		IDataUtil.put(cursor, "result", result);
		cursor.destroy();
			
		// --- <<IS-END>> ---

                
	}
}

