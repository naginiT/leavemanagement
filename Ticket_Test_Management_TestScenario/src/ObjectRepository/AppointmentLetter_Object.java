package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AppointmentLetter_Object extends BaseClass

{

    public AppointmentLetter_Object(WebDriver driver)
     {
		super(driver);
	 }


	public static WebElement element;

	static By dateofissue = By.xpath("");
	static By address = By.xpath("");
	static WebElement designation =driver.findElement(By.xpath(""));
	static By dateofjoining =By.xpath("");
	static By package_Appointment =By.xpath("");
	static By submit =By.xpath("");
	
	public static  WebElement dateofissue()
	{
		element = driver.findElement(dateofissue);
		
		return element;
	}
    
	public static  WebElement address()
	{
		element = driver.findElement(address);
		return element;
	}
	
	public static Select designation()
	{

		Select designation_value=new Select(designation);
		return designation_value;
	}
	
	public static WebElement dateofjoining()
	{
		element = driver.findElement(dateofjoining);
		return element;
	
	}
	
	public static WebElement package_Appointment()
	{
		element = driver.findElement(package_Appointment);
		return element;
	
	}
	public static WebElement submit()
	{
		element = driver.findElement(submit);
		return element;
	
	}
}
