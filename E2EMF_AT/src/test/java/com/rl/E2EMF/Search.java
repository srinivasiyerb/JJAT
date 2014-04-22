package com.rl.E2EMF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Search extends MainDriver {

	 public static void search(){
		 	driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[3]/a")).click();
			driver.findElement(By.id("searchterm")).sendKeys("Sales orders Details");
			driver.findElement(By.id("search")).click();
			driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
	 }
}
