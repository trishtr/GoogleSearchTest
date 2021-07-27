package com.google.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.pageObjects.HomePage;

public class TC_Search_AutoSuggestions_001 extends BaseClass {

	@Test
	public void autoSuggestionsTest() throws InterruptedException {
		logger.info("Search for keyword");
		HomePage hp = new HomePage(driver);
		hp.sendKw(readconfig.getSingle_Keyword());
		Thread.sleep(5000);
					
		if(hp.sizeResultLst()== 10)
		{
			Assert.assertTrue(true);
			logger.info("Test is passed, The most 10 auto suggestions for keywords are displayed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Test is failed, The most 10 auto suggestions for keywords are not displayed");
		}
	}
}
	
	
	
	
	

