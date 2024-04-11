/* "Write a program to Login into the Amazon web app with a valid username and password. 
(P.S. Dont upload the .java file on GitHub with correct username and password)"*/



package assignment_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass45 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("John");
		WebElement continu = driver.findElement(By.id("continue"));
		continu.click();
		WebElement password = driver.findElement(By.id("ap_password"));
		password.sendKeys("James");
		
		WebElement submit_button = driver.findElement(By.id("signInSubmit"));
		submit_button.click();
		//driver.quit();
	}

}
