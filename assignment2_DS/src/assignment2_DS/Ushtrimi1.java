package assignment2_DS; //krroga21

import java.util.Scanner;

public class Ushtrimi1 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) 
        {
            this.val = val;
        }
        ListNode(int val, ListNode next) 
        {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode addTwoNumbers(ListNode list1, ListNode list2) 
    {
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        int carry = 0;
        while (list1 != null || list2 != null) 
        {
            int sum = carry;
            if (list1 != null) 
            {
                sum+=list1.val;
                list1 = list1.next;
            }
            if (list2 != null) 
            {
                sum += list2.val;
                list2 = list2.next;
            }
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            carry = sum/10;
        }
        if (carry>0) 
        {
            curr.next = new ListNode(carry);
        }
        return temp.next;
    }

    public static void main(String[] args) 
    {
        try (Scanner scan = new Scanner(System.in))
        {
			int i;
			System.out.println("Input nr of elements of LL1:");
			//LL1 is short for first linked list
			int n1 = scan.nextInt();
			ListNode list1 = new ListNode(0);
			ListNode current = list1;
			System.out.println("Enter the elements of LL1:");
			for (i = 0; i < n1; i++) {
			    int element = scan.nextInt();
			    current.next = new ListNode(element);
			    current = current.next;
			}
			list1 = list1.next;

			System.out.println("Input nr of elements of LL2:");
			//LL2 is short for second Linked List
			int n2 = scan.nextInt();
			ListNode list2 = new ListNode(0);
			current = list2;
			System.out.println("Enter the elements of LL2:");
			for (i = 0; i < n2; i++) 
			{
			    int element = scan.nextInt();
			    current.next = new ListNode(element);
			    current = current.next;
			}
			list2 = list2.next;

			ListNode sum = addTwoNumbers(list1, list2);
			System.out.println("The sum of the two linked lists is:");
			while (sum != null) {
			    System.out.print(sum.val + " ");
			    sum = sum.next;
			}
			scan.close();
}}}
