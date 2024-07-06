package assignment2_DS;

import java.util.Scanner;
import java.util.Stack;

public class Ushtrimi4 {	
	
	public static int largestArea(int[] heights) 
	{
		int i;
	    int m=heights.length;
	    Stack<Integer> stack=new Stack<>();
	    int maxArea=0;
	    for (i=0;i<=m;i++)
	    {
	        while (!stack.isEmpty() && (i==m || heights[i]<heights[stack.peek()])) 
	        {
	            int h=heights[stack.pop()];
	            int w=stack.isEmpty() ? i : i-stack.peek()-1;
	            maxArea=Math.max(maxArea,h*w);
	        }
	        stack.push(i);
	    }
	    
	    return maxArea;
	}
	
	public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter nr of bars in the histogram:");
			int n=s.nextInt();
			int i;
			int[] height=new int[n];
			System.out.println("Enter the heights of the bars:");
			for (i=0;i<n;i++) {
			    height[i]=s.nextInt();
			}
			int largest=largestArea(height);
			System.out.println("The largest rectangle area is: "+largest);
		}
    }
	}