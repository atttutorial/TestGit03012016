package com.hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HelloWorldTest {
	
	@Test
	public static void main(){
		System.out.println("Login WorlD");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/search?q=Maven+Selenium&ie=utf-8&oe=utf-8&gws_rd=cr&ei=_46DVu7kO9GiuQTm4YGABA#q=Maven+Test+Ng");
	}

}
