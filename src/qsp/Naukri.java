package qsp;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri 
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Automation\\Softwares\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> wins = driver.getWindowHandles();
		wins.remove(parent);
		System.out.println("===============");
		//For closing the child2,child1 i.e. in reverse order
		ArrayList<String> al = new ArrayList<>(wins);
		for(int i=al.size()-1; i>=0; i--)
		{
			driver.switchTo().window(al.get(i));
			driver.close();
		}
		//@To get the page title
		String title = driver.getTitle();
		System.out.println(title);
		
		//@To get the URL
		System.out.println(driver.getCurrentUrl());
		
		//@To get the pageSource
		String s = driver.getPageSource();
		System.out.println(s);
		
		//For closing parent the children
		//for(String win :wins)
		{
			//System.out.println(win);
			//driver.switchTo().window(win);
			//driver.close();
		}
		
	}

}

