package com.clearcode.testsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.clearcode.po.HomePage;
import com.clearcode.utils.WebDriverUtils;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class,
	  MethodListener.class })
public class TestSetup {
	{
        System.setProperty("atu.reporter.config", "src/test/resources/atu.properties");
    }
	WebDriverUtils wdu = new WebDriverUtils();
	@BeforeClass
	public void launch() {
		wdu.initialize();
		wdu.launchUrl();
		

		
	}
	
	@BeforeMethod
	public void loadUrl() {
		wdu.launchUrl();
		wdu.click(HomePage.account_icon);
		wdu.click(HomePage.login_button);
	}
	

//	@AfterClass
//	public void close() {
//		//wdu.exit();
//	}
	
//	@AfterSuite
//	public void openReport() {
//		String loc = System.getProperty("user.dir");
//		wdu.initialize();
//		wdu.navigate("file:///"+loc+"/ATU%20Reporter/index.html");
//	}
}
