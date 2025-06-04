package homeassignment.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Raj");
		driver.findElement(By.name("lastname")).sendKeys("Kishore");
		WebElement dayDropdownElement = driver.findElement(By.id("day"));
		Select dayDropdown = new Select(dayDropdownElement);
		dayDropdown.selectByIndex(24);
		WebElement monthDropdownElement = driver.findElement(By.id("month"));
		Select monthDropdown = new Select(monthDropdownElement);
		monthDropdown.selectByValue("4");
		WebElement yearDropdownElement = driver.findElement(By.id("year"));
		Select yearDropdown = new Select(yearDropdownElement);
		yearDropdown.selectByVisibleText("1995");
		driver.findElement(By.name("reg_email__")).sendKeys("9750801802");
		driver.findElement(By.id("password_step_input")).sendKeys("Raj@123");
		driver.findElement(By.xpath("//label[text()='Male']")).click();

	}

}
