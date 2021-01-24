package testNGTests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SantanuGhosh\\Desktop\\Alchemy\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get("https://www.training-support.net");
	}
	@Test
	public void gettest() {
		String title= driver.getTitle();
		System.out.println("title is "+title);
		Assert.assertEquals("Training Support", title);
		driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "About Training Support");
	}
	@AfterMethod
	public void aftertest()
	{
	 driver.close();	
	}

}
