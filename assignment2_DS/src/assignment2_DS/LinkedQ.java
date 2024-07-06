package assignment2_DS;

import java.util.NoSuchElementException;

public class LinkedQ <E>{
    private Node<E> first;
    private Node<E> last;
    private int size;

    private static class Node<E> {
        private E item;
        private Node<E> next;
    }
    public LinkedQ() {
        first=null;
        last=null;
        size=0;
    }
    public void enqueue(E item) 
    {
        Node<E> oldLast=last;
        last=new Node<E>();
        last.item=item;
        last.next=null;
        if (isEmpty()) 
        {
            first=last;
        } else {
            oldLast.next=last;
        }
        size++;
    }

    public E dequeue() 
    {
        if (isEmpty()) 
        {
            throw new NoSuchElementException("Queue is empty");
        }
        E item=first.item;
        first=first.next;
        size--;
        if (isEmpty()) 
        {
            last=null;
        }
        return item;
    }

    public E peek() 
    {
        if (isEmpty()) 
        {
            throw new NoSuchElementException("Queue is empty");
        }5
        return first.item;
    }

    public boolean isEmpty() {
        return size==0;
    }
    
    public int size() 
    {
        return size;
    }

    public void concatenate(LinkedQ<E> q2) 
    {
        if (q2.isEmpty()) 
        {
            return;
        }
        if (isEmpty()) 
        {
            first=q2.first;
        } 
        else {
            last.next=q2.first;
        }
        last=q2.last;
        size+=q2.size;
        q2.first=null;
        q2.last=null;
        q2.size=0;
    }
}

