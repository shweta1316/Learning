/*Write a program to launch www.google.com, and search for "India", and click on the "Google Search" button using CSS locator.*/

package assignment_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass52 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//Select auto suggestion using arrow down
				WebElement search_text = driver.findElement(By.cssSelector("textarea[class=\"gLFyf\"]"));
				search_text.sendKeys("India");
				Thread.sleep(4000);
				search_text.sendKeys(Keys.ARROW_DOWN);
				search_text.sendKeys(Keys.ARROW_DOWN);
				search_text.sendKeys(Keys.ARROW_DOWN + "" + Keys.ARROW_DOWN);

				search_text.sendKeys(Keys.ENTER);
	}

}
