package assignment2_DS;

import java.util.Scanner;

public class Ushtrimi2 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode removeNodeFromTheEnd(ListNode head, int n) 
    {
        ListNode temp = new ListNode(0);
        temp.next = head;
        int length = 0;
        ListNode curr = head;

        while (curr != null) 
        {
            length++;
            curr = curr.next;
        }

        length -= n;
        curr = temp;

        while (length > 0) 
        {
            length--;
            curr = curr.next;
        }

        curr.next = curr.next.next;
        return temp.next;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the nr of elements:");
			int nr = input.nextInt();

			ListNode head = new ListNode();
			ListNode current = head;

			System.out.println("Enter the elements:");
			int i,value;
			for (i = 0; i < nr; i++) 
			{
			    value = input.nextInt();
			    current.next = new ListNode(value);
			    current = current.next;
			}
			head = head.next;

			System.out.println("Enter the value of x:");
			int x = input.nextInt();

			ListNode result = removeNodeFromTheEnd(head, x);

			while (result != null) 
			{
			    System.out.print(result.val + " ");
			    result = result.next;
			}

			input.close();
		}
    }
}
