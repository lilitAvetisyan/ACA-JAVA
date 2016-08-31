/**
 * Created by Lill on 8/31/16.
 */
public class Stack <T> {
    private T[] elements;
    private int top;

    public Stack(int size)
    {
        elements = (T[]) new Object[size];
        top = -1;
    }

    public void push (T newElement)
    {
        if (top == elements.length-1)
        {
            System.out.println("The stack is full"); // or throw stackfullexception
        }
        else
            elements[++top] = newElement;
    }

    public T pop()
    {
        if (isEmty())
        {
            System.out.println("The stack is empty"); // or throw stackemptyexception
            return null;
        }
        else
            return elements[top--];

    }

    public boolean isEmty()
    {
        return top == -1;
    }


}
