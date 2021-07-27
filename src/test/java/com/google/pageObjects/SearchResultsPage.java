package com.google.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {

	WebDriver ldriver;
	public SearchResultsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'hdtb-mitem')][@xpath='1']")
	WebElement allBtn;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Images')]")
	WebElement imagesBtn;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Maps')]")
	WebElement mapBtn;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Videos')]")
	WebElement videoBtn;
	@FindBy(how = How.XPATH, using = "//div[@class='GOE98c']")
	WebElement moreBtn;
	@FindBy(how = How.XPATH, using = "//div[@id='lb']//a[contains(text(),'Images')]")
	WebElement hiddenImgBtn;
	@FindBy(how = How.XPATH, using = "//div[@id='lb']//a[contains(text(),'Maps')]")
	WebElement hiddenMapsBtn;
	@FindBy(how = How.XPATH, using = "//div[@id='lb']//a[contains(text(),'Videos')]")
	WebElement hiddenVideosBtn;
	@FindBy(how = How.XPATH, using = "//p[@role='heading']")
	WebElement searchHeader;
	@FindBy(how= How.XPATH, using = "//div[@id='islrg']//img")
	List <WebElement> imgLst;
	@FindBy(how = How.XPATH, using = "//div[@id='search']//a//h3")
	List<WebElement> videoHeaderLst;
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Calculator Result')]")
	WebElement calculatorHeader;
	
	
	public void clickimagesBtn() {
		if(imagesBtn.isDisplayed()) {
			imagesBtn.click();
		}
		else
		{
			moreBtn.click();
			hiddenImgBtn.click();
		}
	}
	public void clickvideoBtn() {
		if(videoBtn.isDisplayed()) {
			videoBtn.click();
		}
		else
		{
			moreBtn.click();
			hiddenVideosBtn.click();
		}
	}
	public void clickmapsBtn() {
		if(mapBtn.isDisplayed()) {
			mapBtn.click();
		}
		else
		{
			moreBtn.click();
			hiddenMapsBtn.click();
		}
	}
	public String getSearchHeaderTxt() {
		String sh = searchHeader.getText();
		return sh;
	}
	public String getcalculatorHeader() {
		String ch = calculatorHeader.getText();
		return ch;
	}
	public String getVideosHeader() {
		String vh ="";
		for (int i = 0; i< videoHeaderLst.size(); i++)
			{
			   vh = videoHeaderLst.get(i).getText();
			}
		return vh;
	}
	
	public List<WebElement> getImagesLst() {
		return imgLst;
	}
	
	
}
