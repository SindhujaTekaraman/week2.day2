package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Image
{
	public static void main(String[] args) 
	{
		//Download and set the path
		WebDriverManager.chromedriver().setup();

		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();

		//Load the URL
		driver.get("http://www.leafground.com/pages/Image.html");

		//Maximize the window
		driver.manage().window().maximize();	

		//To click on 'Click on this image to go home page'
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();

		driver.get("http://leafground.com/pages/Image.html");

		//To verify 'Am I Broken Image?'
		WebElement imgBroken = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		if(imgBroken.getAttribute("naturalHeight").equals("0"))
		{
			System.out.println("Image is broken");
		}
		else 
		{
			System.out.println("Image is not broken");
		}
		
		//To verify 'Click me using Keyboard or Mouse'
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
	}
}
