package homeassignment.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		//Launch the Browser
		EdgeDriver driver = new EdgeDriver();
		//Load the Url
		driver.get("https://en-gb.facebook.com/");
		//Maximise the Window
		driver.manage().window().maximize();
		//Explicit Wait for page to open completely
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Click Create Account Button
		driver.findElement(By.linkText("Create new account")).click();
		//Enter first name
		driver.findElement(By.name("firstname")).sendKeys("Raj");
		//Enter Last Name
		driver.findElement(By.name("lastname")).sendKeys("Kishore");
		//Find and Seelct Day by Index
		WebElement dayDropdownElement = driver.findElement(By.id("day"));
		Select dayDropdown = new Select(dayDropdownElement);
		dayDropdown.selectByIndex(24);
		//Find and select month by value
		WebElement monthDropdownElement = driver.findElement(By.id("month"));
		Select monthDropdown = new Select(monthDropdownElement);
		monthDropdown.selectByValue("4");
		//Find and select year by visible text
		WebElement yearDropdownElement = driver.findElement(By.id("year"));
		Select yearDropdown = new Select(yearDropdownElement);
		yearDropdown.selectByVisibleText("1995");
		//Enter the email or Number
		driver.findElement(By.name("reg_email__")).sendKeys("9750801802");
		//Enter the Password
		driver.findElement(By.id("password_step_input")).sendKeys("Raj@123");
		//Select the gender by using Xpath locator
		driver.findElement(By.xpath("//label[text()='Male']")).click();

	}

}
