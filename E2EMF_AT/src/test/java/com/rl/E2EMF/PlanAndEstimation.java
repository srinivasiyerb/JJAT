package com.rl.E2EMF;

import org.openqa.selenium.By;

public class PlanAndEstimation extends MainDriver {

	public static void pe(){
		driver.findElement(By.xpath("(//a[contains(@href, '#')])[2]")).click();
		driver.findElement(By.xpath("(//a[contains(@href, '#')])[3]")).click();
		driver.findElement(By.xpath("//a[contains(@href, 'ajax/e2e_pom.html')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Outsourced Manufacturing')]")).click();
		
	/*	driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[4]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='left-panel']/nav/ul/li[4]/ul/li[2]/ul/li/a")).click();
	*/}

}
