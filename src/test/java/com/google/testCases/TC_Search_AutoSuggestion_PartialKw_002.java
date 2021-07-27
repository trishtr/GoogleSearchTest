package com.google.testCases;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.pageObjects.HomePage;

public class TC_Search_AutoSuggestion_PartialKw_002 extends BaseClass {
	
	@Test
	public void autoCompleteTest() throws InterruptedException {
		logger.info("Search for keyword");
		HomePage hp = new HomePage(driver);
		hp.sendKw(readconfig.getPartial_Keyword());
		Thread.sleep(5000);
		logger.info("Check AutoComplete");
		for(int i = 0; i< hp.sizeResultLst(); i++)
		{
			if(hp.getResultLst().get(i).getText().contains(readconfig.getPartial_Keyword()))
			{
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertFalse(false);
			}
			
		}		
	}
}
