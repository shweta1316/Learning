/*Write a program to launch the Flipkart web application and get its title. Store every individual word present in the title as a value of an index position of a String array.*/
package assignment_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass43 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		System.out.println(Title);
		String split_title[] = Title.split(" ");
		System.out.println("[");
		
		for(int i=0;i<split_title.length;i++)
		{
			System.out.println(split_title[i]);

		}
		System.out.println("]");

		driver.quit();
		
	}

}
