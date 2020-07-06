package com.clearcode.po;

import org.openqa.selenium.By;

public class HomePage {
//	public static By username_ip = By.id("authUse");
//	public static By pwd_ip = By.id("clearPass");
//	public static By login_btn = By.className("fa-sign-in");
	
    public static By account_icon = By.linkText("My Account");
    public static By login_button = By.linkText("Register");
    public static By first_name_ip = By.id("input-firstname");
    public static By last_name_ip = By.id("input-lastname");
    public static By email_ip =     By.id("input-email");
    public static By telephone = By.id("input-telephone");
    public static By address1_ip = By.id("input-address-1");
    public static By address2_ip = By.id("input-address-2");
    public static By city_ip = By.id("input-city");
    public static By postcode_ip = By.id("input-postcode");
    public static By password_ip = By.id("input-password");
    public static By con_password_ip = By.id("input-confirm");
    public static By Region_ip = By.id("input-zone");
    public static By Countrt_dropdown =  By.id("input-country");
    public static By subscribe_radio_btn = By.xpath("//*[@id=\"content\"]/form/fieldset[4]/div/div/label[2]/input");
    public static By agree_checkbox = By.name("agree");
    public static By continue_button = By.xpath(".//input[@type='submit']");
    public static By my_account = By.xpath(".//a[@class='dropdown-toggle']");
    public static By logout = By.linkText("Logout");
    public static By logout_con = By.linkText("Continue");
    public static By accoun_created= By.xpath("//*[@id=\"content\"]/p[1]");
    
}
