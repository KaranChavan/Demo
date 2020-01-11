package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectdemo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Automation\\Softwares\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("C:/Users/HP/Desktop/not.html");
		WebElement val =driver.findElement(By.id("b"));
		Select s = new Select(val);
		if (s.isMultiple())
		{
			List<WebElement> vals = s.getOptions();
			for (WebElement valSelect : vals) 
			{
				String opts= valSelect.getText();
				s.selectByValue(opts);
				
				System.out.println(opts);
			}
		}
		System.out.println("===================");
		List<WebElement> opt = s.getAllSelectedOptions();
		for(WebElement opts : opt)
		{
			System.out.println(opts.getText());
			s.deselectByValue(opts.getText());
		}
		for (int i = opt.size()-1;i>=0;i--)
		{
			s.deselectByValue(opt.get(i).getText());
		}
		System.out.println("=================");
		//System.out.println(s.getFirstSelectedOption().getText());
		}


}
