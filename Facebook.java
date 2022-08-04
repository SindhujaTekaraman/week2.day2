package week2.day2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook 
{
	public static void main(String[] args)
	{
		//Download and set the path
		WebDriverManager.chromedriver().setup();

		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();

		//Load the URL
		driver.get("https://en-gb.facebook.com/");

		//Maximize the window
		driver.manage().window().maximize();

		//To add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//To click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

		//To enter the First Name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sindhura");

		//To enter the Last Name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ram");

		//To enter the Mobile Number
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9789089897");

		//To enter the Password
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Ram12345#");

		//To handle the three drop downs
		WebElement dropdown1 = driver.findElement(By.id("day"));
		Select day = new Select(dropdown1);
		day.selectByVisibleText("23");

		WebElement dropdown2 = driver.findElement(By.id("month"));		
		Select month = new Select(dropdown2);
		month.selectByValue("11");

		WebElement dropdown3 = driver.findElement(By.id("year"));		
		Select year = new Select(dropdown3);
		year.selectByValue("1994");

		//To select the radio button 'Female' 
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	}
}
