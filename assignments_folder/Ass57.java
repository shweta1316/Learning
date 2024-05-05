package assignment_Selenium;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ass57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String check = "ogle09";
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleIs(check));
		/*boolean title_check = driver.getTitle().contains(check);
		if(title_check==true)
		{
			System.out.println("Yes, It contains the word");
		}
		else
		{
			System.out.println("No, It does not contain the word");
		}	*/
		driver.close();
	}

}
