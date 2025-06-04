package homeassignment.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		//Launch the Browser
		EdgeDriver driver = new EdgeDriver();
		//Load the Url
		driver.get("http://leaftaps.com/opentaps/");
		//Enter Username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click the CRM/SFE link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Select the Leads tab
		driver.findElement(By.linkText("Leads")).click();
		//Click Create Lead Button
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manoj");
		//Enter Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bardwaj");
		//Enter Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//Enter Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Engineer");
		//Click Create Lead Button
		driver.findElement(By.name("submitButton")).click();
		//Close the Browser
		driver.close();
	}

}
