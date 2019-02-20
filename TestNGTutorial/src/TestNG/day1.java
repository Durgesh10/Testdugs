package TestNG;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class day1 {

	
		// TODO Auto-generated method stub
	@Test
    public void Demo() throws InterruptedException, AWTException
    {
    	System.out.println("Test");
    	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\durgesh.mishra\\Downloads\\chromedriver.exe");
	    WebDriver driver=	new ChromeDriver();
		driver.get("http://adkjadj@gmail.com");
		Thread.sleep(1000);
	    driver.findElement(By.id("officialEmailId")).sendKeys("durgesh577@ernet.in");
	    driver.findElement(By.name("officialPassword")).sendKeys("122");
	    driver.findElement(By.xpath("/html/body/div/div/form/button")).click();
	    
	}

}
