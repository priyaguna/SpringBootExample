package com.sakha.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	
	@RequestMapping("/")
	public String showHelloPage(){
		return "Home"; 
	}  
}   
