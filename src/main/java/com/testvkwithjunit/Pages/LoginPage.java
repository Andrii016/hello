package com.testvkwithjunit.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * @author Andrii
 *
 * Class will store all the  locators and  methods for login page.
 */

public class LoginPage {
    WebDriver driver;
	By username=By.id("index_email");
	By password =By.id("index_pass");
	By loginbutton =By.id("index_login_button");
	
	
public LoginPage(WebDriver driver){
    this.driver=driver;
	}

public void loginToVK(String telnum, String pass) {
	driver.findElement(username).sendKeys(telnum);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(loginbutton).click();
	
}

    }
	