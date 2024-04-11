/*Write a program to launch the Amazon web application and search for "shoes". Click on the first search result that is displayed.*/

package assignment_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Shoes");
		search.sendKeys(Keys.ENTER);
		WebElement first_shoes = driver.findElement(By.xpath("//div[@class=\"a-section a-spacing-base a-text-center\"][1]"));
		first_shoes.click();
	}

}
