package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController 
{
	// Intial entry point to this controller.
	@GetMapping("/")
	public String index() 
	{
		_Status status = new _Status();
		try
		{
			status.Success(_Status.OK + ":  " + _Utilities.getCurrentTimestamp() + _Utilities.NEW_LINE_HTML);
		}
		catch(Exception x)
		{ status.Error(x.getMessage() + "  (HelloController.index)"); }
		return status.getMessage();
	}

	// PRIVATE OPERATIONS.
	// NONE>
}
