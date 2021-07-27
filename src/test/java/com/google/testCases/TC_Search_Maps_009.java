package com.google.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.pageObjects.HomePage;
import com.google.pageObjects.SearchResultsPage;

public class TC_Search_Maps_009 extends BaseClass {
	@Test
	public void MapsSearchTest() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		SearchResultsPage sp = new SearchResultsPage(driver);
		hp.searchKw(readconfig.getSingle_Keyword());
		sp.clickmapsBtn();
		Thread.sleep(3000);
		if(driver.getTitle().contains("Google Maps"))
		{
			Assert.assertTrue(true);
			logger.info("Maps function displays");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Maps function do not display");
		}

}
}
