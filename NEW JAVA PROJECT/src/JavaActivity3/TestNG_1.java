package JavaActivity3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_1 {
	
	@BeforeTest
	public void beforetest() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void 	beforemethod() {
		System.out.println("Before Method");
	}
	
  @Test
  public void first() {
	  System.out.println("Hello World");
  }
  
  @Test
  public void second() {
	  System.out.println("Hello World 2");
  }
  
  @AfterMethod
	public void 	aftermethod() {
		System.out.println("After Method");
		
  }
  @AfterClass
  public void afterclass() {
	  System.out.println("After Class");
  }
	@AfterTest
	public void aftertest() {
		System.out.println("After Test");
}
}