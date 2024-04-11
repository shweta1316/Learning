/*Write a program to launch the Amazon web application and hover over Accounts & Lists. Click the Sign in button and perform login.*/
package assignment_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement account_users = driver.findElement(By.id("nav-link-accountList"));
		Actions obj = new Actions(driver);
		obj.moveToElement(account_users).perform();
		account_users.click();
		WebElement create_account = driver.findElement(By.linkText("Create your Amazon account"));
		create_account.click();
		
		//Enter Form details
		
		WebElement customer_name = driver.findElement(By.xpath("//input[@name=\"customerName\"]"));
		customer_name.sendKeys("John Kale");
		
		WebElement customer_email = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		customer_email.sendKeys("88777007777");
		
		
		WebElement customer_setpassword = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		customer_setpassword.sendKeys("SDFW8326#@$");
		
		
		WebElement verify_number = driver.findElement(By.xpath("//span[@id='auth-continue']"));
		verify_number.click();
	}

}
