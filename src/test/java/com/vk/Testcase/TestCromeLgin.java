package com.vk.Testcase;

import com.testvkwithjunit.Pages.LoginPage;
import com.testvkwithjunit.Pages.MakePost;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.concurrent.TimeUnit;


public  class TestCromeLgin {
    protected static WebDriver driver;
   @BeforeClass
   public static void testStart(){
   ChromeOptions options = new ChromeOptions();
//        options.setBinary("...");
    options.addArguments("start-maximized");
    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
    capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    driver = new ChromeDriver(capabilities);
     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

   }
    @AfterClass
    public static void testStop(){
    driver.close();
    }

   // @Test
    public  void  verifyValidLogin()throws InterruptedException {
    driver.get("https://vk.com/");
    //Login to Vk.com
    LoginPage login = new LoginPage(driver);
    login.loginToVK("79892794545","Qwerty!23" );
    // add new post
    MakePost post = new MakePost(driver);
    post.addPost("test post");
    driver.quit();

}
}
