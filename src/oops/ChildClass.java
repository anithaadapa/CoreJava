package oops;

public class ChildClass extends Person{

	String Profession;
	
	public ChildClass() {
		
		System.out.println("Inside Child default constructor");
	}
	
	//CHILD CLASS CONSTRUCTOR
	public ChildClass(String Name, int Age, String Profession) {
		
		//SUPER IS TO CALL THE CONSTRUCTOR OF PARENT/PARAMETERS. Name and age is already in Person.
		super(Name,Age); 
		this.Profession = Profession;
		
	}
	
	//method override - display in both person and child class. it will print inside child instead of inside parent
	public void display() {
	
		System.out.println("Inside Child");
}
	
	public void print() {
		
		System.out.println("Inside Child");
	}
}
