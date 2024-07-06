package assignment2_DS;

import java.util.Scanner;
import java.util.Stack;

public class Ushtrim3 {

	public static void main(String[] args) {
	    Stack<Integer> stack = new Stack<Integer>();
	    try (Scanner s = new Scanner(System.in))
	    {
			System.out.println("Enter the nr of elements:");
			int n=s.nextInt();
			int i;
			
			System.out.println("Enter the elements:");
			for(i=0;i<n;i++)
			{
				stack.push(s.nextInt());
			}
			
			System.out.println("Stack size: " + stack.size());
			System.out.println("Top element: " + stack.peek());
			
			int popped = stack.pop();
			System.out.println("Popped element: " + popped);
			System.out.println("Stack size after pop: " + stack.size());
			System.out.println("Enter a element you want to push:");
			int e=s.nextInt();
			stack.push(e);
		}
        
        System.out.println("Top element after push: " + stack.peek());
	    
	    while (!stack.isEmpty()) 
	    {
	        int element = stack.pop();
	        System.out.println("Popped element: " + element);
	    }
	    
	    System.out.println("Stack size after popping all elements: " + stack.size());
	}

}
