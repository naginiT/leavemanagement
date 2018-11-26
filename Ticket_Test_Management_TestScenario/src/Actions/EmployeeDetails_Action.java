package Actions;

public class EmployeeDetails_Action 

{

	public static void joiningdate()
	{
		ObjectRepository.EmployeeDetails_Object.joiningdate().sendKeys("");
	}
	public static void package_EmpDetails()
	{
		ObjectRepository.EmployeeDetails_Object.package_EmpDetails().selectByVisibleText("");
	}
	
	public static void UANnumber()
	{
		ObjectRepository.EmployeeDetails_Object.UANnumber().sendKeys("");
	}
	public static void accountnumber()
	{
		ObjectRepository.EmployeeDetails_Object.accountnumber().sendKeys("");
	}
	public static void submit()
	{
		ObjectRepository.EmployeeDetails_Object.submit().click();
	}
}
