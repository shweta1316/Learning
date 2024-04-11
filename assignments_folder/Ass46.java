/*Write a program to launch the Flipkart web application and get its title. Store every individual word present in the title as a value of an index position of a String array.*/
package assignment_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass46 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement account_users = driver.findElement(By.id("nav-link-accountList"));
		account_users.click();
		WebElement create_account = driver.findElement(By.linkText("Create your Amazon account"));
		create_account.click();
		
		//Enter Form details
		
		WebElement customer_name = driver.findElement(By.name("customerName"));
		customer_name.sendKeys("John Kale");
		
		WebElement customer_email = driver.findElement(By.name("email"));
		customer_email.sendKeys("88777007777");
		
		
		WebElement customer_setpassword = driver.findElement(By.name("password"));
		customer_setpassword.sendKeys("SDFW8326#@$");
		
		
		WebElement verify_number = driver.findElement(By.xpath("//span[@id='auth-continue']"));
		verify_number.click();
		}

}
