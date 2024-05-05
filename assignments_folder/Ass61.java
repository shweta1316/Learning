package assignment_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ass61 {
	ChromeDriver driver;
	@BeforeMethod
	public void precondition()

	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void postactivity() {
		driver.quit();
	}

	@Test
	public void scenario()
	{
	
		WebElement search_text = driver.findElement(By.id("twotabsearchtextbox"));
		search_text.sendKeys("shoes");
		//Thread.sleep(2000);
		String title_save = driver.getTitle();
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs(title_save));
		search_text.sendKeys(Keys.ARROW_DOWN);
		search_text.sendKeys(Keys.ARROW_DOWN);

		search_text.sendKeys(Keys.ENTER);
	}

}
