package com.shane.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HtmlTest {
	
	@GetMapping("htmlTest")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("htmlTest");
		mav.addObject("message", "<h2>Hello</h2><p>world!</p>");
		
		return mav;
	}
	
	
}
