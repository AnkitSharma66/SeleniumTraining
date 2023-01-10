package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Operators {

	static WebDriver driver;
	static String fb = "https://www.facebook.com/";

	public static void main(String[] args) {

		// Navigate,Refresh,back,forward,get

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		String lvalue = driver.findElement(By.xpath("//td[text()<5000]")).getText(); // Math Operator 
		System.out.println("Less operator value " +lvalue);
		
		String evalue = driver.findElement(By.xpath("//td[text()=7000]")).getText(); // Math Operator 
		System.out.println("Equal operator value " +evalue);
		
		
		driver.findElement(By.xpath("//input[@name='refreshbtn' or @value='Refresh']")).click(); //logic Operator 
		System.out.println("Refresh button clicked");
		
		
		
		//Functions text() , contains(),start-with(), normalize   work with text and attribute value 
		
		//a[text()='Sign in')]   text method
		//a[contains(text(),'Sign in')]   	Contains for text
		//a[contains(@class,'Sign in')]   	Contains for attribute
		//a[starts-with(text(),'Sign in')] 	
		//a[normalize-space(text()) ='Sign in']
		
		
		
		driver.quit();
	}
}
