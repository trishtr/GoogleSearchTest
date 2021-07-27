package com.google.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.XLUtilis.ReadConfig;
import com.google.pageObjects.HomePage;
import com.google.pageObjects.SearchResultsPage;

public class TC_Search_NonExKw_004 extends BaseClass {

	@Test
	public void NonexKeywordTest() {
		
		HomePage hp = new HomePage(driver);
		SearchResultsPage sp = new SearchResultsPage(driver);
		hp.searchKw(readconfig.getNonex_Keyword());
		if(sp.getSearchHeaderTxt().contains("did not match any documents."))
		{
			Assert.assertTrue(true);
			logger.info("Test is passed, no results for non existing keywords");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Test is failed, display results for non existing keywords");
		}
		
		
}
}
