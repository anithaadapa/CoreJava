package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack<Integer> stack1 = new Stack<Integer>();
		
		stack1.push(4); // first this will be add in the bucket
		stack1.push(8); // second one added in the bucket
		stack1.push(12); // third one added in the bucket
		stack1.pop(); // will automatically remove value in the top which is 12
		stack1.push(3);
		
		System.out.println(stack1);
		System.out.println(stack1.peek());
		System.out.println(stack1.firstElement()); // not stack but it is vector
	}

}
