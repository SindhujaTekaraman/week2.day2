package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown 
{
	public static void main(String[] args)
	{
		//Download and set the path
		WebDriverManager.chromedriver().setup();

		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();

		//Load the URL
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		//Maximize the window
		driver.manage().window().maximize();	

		//To select dropdown using Index
		WebElement dIndex = driver.findElement(By.id("dropdown1"));
		Select dropdown1 = new Select(dIndex);
		dropdown1.selectByIndex(1);

		//To select dropdown using Text
		WebElement dText = driver.findElement(By.name("dropdown2"));
		Select dropdown2 = new Select(dText);
		dropdown2.selectByVisibleText("Selenium");

		//To select dropdown using Value
		WebElement dValue = driver.findElement(By.id("dropdown3"));
		Select dropdown3 = new Select(dValue);
		dropdown3.selectByValue("1");

		//To select dropdown using Dropdown Options
		WebElement dOptions = driver.findElement(By.className("dropdown"));
		Select dropdown4 = new Select(dOptions);
		int total = dropdown4.getOptions().size();
		System.out.println("Total number of dropdown options: " + total);

		//To select dropdown using sendKeys
		driver.findElement(By.xpath("(//div[@class='example']/select)[5]")).sendKeys("Selenium"+Keys.ENTER);

		//To select option from Programs
		driver.findElement(By.xpath("(//div[@class='example'])[6]//option[3]")).click();
	}
}
