package assignment_Selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ass62 {
	@Test
	public void launchbrowser()
	{
		WebDriver launchbrowser;
		String browser;
		System.out.println("Enter browser name");
		Scanner sc = new Scanner(System.in);
		browser= sc.next();
		switch(browser)
		{
		case "Chrome":
			launchbrowser = new ChromeDriver(); 
			launchbrowser.get("https://www.google.com");
			launchbrowser.manage().window().maximize();
			break;
		case "Edge":
			launchbrowser = new EdgeDriver(); 
			launchbrowser.get("https://www.google.com");
			launchbrowser.manage().window().maximize();
			break; 
		case "Firefox":
			launchbrowser = new FirefoxDriver(); 
			launchbrowser.get("https://www.google.com");
			launchbrowser.manage().window().maximize();
			break;	
		default:
			//launchbrowser = new ChromeDriver(); //upcasting
			

		}
	}
}
