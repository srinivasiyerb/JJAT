package com.rl.E2EMF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Search extends MainDriver {

	 public static void search(){
		 	driver.findElement(By.xpath("//aside[@id='left-panel']/nav/ul/li[3]/a/span")).click();
			driver.findElement(By.id("searchterm")).sendKeys("Sales orders Details");
			driver.findElement(By.id("search")).click();
			driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
	 }
}
