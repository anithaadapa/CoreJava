package oops;

public abstract class BankExample {

	public abstract void CheckBalance(); //explicitly use abstract in every method. No body is provided. That's why no curly braces. The abstract class only handles  methods. The body is described in another class
	
	public abstract void depositMoney();
	
	public abstract void WithdrawMoney();
	
	public void Welcome () {  //can have non abstract also 
		
		System.out.println("Welcome to Bank");
	}
	
}
