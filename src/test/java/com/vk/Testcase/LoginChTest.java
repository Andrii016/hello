package com.vk.Testcase;

import com.testvkwithjunit.Pages.LoginPage;
import com.testvkwithjunit.Pages.MakePost;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

public class LoginChTest {
    WebDriver driver;

   @Before
   public void testStart(){
   driver = new ChromeDriver();

   }
    @After
    public void testStop(){
    driver.close();
    }

    @Test
    public void  verifyValidLogin(){
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://vk.com/");
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    //Login to Vk.com
    LoginPage login = new LoginPage(driver);
    login.loginToVK("79892794545","Qwerty!23" );
    // add new post
    MakePost post = new MakePost(driver);
    post.addPost("test post");
    driver.quit();

}
}
