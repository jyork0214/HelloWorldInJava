//  Class:  _Status
// Author:  James York
//   Date:  2/8/2022, 1:35:08 PM
package com.example.springboot;

public class _Status
{
    // Public Data Members.
    public static final String OK = "OK";
    public static final String ER = "ER";

	// Private Data Members.
	private String code = null;
	private String message = null;

	// Accessors.
	public String getCode() { return this.code; }
	public String getMessage() { return this.message; }

	// Mutators.
	public void setCode(String value) { this.code = value; } 
	public void setMessage(String value) { this.message = value; }

	//  Constructors.
	public _Status()
	{
		this.code = null;
		this.message = null;
	}

	// Public Operations.
	public void Reset()
	{
		this.code = ER;
		this.message = ER;
	}

	public void Success()
	{
		this.code = OK;
		this.message = OK;
	}

	public void Success(String msg)
	{
		this.code = OK;
		this.message = msg;
	}

	public void Error()
	{
		this.code = ER;
		this.message = ER;
	}

	public void Error(String msg)
	{
		this.code = ER;
		this.message = msg;
	}
}  // END:  _Status

