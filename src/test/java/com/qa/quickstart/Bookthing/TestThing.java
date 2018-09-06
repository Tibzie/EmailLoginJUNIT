package com.qa.quickstart.Bookthing;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestThing {

	
	ChromeDriver driver;
	String url="http://a.testaddressbook.com/sign_in";
	
	
	@Test
	public void test() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Laptop\\eclipse-workspace\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(url);

		 
		 WebDriverWait wait = new WebDriverWait(driver, 50);
		 driver.findElement(By.linkText("Sign up")).click();
		 WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@value='Sign up']")));
		 WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.id("user_email")));
//		 email.sendKeys(Keys.chord("robin@msn.com"));         --- DON'T DELETE THIS!!!
		 email.sendKeys("batman@lolxd.com");
		 WebElement pass = wait.until(ExpectedConditions.elementToBeClickable(By.id("user_password")));
		 pass.sendKeys("banana");
		 
		 WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"new_user\"]/div[3]/input")));
		 submit.click();

	
	}

}
