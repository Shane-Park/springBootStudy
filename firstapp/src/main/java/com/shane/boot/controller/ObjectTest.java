package com.shane.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ObjectTest {
	
	@GetMapping("objectTest")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("objectTest");
		DataObj obj = new DataObj(1,"shane","shane@value");
		mav.addObject("object", obj);
		
		return mav;
	}
	
	
}

class DataObj{
	
	public DataObj(int id, String name, String value) {
		super();
		this.id = id;
		this.name = name;
		this.value = value;
	}
	
	private int id;
	private String name;
	private String value;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}