package com.google.XLUtilis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig() {
		File src = new File ("./Configurations/config.properties");
		
		try 
		{
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(IOException e)
		{
			System.out.println("Exception is "+ e.getMessage());
		}
	}
			
	public String getBaseUrl() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	public String getBrowser() {
		String browser = pro.getProperty("browser");
		return browser;
	}
	public String getSingle_Keyword() {
		String single_kw = pro.getProperty("singlekeyword");
		return single_kw;
	}
	public String getMulti_Keyword() {
		String multi_kw = pro.getProperty("multiplekeywords");
		return multi_kw;
	}
	public String covertMulti_Keyword(String kw) {
		List<String> myList = new ArrayList<String>(Arrays.asList(kw.split(" ")));
		String singlekw = "";
		for(int i= 0; i<myList.size(); i++) 
		{
			singlekw = myList.get(i);
		}
		return singlekw;
		
	}
	
	public String getPartial_Keyword() {
		String par_kw = pro.getProperty("partialkeyword");
		return par_kw;
	}
	public String getMisspelled_Keyword() {
		String ms_kw = pro.getProperty("misspelledkeyword");
		return ms_kw;
	}
	public String getCorrected_Keyword() {
		String cor_kw = pro.getProperty("correctedkeyword");
		return cor_kw;	
	}
	public String getTypo_Keyword() {
		String typo_kw = pro.getProperty("typokeyword");
		return typo_kw;	
	}
	public String getNonex_Keyword() {
		String nonex_kw = pro.getProperty("nonexistingkeyword");
		return nonex_kw;	
	}
	public String getMath_Keyword() {
		String m_kw = pro.getProperty("mathematickeyword");
		return m_kw;
	}
	
	public String getEmail() {
		String email = pro.getProperty("email");
		return email;
	}
	public String getPwd() {
		String password = pro.getProperty("password");
		return password;
	}
	
	
}
