package com.springboot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
	
	@RequestMapping("/home")
	
	public String home()
	{
		System.out.println("hi, welcome to my spring boot web application");
		return "home";
	}
}
