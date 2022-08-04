package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead 
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

		//To enter First Name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Zsind");

		//To click on Find Leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(2000);

		//To click on first resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]")).click();

		//To verify title of the page
		String verifyTitle = driver.getTitle();
		if (verifyTitle.equals("View Lead | opentaps CRM")) 
		{
			System.out.println("The title of the page is verified");
		}

		//To click on Edit button
		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		//To change the Company Name
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Tesla");

		//To click on Update button
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();

		//To verify the changed Company Name
		String updatedName = driver.findElement(By.xpath("//span[contains(text(),'Tesla')]")).getText();
		if (updatedName.contains("Tesla")) 
		{
			System.out.println("The Company Name is changed - " + updatedName);
		}

		//To close the browser
		//driver.close();
	}
}
