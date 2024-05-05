package assignment_Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass59 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		TakesScreenshot ts = driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		Date d1 = new Date();
		String date = d1.toString().trim().replace(":", "_");		
		File dest = new File("C:\\Users\\shwet\\eclipse-workspace\\firstselenium\\Screenshot\\" +date+ ".png");

		FileUtils.copyFile(source, dest);
	}

}
