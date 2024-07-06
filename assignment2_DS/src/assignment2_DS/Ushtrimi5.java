package assignment2_DS;
import java.util.Scanner;

public class Ushtrimi5 {
    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in)) 
        {
			System.out.print("Enter capacity of the LeakyStack: ");
			int capacity=scanner.nextInt();
			Leakystack<Integer> stack=new Leakystack<Integer>(capacity);

			while(true)
			{
			    System.out.print("Enter a command (push, pop, peek, size, exit): ");
			    String instruct=scanner.next();

			    if(instruct.equals("push")) 
			    {
			        System.out.print("Enter the value to push: ");
			        int value=scanner.nextInt();
			        stack.push(value);
			        System.out.println("Pushed "+value+" to the stack.");
			    }
			    else if(instruct.equals("pop")) 
			    {
			        if (stack.isEmpty()) 
			        {
			            System.out.println("Stack is empty.");
			        } 
			        else 
			        {
			            int value=stack.pop();
			            System.out.println("Popped "+value+" from the stack.");
			        }
			    } 
			    else if (instruct.equals("peek")) 
			    {
			        if (stack.isEmpty()) 
			        {
			            System.out.println("Stack is empty.");
			        } 
			        else {
			            int value=stack.peek();
			            System.out.println("Top element in stack is "+value+ ".");
			        }
			    } 
			    else if (instruct.equals("size")) 
			    {
			        System.out.println("Size of stack is "+stack.size()+ ".");
			    } 
			    else if (instruct.equals("exit")) 
			    {
			        System.out.println("Exiting program.");
			        break;
			    } 
			    else {
			        System.out.println("Invalid instruction.");
			    }
}}}}