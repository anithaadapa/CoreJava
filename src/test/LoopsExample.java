package test;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//While Loop to print 1 to 10
		
		int num1 = 1;
		
		while(num1<=10) {
			
			if(num1==5) {
				num1 =num1+1;
				continue;
			}
		System.out.println(num1);
		num1 =num1+1;

		}
      
		// For loop to type 1 to 10
		
		for( int count = 1;count<=10;count++) {
			
			if(count==5) {
				
				continue;
				//break instead of continue - will skip all the records after meeting this condition
			}
			System.out.println("inside for loop"  + count);
			
		}
			// For loop to type 10 to 1
			
			for( int count = 10;count>1;count--) {
				System.out.println("The count value"  + count);
							 			
		}
			
			
			//Arrays with Loop
			
			int[] array1 = {20,30,40,50,60};
			
			for(int index=0;index<array1.length;index++) {
				System.out.println("Value inside array"  + array1[index]);
				
			}
			
			for(int value:array1) {
				System.out.println(value);
			//or you can say var1 instead of value	
			}
	}

	}
	

