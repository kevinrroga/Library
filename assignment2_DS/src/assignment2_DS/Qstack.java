package assignment2_DS;

import java.util.Queue;
import java.util.LinkedList;

/*public class Qstack<T> implements Stack<T> {
    private Queue<T> q1;
    private Queue<T> q2;

    public Qstack() 
    {
        q1=new LinkedList<T>();
        q2=new LinkedList<T>();
    }

    public void push(T item) 
    {
        q1.add(item);
    }

    public T pop() 
    {
        if(isEmpty()) 
        {
            throw new IllegalStateException("Stack is empty");
        }

        while(q1.size()>1) 
        {
            q2.add(q1.remove());
        }

        T item=q1.remove();
        Queue<T> temp=q1;
        q1=q2;
        q2=temp;

        return item;
    }

    public T peek()
    {
        if (isEmpty()) 
        {
            throw new IllegalStateException("Stack is empty");
        }

        while (q1.size()>1) 
        {
            q2.add(q1.remove());
        }

        T item=q1.remove();
        q2.add(item);
        Queue<T> temp=q1;
        q1=q2;
        q2=temp;

        return item;
    }

    public boolean isEmpty() 
    {
        return q1.isEmpty();
    }

    public int size() 
    {
        return q1.size();
    }
}
*/
