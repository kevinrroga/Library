package assignment2_DS;

public class Leakystack <T>{

	private int top;
    private T[] data;
	private int cap;
    private int size;
    
    @SuppressWarnings("unchecked")
    public Leakystack(int capacity) 
    {
    	this.size = 0;
        this.top = 0;
        this.cap=capacity;
        this.data = (T[]) new Object[capacity];
    }

    public void push(T item) 
    {
        if(size==cap) 
        {
            top=(top + 1)%cap;
        } else 
        {
            size++;
        }
        data[top]=item;
        top=(top+1)%cap;
    }

    public T pop() 
    {
        if (size == 0) 
        {
            throw new IllegalStateException("Stack is empty");
        }
        top=(top-1+cap)%cap;
        T item=data[top];
        data[top]=null;
        size--;
        return item;
    }

    public T peek() 
    {
        if (size == 0) 
        {
            throw new IllegalStateException("Stack is empty");
        }
        int index=(top-1+cap)%cap;
        return data[index];
    }

    public int size() 
    {
        return size;
    }
    public boolean isEmpty() 
    {
        return size == 0;
    }
}

