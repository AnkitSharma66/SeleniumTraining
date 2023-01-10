package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNavigation {

	static WebDriver driver;
	static String fb = "https://www.facebook.com/";

	public static void main(String[] args) {

		// Navigate,Refresh,back,forward,get

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.navigate().to(fb);
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();

		// Locators
		driver.findElement(By.id("email")).sendKeys("Testname");
		System.out.println("Value entered by id");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.name("email")).sendKeys("Sendname");
		System.out.println("Value entered by name");
	}
}
