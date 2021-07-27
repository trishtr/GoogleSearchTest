package com.google.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.XLUtilis.ReadConfig;
import com.google.pageObjects.HomePage;
import com.google.pageObjects.SearchResultsPage;



public class TC_Search_MisspelledKw_003 extends BaseClass {

	@Test
	public void KwCorrectionTest() {
		
		HomePage hp = new HomePage(driver);
		SearchResultsPage rp = new SearchResultsPage(driver);
		
		hp.searchKw(readconfig.getMisspelled_Keyword());
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		String header = rp.getSearchHeaderTxt();
		
		if(header.contains("Showing results for " + readconfig.getCorrected_Keyword()) &&
			header.contains("Search instead for " + readconfig.getMisspelled_Keyword()))
		{
			Assert.assertTrue(true);
			logger.info("Test is passed, results suggested for corrected keywords");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Test is failed, no results for corrected keywords");
		}
		
	}
	
}
