package Actions;

import org.openqa.selenium.WebElement;

public class AppointmentLetter_Action 
{

	public static  void dateofissue()
	{
		ObjectRepository.AppointmentLetter_Object.dateofissue().sendKeys("");
		
	
	}
	public static  void address()
	{
		ObjectRepository.AppointmentLetter_Object.address().sendKeys("");
		
	
	}
	public static  void designation()
	{
		ObjectRepository.AppointmentLetter_Object.designation().selectByVisibleText("");
		
	
	}
	public static  void dateofjoining()
	{
		ObjectRepository.AppointmentLetter_Object.dateofjoining().sendKeys("");
		
	
	}
	public static  void package_Appointment()
	{
		ObjectRepository.AppointmentLetter_Object.package_Appointment().sendKeys("");
		
	
	}
	public static  void submit()
	{
		ObjectRepository.AppointmentLetter_Object.submit().click();
		
	
	}
}
