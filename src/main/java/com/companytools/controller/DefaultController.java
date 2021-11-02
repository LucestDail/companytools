package com.companytools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class DefaultController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String main() {
		return "main/main";
	}

}
