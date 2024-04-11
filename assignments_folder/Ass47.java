/*Write a program to launch the Amazon web application and click on "mobiles", using the "a"(<a..../a>) tag name.*/
package assignment_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement mobile_link = driver.findElement(By.xpath("//a[@href=\"/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles\"]"));
		mobile_link.click();
	}

}
