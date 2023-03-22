package com.ins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","C:\\Users\\Admin\\eclipse-workspace\\Instagram\\driver\\chromedriver_win32.zip" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		//driver.quit();
		
		

	}

}
