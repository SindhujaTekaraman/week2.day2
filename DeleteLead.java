package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Download and set the path
		WebDriverManager.chromedriver().setup();

		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();

		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/main");

		//Maximize the window
		driver.manage().window().maximize();

		//To enter the User Name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		//To enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//To click on Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		//To click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		//To click on Leads tab
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		//To click on Find Leads link
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		//To click on Phone tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		//To enter the Phone Number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("23115671255");

		//To click on Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(2000);
		
		//To capture Lead ID of first resulting lead
		String firstLeadID = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[1]/div/a[1]")).getText();
		
		//To click on first resulting lead
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr/td[1]/div/a[1]")).click();

		//To click on Delete button
		driver.findElement(By.xpath("//a[text()='Delete']")).click();

		//To click on Find Leads button
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		//To enter the captured first resulting lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstLeadID);
		
		//To click on Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
		//To verify the message "No records to display" in the Lead List
		driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		
		//To close the browser
	    //driver.close();
	}
}