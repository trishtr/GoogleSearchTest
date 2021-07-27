package com.google.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.pageObjects.HomePage;
import com.google.pageObjects.SearchResultsPage;

public class TC_Search_Videos_007 extends BaseClass {

	@Test
	public void VideoSearchTest() {
		HomePage hp = new HomePage(driver);
		SearchResultsPage sp = new SearchResultsPage(driver);
		hp.searchKw(readconfig.getMulti_Keyword());
		sp.clickvideoBtn();
		if(sp.getVideosHeader().toLowerCase().contains(readconfig.covertMulti_Keyword(readconfig.getMulti_Keyword())))
		{
			Assert.assertTrue(true);
			logger.info("Video results contains keywords");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Video resultls do not contain keywords");
		}
		
	}
}
