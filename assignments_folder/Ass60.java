package assignment_Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.batik.util.io.StringNormalizingReader;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass60 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub

		

		FileInputStream obj = new FileInputStream("C:\\Users\\shwet\\OneDrive\\Desktop\\DataDriven1.xlsx");
		Workbook w1= WorkbookFactory.create(obj);

		for(int i=0;i<3;i++)
		{

			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();

			String username = w1.getSheet("login").getRow(1).getCell(i).getStringCellValue();
			String password = w1.getSheet("login").getRow(1).getCell(i).getStringCellValue();

			//String password1 = NumberToTextConverter.toText(w1.getSheet("login").getRow(1).getCell(1).getStringCellValue());
			//String pass2 = String.valueOf(w1.getSheet("login").getRow(1).getCell(1).getStringCellValue());
			System.out.println(username);
			System.out.println(password);

			WebElement fb_email = driver.findElement(By.name("email"));
			fb_email.sendKeys(username);

			WebElement fb_password = driver.findElement(By.name("pass"));
			fb_password.sendKeys(password);

			WebElement fb_login = driver.findElement(By.name("login"));
			fb_login.click();
			
			driver.navigate().back();

			driver.navigate().back();

			driver.navigate().forward();
			driver.quit();

		}

	}
}
