package com.google.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.pageObjects.HomePage;
import com.google.pageObjects.SearchResultsPage;

public class TC_Search_MathKw_005 extends BaseClass {
 @Test
 public void MathKwTest() {
	 HomePage hp = new HomePage(driver);
	 SearchResultsPage sp = new SearchResultsPage(driver);
	 hp.searchKw(readconfig.getMath_Keyword());
	 if(sp.getcalculatorHeader().contains("Calculator Result"))
	 {
		 Assert.assertTrue(true);
		 logger.info("Calculator works for math keywords");
	 }
	 else
	 {
		 Assert.assertTrue(false);
		 logger.info("Calculator does not work for math keywords");
	 }
	 
	 
 }
}
