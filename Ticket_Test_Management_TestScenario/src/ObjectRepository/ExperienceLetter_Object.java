package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ExperienceLetter_Object extends BaseClass
{

	public ExperienceLetter_Object(WebDriver driver)
	{
		super(driver);
	
	}
	public static WebElement element;

	static By date = By.xpath("");
	static By startdate =By.xpath("");
	static By enddate =By.xpath("");
	
	static By submit =By.xpath("");
	
	public static  WebElement date()
	{
		element = driver.findElement(date);
		
		return element;
	}
	public static WebElement startdate()
	{
		element = driver.findElement(startdate);
		return element;
	
	}
	public static WebElement enddate()
	{
		element = driver.findElement(enddate);
		return element;
	
	}
	
	
	public static WebElement submit()
	{
		element = driver.findElement(submit);
		return element;
	
	}
}
