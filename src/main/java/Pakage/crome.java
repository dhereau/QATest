package Pakage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		
		
		 ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		 
		
	
	    ChromeDriver driver = new ChromeDriver(chromeOptions);
//	    /driver.get("https://demoqa.com/elements");
	    
	    driver.navigate().to("https://demoqa.com/elements");
	    
	 
	  driver.findElement(By.xpath("//span[text()='Text Box']")).click();
//	  
//	  driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys("Akhilesh Dhere");
//	  driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("Akhi@gmail.com");
//	  driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("S");
//	  driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Pune");
//	  driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).clear();
	  
	  
//Thread.sleep(10000);
////	  driver.findElement(By.id("submit")).click();
//	  driver.findElement(By.xpath("//div//div//button[@id='submit']")).click();
//
//	  driver.close();
	  
	}}