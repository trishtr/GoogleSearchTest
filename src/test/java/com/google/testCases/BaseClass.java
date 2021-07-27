package com.google.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.XLUtilis.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	ReadConfig readconfig = new ReadConfig();
	public static WebDriver driver;
	public static Logger logger;
	public String baseURL = readconfig.getBaseUrl();
	public String email = readconfig.getEmail();
	public String password = readconfig.getPwd();
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		//get log
		logger = logger.getLogger("GoogleSearch_Gmail_Test");
		PropertyConfigurator.configure("log4j.properties");
		
		//set up browser
		ReadConfig readconfig = new ReadConfig();
		String br = readconfig.getBrowser();
		if(br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		//open URL
		driver.get(baseURL);
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshots" + tname + ".png");
		FileUtils.copyFile(src, target);
		System.out.println("Screenshot is taken");
	}

	
}
