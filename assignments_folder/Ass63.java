package assignment_Selenium;

import java.io.IOException;
import java.net.*;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass63 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linkcount = links.size();
		for(int i=0;i<linkcount;i++)
		{
			WebElement linkname = links.get(i);
			String link_url = linkname.getAttribute("href");
			System.out.println(link_url);
			verify_links(link_url);

		}

	}
	static void verify_links(String link_url) throws IOException
	{
		try {

			URL u1=new URL(link_url);

			HttpURLConnection u2=(HttpURLConnection) u1.openConnection();
			u2.connect();
			if(u2.getResponseCode()==200)
			{
				System.out.println("Link is valid"+u2.getResponseMessage()+ link_url);
			}
			else
			{
				System.out.println("Link is not valid");

			}
		}catch(NullPointerException a1){

		}
		catch(MalformedURLException a2){

		}
	}
	}
}
