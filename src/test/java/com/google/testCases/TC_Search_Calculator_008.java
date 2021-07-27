package com.google.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.pageObjects.HomePage;
import com.google.pageObjects.SearchResultsPage;

public class TC_Search_Calculator_008 extends BaseClass {


	@Test
	public void VideoSearchTest() {
		HomePage hp = new HomePage(driver);
		SearchResultsPage sp = new SearchResultsPage(driver);
		hp.searchKw(readconfig.getMath_Keyword());
	
		if(sp.getcalculatorHeader().equals("Calculator Result"))
		{
			Assert.assertTrue(true);
			logger.info("Calculator function works for mathematic keywords");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Calculator function does not work for mathematic keywords");
		}
		
}
}
