package com.example.javaBasedConf;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;

import org.junit.jupiter.api.Test;

class FreeTest {

	@Test
	void test() {
String keyword = "ali";
keyword = keyword.replaceAll("\\s+", " ");
	
Pattern firstCharPattern = Pattern.compile("\\A[A-Za-z0-9ğüşöçıİĞÜŞÖÇ+]");
Matcher firstCharMatcher = firstCharPattern.matcher(keyword);

Pattern validPattern = Pattern.compile("[^\\w @üÜşŞğĞöÖçÇıİ.+-]");
Matcher validMatcher = validPattern.matcher(keyword);

Boolean firstCharTest = firstCharMatcher.find();
Boolean validTest = validMatcher.find();
	
//		if(firstCharTest) {
//			System.out.println("First char is okay!");
//		}
//		
//		if(!validTest) {
//			System.out.println("Rest is okay!");
//		}
		
		if(firstCharTest && !validTest && keyword.length()>2) {
			System.out.println("Test is Okay!");
		}
		
		System.out.println("input is: '" + keyword + "'");
	}

}
