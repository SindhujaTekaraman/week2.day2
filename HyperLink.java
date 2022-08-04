package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink
{
	public static void main(String[] args) 
	{
		//Download and set the path
		WebDriverManager.chromedriver().setup();

		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();

		//Load the URL
		driver.get("http://www.leafground.com/pages/Link.html");

		//Maximize the window
		driver.manage().window().maximize();	

		//To verify on link 'Go to Home Page'
		driver.findElement(By.linkText("Go to Home Page")).click();

		//To navigate to Link Page
		driver.get("http://leafground.com/pages/Link.html");

		// To verify on link 'Find where am supposed to go without clicking me?'
		String checkLink = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).getAttribute("href");
		System.out.println(checkLink);

		//To verify on link 'Verify am I broken?'
		driver.findElement(By.linkText("Verify am I broken?")).click();

		//To verify the Title
		String checkTitle = driver.getTitle();
		if(checkTitle.equals("404 Not Found"))
		{
			System.out.println("The page is broken");
		}
		else
		{
			System.out.println("The pagee is not broken");
		}

		//To navigate to Link Page
		driver.get("http://leafground.com/pages/Link.html");

		//To verify on link 'Go to Home Page (Interact with same link name)'
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();
		driver.get("http://leafground.com/pages/Link.html");

		//To verify on link 'How many links are available in this page?'
		int linkCount = driver.findElements(By.tagName("a")).size();
		System.out.println("Total no. of links: " + linkCount);
	}
}
