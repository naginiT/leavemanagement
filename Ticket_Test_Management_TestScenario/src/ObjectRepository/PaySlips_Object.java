
package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaySlips_Object extends BaseClass
{

	public PaySlips_Object(WebDriver driver)
	{
		super(driver);
	}

	
	public static WebElement element;

	static By month = By.xpath("");
	static By submit =By.xpath("");
	
	public static  WebElement month()
	{
		element = driver.findElement(month);
		return element;
	}

	public static WebElement submit()
	{
		element = driver.findElement(submit);
		return element;
	
	}
	
}
