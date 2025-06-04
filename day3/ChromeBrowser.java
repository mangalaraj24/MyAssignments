package homeassignment.day3;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		// Load the url using get method
		driver.get("https://www.facebook.com");
		// maximize the browser window
		driver.manage().window().maximize();
		// Close the browser using close method
		driver.close();

	}
}
