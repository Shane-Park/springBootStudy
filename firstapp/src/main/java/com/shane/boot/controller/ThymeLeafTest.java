package com.shane.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeLeafTest {
//	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
