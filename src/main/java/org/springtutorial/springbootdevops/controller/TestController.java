package org.springtutorial.springbootdevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = { "/test" })
public class TestController {
	
	@GetMapping("/display/message")
	public String displayMessage() {
		return "Hello World!!!";
	}

}
