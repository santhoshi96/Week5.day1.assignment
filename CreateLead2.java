package week5.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead2 {
    @Test
	public void newLead() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Title
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		//CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		//first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Santhoshi");
		//last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");

		//source
		driver.findElement(By.id("createLeadForm_dataSourceId")).click();
		WebElement dropdown = driver.findElementById("createLeadForm_dataSourceId");
		Select dd1 = new Select(dropdown);
		dd1.selectByVisibleText("Direct Mail");
		//first name local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Meena");
		//Marketing Camping
		WebElement dropdown1 = driver.findElement(By.name("marketingCampaignId"));
		Select dd2 = new Select(dropdown1);
		dd2.selectByVisibleText("Demo Marketing Campaign");
		//Title
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Hi");
		//Last name Local
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("veera");
		//Currency
		WebElement dropdown2 = driver.findElementById("createLeadForm_currencyUomId");
		Select dd3 = new Select(dropdown2);
		dd3.selectByVisibleText("INR - Indian Rupee");
		//Description
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("My First Automation Project");
		//Annual Revenue
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000000");
		WebElement dropdown3 = driver.findElementById("createLeadForm_industryEnumId");
		Select dd4 = new Select(dropdown3);
		dd4.selectByVisibleText("Computer Software");
		WebElement dropdown4 = driver.findElementById("createLeadForm_ownershipEnumId");
		Select dd5 = new Select(dropdown4);
		dd5.selectByVisibleText("Partnership");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("9796");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("11/09/1996");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10000000");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("test");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("test");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("NYT");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600088");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9087870554");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("teddy");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("santhoshi1996@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leafground.com/");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Valar");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("joseph colony");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Shankar flats");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		WebElement dropdown5 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select dd6 = new Select(dropdown5);
		dd6.selectByVisibleText("Indiana");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600088");
		WebElement dropdown6 = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dd7 = new Select(dropdown6);
		dd7.selectByVisibleText("India");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("600088");
		driver.findElement(By.className("smallSubmit")).click();
		String text1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String Company = text1.replaceAll("[^a-zA-Z]","");
		System.out.println(Company);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Zoho");
		driver.findElement(By.className("smallSubmit")).click();
		String text2 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String replace = text2.replaceAll("[^a-zA-Z]","");
		System.out.println(replace);
		if (replace.contains("Amazon")) {
			
			System.out.println("This is an Duplicate Company Name");
		}
		else {
			System.out.println("This is not an Duplicate Company Name");
		}
			}

			


	}


