package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ApplyLeave_Object extends BaseClass
{

	public ApplyLeave_Object(WebDriver driver) 
	{
		super(driver);
		
	}
	public static WebElement element;

	static By startdate = By.xpath("");
	static By enddate = By.xpath("");
	static WebElement leavetype =driver.findElement(By.xpath(""));
	static By reason =By.xpath("");
	static By submit =By.xpath("");
	
	public static  WebElement startdate()
	{
		element = driver.findElement(startdate);
		
		return element;
	}
    
	public static  WebElement enddate()
	{
		element = driver.findElement(enddate);
		return element;
	}
	
	public static Select leavetype()
	{

		Select leavetype_value=new Select(leavetype);
		return leavetype_value;
	}
	
	public static WebElement reason()
	{
		element = driver.findElement(reason);
		return element;
	
	}
	
	public static WebElement submit()
	{
		element = driver.findElement(submit);
		return element;
	
	}
}
