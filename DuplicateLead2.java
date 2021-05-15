package week5.day1.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead2 {
@Test
	public  void newDuplicate() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.linkText("Email")).click();
		
		driver.findElement(By.name("emailAddress")).sendKeys("abc@testmail.com");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		String text = driver.findElement(By.linkText("10138")).getText();
		System.out.println(text);
		
		driver.findElement(By.linkText("10138")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		boolean titleShown = driver.findElement(By.id("sectionHeaderTitle_leads")).getText().equals("Duplicate Lead");
		System.out.println(titleShown);
		
		driver.findElement(By.name("submitButton")).click();
		
		boolean verify = driver.findElement(By.id("viewLead_firstName_sp")).getText().equals(text);
		System.out.println("Duplicated lead name is same as Captured name-"+verify);
		
		driver.close();
		
	}



	}


