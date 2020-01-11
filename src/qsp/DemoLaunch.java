package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("9764046407");
		//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("");
		//driver.findElement(By.xpath("//*[@id='u_0_b\']")).click();
		//driver.close();
		
	}

}
