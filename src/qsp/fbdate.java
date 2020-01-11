package qsp;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbdate 
{
	public static void main(String[] args) 
{
	System.setProperty("webdriver.driver.chromedrivrer", "C:\\Users\\HP\\eclipse-workspace\\Automation\\Softwares\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("www.facebook.com");
	WebElement day =driver.findElement(By.id("day"));
	Select s = new Select(day);
	List<WebElement> days = s.getOptions();
	for (WebElement dayNum : days)
	{
		System.out.println(dayNum.getText());
	}
	System.out.println(days.getClass());
	
	
}

}
