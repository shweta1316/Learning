/*Write a program to launch,"https://grotechminds.com/registration/", and select an option from all the dropdown menus present there.*/
package assignment_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		//Skills Drop down
		WebElement dropdown_skills = driver.findElement(By.name("Skills"));
		dropdown_skills.click();
		Select obj = new Select(dropdown_skills);
		obj.selectByIndex(2);

		//Country Drop down
		WebElement dropdown_country = driver.findElement(By.name("Country"));
		dropdown_country.click();
		Select obj1 = new Select(dropdown_country);
		obj1.selectByIndex(2);



		//Relegion Drop down
		WebElement dropdown_religion = driver.findElement(By.name("Relegion"));
		dropdown_religion.click();
		Select obj3 = new Select(dropdown_religion);
		obj3.selectByIndex(2);
	}

}
