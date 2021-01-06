package com.ladlearning.regex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegexController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/regex")
	public String performGetRegex() {
		return "This is a simple regex service";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/regex")
	public Regex performRegex() {
		Regex regex = new Regex();
		regex.setRegexExtracted("Sad, Focused");
		regex.setTextPassed("Happily sad and focused");
		return regex;
	}

}
