package seleniumpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDowns {

	static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement courseNameElement = driver.findElement(By.id("course"));
		courseNameElement.click();
		Select cdd = new Select(courseNameElement); // Using select class to handle dropdown

		cdd.selectByIndex(1); // Java
		cdd.selectByValue("net"); // Dot Net
		cdd.selectByVisibleText("Python"); // Python

		// MultiSelection DropDown

		WebElement multipledd = driver.findElement(By.id("ide"));

		Select mdd = new Select(multipledd); // Using select class to handle dropdown

		mdd.selectByIndex(0);
		mdd.selectByValue("vs");
		mdd.selectByVisibleText("NetBeans");

		List<WebElement> mddlist = mdd.getAllSelectedOptions();

		System.out.println("Selected value list:");

		for (WebElement clist : mddlist) {
			System.out.println("Course name: " + clist.getText());
		}

		mdd.deselectAll();

	}

}
