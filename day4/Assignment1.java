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
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Anitha");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement industryDropdownElement = wait
				.until(ExpectedConditions.elementToBeClickable(By.name("industryEnumId")));
		Select industryDropdown = new Select(industryDropdownElement);
		industryDropdown.selectByIndex(3);
		WebElement ownershipDropdownElement = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipDropdown = new Select(ownershipDropdownElement);
		ownershipDropdown.selectByVisibleText("S-Corporation");
		WebElement dataSourceDropdownElement = driver.findElement(By.id("dataSourceId"));
		Select dataSourceDropdown = new Select(dataSourceDropdownElement);
		dataSourceDropdown.selectByValue("LEAD_EMPLOYEE");
		WebElement stateDropdownElement = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select stateDropdown = new Select(stateDropdownElement);
		stateDropdown.selectByIndex(50);
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
	}

}
