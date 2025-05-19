package techolutiontest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipTests {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		WebElement Searchpdoduct = driver.findElement(By.name("q"));

		Searchpdoduct.sendKeys("iPhone 16");

		Searchpdoduct.submit();

		WebElement iphone16White = driver
				.findElement(By.xpath("//div[contains(text(), 'iPhone 16') and contains(text(), '(White, 128 GB)')]"));

		iphone16White.click();

		Thread.sleep(3000);

		// Store original window handle
		String originalWindow = driver.getWindowHandle();
		System.out.println(originalWindow);

		// Get all window handles
		Set<String> allWindows = driver.getWindowHandles();

		if (allWindows.size() == 1) {
			System.out.println("Only one window is open. No new window detected.");
		} else {
			for (String window : allWindows) {
				if (!window.equals(originalWindow)) { // Check if it's a new window
					driver.switchTo().window(window); // Switch to the new window
					System.out.println(window); // Print the window handle

					System.out.println("Switched to new window: " + driver.getTitle());
					break; // Exit loop after switching to the first new window
				}
			}

			System.err.println("test");
			// driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G
			// _7Pd1Fp']")).click();
			WebElement priceElement = driver.findElement(By.xpath("//div[@class='Nx9bqj CxhGGd']"));

			String Phonerate = priceElement.getText();

			System.out.println("Phonerate" + Phonerate);

		}

	}

}
