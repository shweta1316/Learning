/*Write a program to launch, "https://grotechminds.com/drag-and-drop/" and perform a drag and drop operation.  */

package assignment_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ass54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();

		WebElement Locate1 = driver.findElement(By.id("drag7"));
		WebElement Locate2 = driver.findElement(By.id("div2"));
		Actions obj = new Actions(driver);
		obj.dragAndDrop(Locate1, Locate2).perform();
	}

}
