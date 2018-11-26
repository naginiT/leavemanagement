package Actions;

public class PaySlips_Action 
{
   
	public static  void  date()
	{
	  ObjectRepository.PaySlips_Object.month().sendKeys("");
	}
	public static  void  submit()
	{
	  ObjectRepository.PaySlips_Object.submit().click();
	}
}
