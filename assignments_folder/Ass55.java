/*Write a program to launch the Google web application and search for "Indian News Channels". Click on the last autosuggestion, which is generated for that search.*/
package assignment_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass55 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		// driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search_text = driver.findElement(By.name("q"));
		search_text.sendKeys("Indian News Channels");
		Thread.sleep(4000);
		List<WebElement> autosuggestions = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = autosuggestions.size();
		System.out.println(count-10);
		autosuggestions.get(9).click();
	}

}
