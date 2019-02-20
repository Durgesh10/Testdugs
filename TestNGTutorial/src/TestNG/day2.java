package TestNG;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.text.BreakIterator;
import java.text.spi.BreakIteratorProvider;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.sourceforge.htmlunit.corejs.javascript.ast.BreakStatement;

public class day2 {

	@Test
    public void Demo() throws InterruptedException, AWTException
    {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\durgesh.mishra\\Downloads\\chromedriver.exe");
	
	    
	    //shifting to new comment moderator
	    Thread.sleep(2000);
	WebElement   webobj= driver.findElement(By.xpath("//*[@id='mainMenu']/ul/li[6]"));
	    
			Actions actobj=new Actions(driver);
	
			actobj.click(webobj).build().perform();
	
			System.out.println(driver.getTitle());
			
			//checking window current status
			
			Set<String>ids=driver.getWindowHandles();
		    Iterator<String> it=ids.iterator();
		    String parentid=it.next();
		    System.out.println(parentid);
		    
		    System.out.println(driver.getCurrentUrl());
		    
		    
		    String childid=it.next();
		    driver.switchTo().window(childid);
		    
		    System.out.println(childid);
		    //driver.close();
		    
		    System.out.println(driver.getCurrentUrl());
			
			Thread.sleep(200);
			
			// rejecting comment
			
		WebElement  webobj1= driver.findElement(By.linkText("eighth comment"));
		webobj1.click();
		
		Thread.sleep(2000);
		
		WebElement  webobj2= driver.findElement(By.id("reject"));
		webobj2.click();
		
        Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		//Search functionality case testing
		driver.findElement(By.xpath("//*[@id='search-form']/form/div/div")).click();
		
		Thread.sleep(2000);
		
		//entering text in comment text
		
		driver.findElement(By.xpath("//*[@id='cText']")).sendKeys("Property with cheap loans");
		
		// Clearing article id from Article Id
		try {
			Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='articleId']")).clear();
		}catch (Exception e)
		{
			System.out.println("Element not fount");
		}
		
		driver.findElement(By.xpath("//*[@id='articleId']")).sendKeys("65480153");
		
		// Submit the search details
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='saerch']")).click();
		
	
	}

}
