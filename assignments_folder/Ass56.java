/*Write a program to launch the Amazon web application and select Amazon Fresh using the keys functionality.*/
package assignment_Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ass56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}

}
