package com.hacktohire.hcl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@GetMapping(path="/hello-world")  
	public String helloWorld()  
	{  
	return "Hello World";  
	}  
	
}
