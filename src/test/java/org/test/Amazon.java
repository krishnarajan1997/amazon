package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement cross = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		cross.click();
		WebElement serch = driver.findElement(By.xpath("//input[@name='q']"));
		serch.sendKeys("iphone");
		WebElement serchicon = driver.findElement(By.xpath("//button[@type='submit']"));
		serchicon.click();
		Thread.sleep(5000);
		WebElement pro = driver.findElement(By.xpath("//div[contains(text(),'Price -- High to Low')]"));
		pro.click();
		Thread.sleep(5000);
		WebElement product = driver.findElement(By.xpath("(//div[contains(text(),'₹1')])[1]"));
		String text = product.getText();
		System.out.println("price of the product "+text);
		product.click();
		
		

	
	}
}