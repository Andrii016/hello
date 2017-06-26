package com.testvkwithjunit.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MakePost {
	   WebDriver driver;
		By mypage=By.xpath(".//*[@id='l_pr']/a/span/span[3]");
		By nonotes =By.xpath(".//*[@id='wall_tabs']/li[4]/a");
		By whatnews =By.id("post_field");
		By sendbutton =By.id("send_post");
		By profile =By.xpath(".//*[@id='top_profile_link']");
		By logout =By.xpath(".//*[@id='top_logout_link']");
		
		
		public  MakePost(WebDriver driver){
		    this.driver=driver;
			}
	    public void addPost(String news){
	   
	    	driver.findElement(mypage).click();
	    	driver.findElement(nonotes).click();
	    	driver.findElement(whatnews).sendKeys(news);
	    	driver.findElement(sendbutton).click();
	    	driver.findElement(mypage).click();
            ssertTrue(driver.getTitle().contains("test post"));
            driver.findElement(profile).click();
            driver.findElement(logout).click();
            if(driver.getTitle().contains("ВКонтакте для мобильных устройств")){
            	System.out.println("Text is present");
            	}else{
            	System.out.println("Text is absent");
            	}
            /* if(driver.findElement(By.xpath(".//*[@id='content']/div/div[1]/div[1]"))!= null){
            	System.out.println("Element is Present");
            	}else{
            	System.out.println("Element is Absent");
            	}
            */
	    }
		private void ssertTrue(boolean contains) {
	    
	    }
	   
		}