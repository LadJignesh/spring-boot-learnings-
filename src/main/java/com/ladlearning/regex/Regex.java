package com.ladlearning.regex;

public class Regex {
	
	private String textPassed;
	private String regexExtracted;
	
	public Regex() {	
	}
		
	public Regex(String textPassed, String regexExtracted) {
		super();
		this.textPassed = textPassed;
		this.regexExtracted = regexExtracted;
	}

	public String getTextPassed() {
		return textPassed;
	}
	public void setTextPassed(String textPassed) {
		this.textPassed = textPassed;
	}
	public String getRegexExtracted() {
		return regexExtracted;
	}
	public void setRegexExtracted(String regexExtracted) {
		this.regexExtracted = regexExtracted;
	}

}
