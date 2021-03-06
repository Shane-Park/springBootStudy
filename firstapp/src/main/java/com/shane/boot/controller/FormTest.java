package com.shane.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormTest {
	
//	@GetMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.addObject("msg", "please type your name");
		mav.setViewName("formTemplate");
		return mav;
	}
	
//	@PostMapping("/")
	public ModelAndView form(
			@RequestParam("text")String text
			,ModelAndView mav) {
		mav.addObject("msg", String.format("welcome %s", text));
		mav.addObject("value", text);
		mav.setViewName("formTemplate");
		return mav;
	}
	
	
}
