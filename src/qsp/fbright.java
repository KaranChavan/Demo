package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fbright 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Automation\\Softwares\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Actions a=new Actions(driver);
		WebElement ele = driver.findElement(By.id("email"));
		a.contextClick(ele).perform();
	

	}
}
