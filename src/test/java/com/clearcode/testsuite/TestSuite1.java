package com.clearcode.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.HomePage;
import com.clearcode.po.MenuBar;
import com.clearcode.po.PatientPage;

import dataProvider.LoginData;

public class TestSuite1 extends TestSetup{



@Test(dataProvider="registerUser",dataProviderClass=LoginData.class, priority=0)
public void registerUser(String description, String FirstName, String LastName, String Email, String Telephone, String Address1, String Address2, String City, String PostCode, String Country, String Region, String Password, String ConfirmPassword)
{
	
	wdu.type(HomePage.first_name_ip, FirstName);
	wdu.type(HomePage.last_name_ip, LastName);
	wdu.type(HomePage.email_ip, "xyz125667687874556@gmail.com");
	wdu.type(HomePage.telephone, Telephone);
	wdu.type(HomePage.address1_ip, Address1);
	wdu.type(HomePage.address2_ip, Address2);
	wdu.type(HomePage.city_ip, City);
	wdu.type(HomePage.postcode_ip, PostCode);
	wdu.selectByVisibleText(HomePage.Countrt_dropdown, Country);
    wdu.selectByVisibleText(HomePage.Region_ip, Region);  
	wdu.type(HomePage.password_ip, Password);
	wdu.type(HomePage.con_password_ip, ConfirmPassword);
	wdu.click(HomePage.subscribe_radio_btn);
    wdu.click(HomePage.agree_checkbox);
	wdu.click(HomePage.continue_button);
	wdu.assertText(HomePage.accoun_created,"Congratulations! Your new account has been successfully created!");
	System.out.println("Account Created");
	wdu.click(HomePage.my_account);
	wdu.click(HomePage.logout);
	
}


@Test(dataProvider="NegativeLogin",dataProviderClass=LoginData.class, priority=1)
public void NegativeLogin(String description, String FirstName, String LastName, String Email, String Telephone, String Address1, String Address2, String City, String PostCode, String Country, String Region, String Password, String ConfirmPassword)
{
	
	wdu.type(HomePage.first_name_ip, FirstName);
	wdu.type(HomePage.last_name_ip, LastName);
	wdu.type(HomePage.email_ip, Email);
	wdu.type(HomePage.telephone, Telephone);
	wdu.type(HomePage.address1_ip, Address1);
	wdu.type(HomePage.address2_ip, Address2);
	wdu.type(HomePage.city_ip, City);
	wdu.type(HomePage.postcode_ip, PostCode);
	wdu.selectByVisibleText(HomePage.Countrt_dropdown, Country);
    wdu.selectByVisibleText(HomePage.Region_ip, Region);
	wdu.type(HomePage.password_ip, Password);
	wdu.type(HomePage.con_password_ip, ConfirmPassword);
	wdu.click(HomePage.subscribe_radio_btn);
    wdu.click(HomePage.agree_checkbox);
	wdu.click(HomePage.continue_button);
	/* Application Register User Page having defect, it is allowing user to create account even user providing wrong and inappropriate inputs. So getting the page source for reference. */
	String str = wdu.PageSource();
	System.out.println(str);
	
}
}
//	@Test(enabled=false,priority=1,dataProvider="CreatePatient",dataProviderClass=LoginData.class)
//	public void createPatient(String[] data) throws InterruptedException {
//		wdu.type(HomePage.username_ip, data[0]);
//		wdu.type(HomePage.pwd_ip, data[1]);
//		wdu.click(HomePage.login_btn);
//		wdu.mouseOver(MenuBar.patient_menu);
//		wdu.click(MenuBar.newPatient_menu);
//		wdu.selectByVisibleText(PatientPage.title_select, data[2]);
//		wdu.type(PatientPage.fname_ip, data[3]);
//		wdu.type(PatientPage.lname_ip, data[4]);
		
//	}
	
//	@Test(dataProvider="SearchPatient",dataProviderClass=LoginData.class)
//	public void searchPatient(String user, String pwd, String title, String fname, String lname) throws InterruptedException {
//		wdu.type(HomePage.username_ip, user);
//		wdu.type(HomePage.pwd_ip, pwd);
//		wdu.click(HomePage.login_btn);
//		wdu.mouseOver(MenuBar.patient_menu);
//		wdu.click(MenuBar.newPatient_menu);
//		wdu.selectByVisibleText(PatientPage.title_select, title);
//		wdu.type(PatientPage.fname_ip, fname);
//		wdu.type(PatientPage.lname_ip, lname);
//	}
	

