package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =10; //10 will not be divided by 0 - so that's why we get exception
		
     int[] array1 = {5,67,234,78};
		
		try {
			int result = num/0;
			//System.out.println(array1[10]);
			
		}catch(ArithmeticException e) {
			
			System.out.println("inside ArithmeticException");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("inside ArrayIndexOutOfBoundsException");
			
		} catch (Exception e) {
			
			System.out.println("inside default exception");
			
		} finally {
			
			System.out.println("inside finally");
		}
		
		System.out.println("after try and catch");
		

	}

}
