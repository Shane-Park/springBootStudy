package com.shane.boot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnTest {
	@RequestMapping("/returntest/{num1}/{num2}")
	public int[] addOperator(
			@PathVariable int num1
			,@PathVariable int num2) {
		int[] answer = new int[] {num1, num2};
		return answer;
	}
}
