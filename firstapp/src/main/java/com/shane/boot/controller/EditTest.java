package com.shane.boot.controller;

import javax.transaction.Transactional;

import com.shane.boot.Member;
import com.shane.boot.repositories.MyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

// @Controller
public class EditTest {

	@Autowired
	MyRepository repository;
	
	@GetMapping("/edit/{id}")
	public ModelAndView editForm(
		ModelAndView mav
		,@ModelAttribute("formModel") Member member
		,@PathVariable long id) {

		mav.setViewName("editTest");
		member = repository.findById(id);
		mav.addObject("formModel", member);

		return mav;
	}

	@PostMapping("/edit")
	@Transactional
	public ModelAndView update(
		@ModelAttribute("formModel") Member member
		,ModelAndView mav){
		
		repository.saveAndFlush(member);
		return new ModelAndView("redirect:/repository");

	}

	@PostMapping("/delete")
	@Transactional
	public ModelAndView remove(@RequestParam long id){
			repository.deleteById(id);
			return new ModelAndView("redirect:/repository");
	}

	
	
}
