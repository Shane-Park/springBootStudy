package com.shane.boot;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@RequestMapping(value="/", produces=MediaType.APPLICATION_JSON_VALUE)
	public String index() {
		return "Hello world!";
	}
}