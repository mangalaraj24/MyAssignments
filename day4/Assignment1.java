package homeassignment.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

	public static void main(String[] args) {
		//// Launch the Edge browser
		EdgeDriver driver = new EdgeDriver();
		// Open the application URL
		driver.get("http://leaftaps.com/opentaps/");
		// Maximize the browser window
		driver.manage().window().maximize();
		// Enter username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		// Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		// Click on CRM/SFA link after login
		driver.findElement(By.linkText("CRM/SFA")).click();
		// Click on Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		// Click on Create Account
		driver.findElement(By.linkText("Create Account")).click();
		// Enter account name
		driver.findElement(By.id("accountName")).sendKeys("Anitha");
		// Enter account description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		// Explicit wait: wait for industry dropdown to be clickable
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// Find and select an industry by index
		WebElement industryDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(By.name("industryEnumId")));

		Select industryDropdown = new Select(industryDropdownElement);
		industryDropdown.selectByIndex(3);
		// Find and select ownership type by visible text
		WebElement ownershipDropdownElement = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipDropdown = new Select(ownershipDropdownElement);
		ownershipDropdown.selectByVisibleText("S-Corporation");
		// Find and select data source by value
		WebElement dataSourceDropdownElement = driver.findElement(By.id("dataSourceId"));
		Select dataSourceDropdown = new Select(dataSourceDropdownElement);
		dataSourceDropdown.selectByValue("LEAD_EMPLOYEE");
		// Find and select state/province by index
		WebElement stateDropdownElement = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateDropdown = new Select(stateDropdownElement);
		stateDropdown.selectByIndex(50);
		// Click on Create Account (submit button)
		driver.findElement(By.className("smallSubmit")).click();
		// Close the browser
		driver.close();
	}

}
