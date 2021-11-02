package com.companytools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/scraper")
@RequiredArgsConstructor
public class ScraperController {
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main() {
		return "crawler/main";
	}

}
