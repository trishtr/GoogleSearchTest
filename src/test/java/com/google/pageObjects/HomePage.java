package com.google.pageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver ldriver;
	public HomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how= How.XPATH, using = "//input[@class='gLFyf gsfi']")
	WebElement searchInput;
	
	@FindBy(how= How.XPATH, using = "//a[contains(text(),'Sign in')]")
	WebElement signinBtn;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Gmail')]")
	WebElement gmailBtn;
	
	@FindBy(how = How.XPATH, using = "//ul[@role='listbox']//li[@role='presentation']")
	List <WebElement> resultList;
	
	
	
	public void sendKw(String kw) {
		searchInput.sendKeys(kw);
	}
	public void searchKw(String kw) {
		searchInput.sendKeys(kw);
		searchInput.sendKeys(Keys.ENTER);
	}
	public void clickSignInBtn() {
		signinBtn.click();
	}
	public void clickgmailBtn() {
		gmailBtn.click();
	}
	public List <WebElement> getResultLst() {
		return resultList;
	}
	public int sizeResultLst() {
		int sizelst = resultList.size();
		return sizelst;
	}

}
