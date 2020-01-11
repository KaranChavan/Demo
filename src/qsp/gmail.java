package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Automation\\Softwares\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.gmail.com/");
	driver.findElement(By.id("identifierId")).sendKeys("9764046407");
	driver.findElement(By.id("identifierNext")).click();
	driver.findElement(By.name("password")).sendKeys("555");
	driver.findElement(By.xpath("//*[@id='passwordNext']/span/span")).click();
	
}
}