package assignment2_DS;

import java.util.Scanner;

public class Ushtrimi6 {
    public static void main(String[] args) {
        try (Scanner scanf = new Scanner(System.in)) {
			LinkedQ<Integer> queue1=new LinkedQ<>();
			System.out.print("Enter nr of elements for the first queue:");
			int n=scanf.nextInt();
			int i;
			System.out.print("Enter the elements:");
			for (i=0;i<n;i++) 
			{
			    queue1.enqueue(scanf.nextInt());
			}
			
			LinkedQ<Integer> queue2=new LinkedQ<>();
			System.out.print("Enter nr of elements for the second queue:");
			int m=scanf.nextInt();
			System.out.print("Enter the elements:");
			for (i=0;i<m;i++) 
			{
			    queue2.enqueue(scanf.nextInt());
			}
			
			queue1.concatenate(queue2);
			while (!queue1.isEmpty()) 
			{
			    System.out.println("The concatenated queue is: " + queue1.dequeue());
			}
		}
    }
}
