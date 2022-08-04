package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit 
{
	public static void main(String[] args) 
	{
		//Download and set the path
		WebDriverManager.chromedriver().setup();

		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();

		//Load the URL
		driver.get("http://leafground.com/pages/Edit.html");

		//Maximize the window
		driver.manage().window().maximize();	

		//To enter value in 'Enter your email address'
		driver.findElement(By.id("email")).sendKeys("sindhuja.triad@gmail.com");

		//To append a text in 'Append a text and press keyboard tab'
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("a valid text");

		//To get value in 'Get default text entered'
		String dText = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
		System.out.println("Entered default text: " + dText);

		//To clear value from 'Clear the text'
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();

		//To verify 'Confirm that edit field is disabled'
		Boolean fDisabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		if(fDisabled == true)
		{
			System.out.println("The field is enabled");
		}
		else
		{
			System.out.println("The field is disabled");
		}
	}
}
