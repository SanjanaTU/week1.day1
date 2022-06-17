package week1.day2.assignment;

public class EmployeeDetails {
	
	public static void main(String[] agrs)
	{
		
	EmployeeDetails obj = new EmployeeDetails();
	obj.printEmployeeName("Sanjana", 78);	
	obj.getEmployeeAddress("chennai");
	obj.printEmployeeSalary(78945.1354);
	obj.printEmployeeMobileNumber(879495681);

}
 public void printEmployeeName(String empName,int empId)
{
	System.out.println("EmpName:"+empName);
	System.out.println("EmpId:"+empId);
}

 public void getEmployeeAddress(String empAddress) 
 {
	System.out.println("EmployeeAddress:"+empAddress);
}
 public void printEmployeeSalary(double empSalary)
 {
	 System.out.println("EmpSalary:"+empSalary);
 }
 public void printEmployeeMobileNumber(long mobNum)
 {
	 System.out.println("Mobile Number:"+mobNum);
 }
 }
