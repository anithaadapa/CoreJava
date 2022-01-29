package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new is memory allocation in Ram for employee
    /*Employee emp1 = new Employee(); //emp1 is object and assigning values
		emp1.Name ="Sachin";
        emp1.EmployeeId = 2453434;
        emp1.salary = 1000;*/
        
        
       /* Employee emp2 = new Employee();
        emp2.Name ="Balu";
        emp2.EmployeeId = 24538999;
        emp2.salary = 1500;*/
		
	//constructor
		
		Employee emp1 = new Employee("Sachin",2453434);
		Employee emp2 = new Employee("Balu",24538999);
		Employee emp3 = new Employee("Kapil",245387877);
		 Employee.ChangeCompanyName(); 
		 Employee.ChangeSalary();
		 
		 Employee emp4 = new Employee();
		 Person per1 = new Person();
		 ChildClass child1 = new ChildClass("Hima",30,"Tester");
		 ChildClass child  = new ChildClass();
		 child1.display();
		 child1.print();
		 
       // System.out.println( "Name of emp1 " + emp1.Name);
        //System.out.println( "Name of emp1 " + emp2.Name);
      
		
		MethodOverloadingExample obj = new MethodOverloadingExample();
		obj.sum(4, 6);
		obj.sum(4, 6,4);
		
		//BankExample bank = new BankExample(); // CANNOT CREATE OBJECT OF ABSTRACT CLASS
		ICICIBank bank1 = new ICICIBank();
		bank1.Creditcard();
		bank1.Welcome();
		
		EncapsulationExample obj10 = new EncapsulationExample();
		
		obj10.setName("anitha");
		System.out.println(obj10.getName());
		
		emp1.PrintAll();
        emp2.PrintAll();
       emp3.PrintAll();
      Employee.ChangeCompanyName();
         Employee.ChangeSalary();// you can change the salary as it is static
     
     }

}