package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox 
{
	public static void main(String[] args) 
	{
		//Download and set the path
		WebDriverManager.chromedriver().setup();

		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();

		//Load the URL
		driver.get("http://leafground.com/pages/checkbox.html");

		//Maximize the window
		driver.manage().window().maximize();	

		//To check the option in "Select the languages that you know?"
		driver.findElement(By.xpath("//div[@class='example']//input[1]")).click();

		//To verify the option in "Confirm Selenium is checked"
		Boolean selVerify = driver.findElement(By.xpath("(//div[@class='example'])[2]/input")).isSelected();
		if (selVerify == true)
		{
			System.out.println("Selenium checkbox is checked");
		}
		else 
		{
			System.out.println("Selenium checkbox is not checked");
		}

		//To verify the option in 'DeSelect only checked'
		Boolean deselVerify = driver.findElement(By.xpath("(//div[@class='example'])[3]/input[2]")).isSelected();
		if(deselVerify == true)
		{
			driver.findElement(By.xpath("(//div[@class='example'])[3]/input[2]")).click();
		}

		//To check all the options in 'Select all the below checkboxes'
		driver.findElement(By.xpath("(//div[@class='example'])[4]/input[1]")).click();
		driver.findElement(By.xpath("(//div[@class='example'])[4]/input[2]")).click();
		driver.findElement(By.xpath("(//div[@class='example'])[4]/input[3]")).click();
		driver.findElement(By.xpath("(//div[@class='example'])[4]/input[4]")).click();
		driver.findElement(By.xpath("(//div[@class='example'])[4]/input[5]")).click();
		driver.findElement(By.xpath("(//div[@class='example'])[4]/input[6]")).click();
	}
}
