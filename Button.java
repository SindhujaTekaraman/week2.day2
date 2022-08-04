package week2.day2;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Button
{
	public static void main(String[] args) 
	{
		//Download and set the path
		WebDriverManager.chromedriver().setup();

		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();

		//Load the URL
		driver.get("http://leafground.com/pages/Button.html");

		//Maximize the window
		driver.manage().window().maximize();

		// Click button to travel home page
		driver.findElement(By.id("home")).click();

		// Navigate back to Button from home page
		driver.navigate().back();

		// To find the position of button -(x,y)
		Point bPosition = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		int x = bPosition.getX();
		System.out.println("x Position: " + x);
		int y = bPosition.getY();
		System.out.println("y Position: " + y);

		// To find the button color
		String bColor = driver.findElement(By.id("color")).getAttribute("style");
		System.out.println("Color of the Button: " + bColor);

		// To find the the height and width
		Dimension bSize = driver.findElement(By.id("color")).getSize();
		System.out.println("Size of the Button: " + bSize);
	}
}