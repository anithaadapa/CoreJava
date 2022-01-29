package test;

public class PrimeNumCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 13;
		
		boolean flag = true;
		for(int index=2;index<num;index++) {
			
			int remainder = num%index;
			if(remainder == 0) {
				flag = false;
				break;
			}
		}
          if(flag ==true) {
        	  System.out.println("The number is prime");
        	  
          }else {
        	  System.out.println("The num is not prime");
          }
		}

	

	}


