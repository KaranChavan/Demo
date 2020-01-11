package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 

public class FacebookAccount 
{
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Automation\\Softwares\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	//driver.navigate().back();
	//Thread.sleep(2000);
	//driver.navigate().forward();
	//driver.navigate().refresh();
	driver.findElement(By.xpath("//*[@id='u_0_m']")).sendKeys("Karan");
	driver.findElement(By.xpath("//*[@id='u_0_o']")).sendKeys("Chavan");
	driver.findElement(By.xpath("//*[@id='u_0_r']")).sendKeys("9764046407");
	driver.findElement(By.xpath("//*[@id='u_0_w']")).sendKeys("jhgyug");
	Select day = new Select(driver.findElement(By.xpath("//*[@id='day']")));
	day.selectByValue("5");
	Select mon = new Select(driver.findElement(By.xpath("//*[@id='month']")));
	mon.selectByValue("3");
	Select year = new Select(driver.findElement(By.xpath("//*[@id='year']")));
	year.selectByValue("1996");
	driver.findElement(By.xpath("//*[@id='u_0_7']")).click();
	driver.findElement(By.xpath("//*[@id='u_0_13']")).click();
}
}
