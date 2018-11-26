package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EmployeeDetails_Object extends BaseClass

{

	public EmployeeDetails_Object(WebDriver driver) 
	{
		super(driver);
		
	}
	public static WebElement element;

	static By joiningdate = By.xpath("");
	static WebElement package_EmpDetails =driver.findElement(By.xpath(""));
    static By UANnumber =By.xpath("");
	static By accountnumber =By.xpath("");
	
	static By submit =By.xpath("");
	
	public static  WebElement joiningdate()
	{
		element = driver.findElement(joiningdate);
		
		return element;
	}
	public static Select package_EmpDetails()
	{

		Select package_EmpDetails_value=new Select(package_EmpDetails);
		return package_EmpDetails_value;
	
	}
	

	public static WebElement UANnumber()
	{
		element = driver.findElement(UANnumber);
		return element;
	
	}
	public static WebElement accountnumber()
	{
		element = driver.findElement(accountnumber);
		return element;
	
	}
	
	
	public static WebElement submit()
	{
		element = driver.findElement(submit);
		return element;
	
	}

}
