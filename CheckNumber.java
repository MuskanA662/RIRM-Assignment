package com.muskan.numberCheckapp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNumber {
	public static void main(String args[]) {
		String[] phoneNumbers= {"2124567890","212-456-7890","(212)456-7890","(212)-456-7890","212.456.7890","212 456 7890","+12124567890","+12124567890","+1 212.456.7890","+212-456-7890","1-212-456-7890"};
for(String phoneNumber:phoneNumbers) {
	validatePhoneNumber(phoneNumber);
}
}
private static void validatePhoneNumber(String phoneNumber) {
	Pattern pattern = Pattern.compile("^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]\\d{3}[\\s.-]\\d{4}$");
	Matcher matcher = pattern.matcher(phoneNumber);
	if(matcher.matches()) {
		System.out.println(phoneNumber + "=valid number");
	}
	else {
		System.out.println(phoneNumber + "=Invalid number");
	}
	
}
}

