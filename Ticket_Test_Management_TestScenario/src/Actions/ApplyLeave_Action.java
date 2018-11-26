package Actions;


 //ObjectRepository

public class ApplyLeave_Action
{

	public static void startdate()
	{
		ObjectRepository.ApplyLeave_Object.startdate().sendKeys("");
	}

	public static void enddate()
	{
		ObjectRepository.ApplyLeave_Object.enddate().  sendKeys("");
	}
	public static void leavetype()
	{
		ObjectRepository.ApplyLeave_Object.leavetype().selectByValue("");
	}
	public static void reason()
	{
		ObjectRepository.ApplyLeave_Object.reason().sendKeys("");
	}
	public static void submit()
	{
		ObjectRepository.ApplyLeave_Object.submit().click();
	}
}
