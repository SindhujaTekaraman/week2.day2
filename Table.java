package week2.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Table
{
	public static void main(String[] args) 
	{
		//Download and set the path
		WebDriverManager.chromedriver().setup();

		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();

		//Load the URL
		driver.get("http://www.leafground.com/pages/table.html");

		//Maximize the window
		driver.manage().window().maximize();	

		//To find number of columns
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int colCount= column.size();
		System.out.println("Total number of columns: " + colCount);

		//To find number of rows
		List<WebElement> row = driver.findElements(By.tagName("tr"));
		int rowCount = row.size();
		System.out.println("Total number of rows: " + rowCount);

		//To get the Progress column value of 'Learn to interact with Elements'
		String prValue1 = driver.findElement(By.xpath("//font[text()[normalize-space()='80%']]")).getText();
		System.out.println("Progress column value in Row 3 of 'Learn to interact with Elements': " + prValue1);

		String prValue2 = driver.findElement(By.xpath("//font[text()[normalize-space()='30%']]")).getText();
		System.out.println("Progress column value in Row 4 of 'Learn to interact with Elements': " + prValue2);

		String prValue3 = driver.findElement(By.xpath("//font[text()[normalize-space()='80%']]")).getText();
		System.out.println("Progress column value in Row 5 of 'Learn to interact with Elements': " + prValue3);

		//To check the Vital Task checkbox of 'Handle Exceptions'
		driver.findElement(By.xpath("//font[text()[normalize-space()='Handle Exceptions']]/following::input[1]")).click();		
	}
}
