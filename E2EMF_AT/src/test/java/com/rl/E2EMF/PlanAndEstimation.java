package com.rl.E2EMF;

import org.openqa.selenium.By;

public class PlanAndEstimation extends MainDriver {

	public static void pe(){
			driver.findElement(By.xpath("//div[@id='hide-menu']/span/a")).click();
			driver.findElement(By.xpath("//span/i")).click();
	/*	driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[4]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[4]/ul/li[2]/ul/li/a")).click();
	*/}

}
