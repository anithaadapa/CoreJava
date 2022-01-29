package oops;


//properties of employee are name, employee id and salary. Collection of objects is class. Water bottle is object for eg.
	//create employees by object of the class with the properties
public class Employee {
	
	public String Name;
	public int EmployeeId;
	public static int Salary = 1000;
	public static String CompanyName = "Infosys";
	
	
	//constructor will never return value, the below one is constructor
	
	public Employee () {  //default constructor in case we want to add any new employee
		
	}
	public Employee(String Name,int EmployeeId, int Salary) {
		
		this.Name = Name;
		this.EmployeeId = EmployeeId;
		this.Salary = Salary;		
	
	}
	
	
		public void PrintAll() {
			System.out.println("Name of employee is " + Name);
			System.out.println("EmployeeId of employee is " + EmployeeId);
			System.out.println("Salary of employee is " + Salary);
			System.out.println("Company of employee is " + CompanyName);
			
	}
	

		//Second constructor with only name and employee id
	public Employee(String Name,int EmployeeId) {
		
		this.Name = Name;
		this.EmployeeId = EmployeeId;
		
	}
	
	// void is - no need to return. PrintName is METHOD function. Define methods like public void and call them in class.
	
	public void PrintName() {
		
		System.out.println("Name of employee is " + this.Name);
	}
	
	public void PrintSalary() {
		
		System.out.println("Salary of employee is " + Employee.Salary);
		System.out.println("company of employee is " +Employee.CompanyName);
	}
	
	public static void ChangeCompanyName() {
		
		Employee.CompanyName = "Ford Motor Company";
	}
	
public static void ChangeSalary() {
		
		Employee.Salary = 5000;
	}
}
