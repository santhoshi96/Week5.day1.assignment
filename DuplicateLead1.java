package week5.day1.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead1 extends LeadBaseClass  {
    @Test
	public void duplicatingLead() throws InterruptedException {
		
driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("Email")).click();
		
		driver.findElement(By.name("emailAddress")).sendKeys("abc@testmail.com");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		String text = driver.findElement(By.linkText("10121")).getText();
		System.out.println(text);
		
		driver.findElement(By.linkText("10121")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		boolean titleShown = driver.findElement(By.id("sectionHeaderTitle_leads")).getText().equals("Duplicate Lead");
		System.out.println(titleShown);
		
		driver.findElement(By.name("submitButton")).click();
		
		boolean verify = driver.findElement(By.id("viewLead_firstName_sp")).getText().equals(text);
		System.out.println("Duplicated lead name is same as Captured name-"+verify);
		
		driver.close();
		
	}

}
