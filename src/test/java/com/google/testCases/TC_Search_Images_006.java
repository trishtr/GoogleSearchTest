package com.google.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.pageObjects.HomePage;
import com.google.pageObjects.SearchResultsPage;

public class TC_Search_Images_006 extends BaseClass {

	@Test
	public void ImageSearchTest() {
		HomePage hp = new HomePage(driver);
		SearchResultsPage sp = new SearchResultsPage(driver);
		hp.searchKw(readconfig.getSingle_Keyword());
		sp.clickimagesBtn();
		if(sp.getImagesLst().size() != 0)
		{
			Assert.assertTrue(true);
			logger.info("Image results displays");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Image resultls do not display");
		}
		
	}
}
