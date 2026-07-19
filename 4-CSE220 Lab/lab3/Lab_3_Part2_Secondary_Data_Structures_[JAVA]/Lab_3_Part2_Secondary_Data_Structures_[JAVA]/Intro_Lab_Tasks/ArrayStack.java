package Intro_Lab_Tasks;

public class ArrayStack {

    private Object[] stack;
    private int top;

    public ArrayStack(int size) {
        stack = new Object[size];
        top = -1;
    }

     public void push(Object element) {
        if (top == stack.length - 1) {
            System.out.println("stack overflow");
            return;
        }
        top++;
        stack[top] = element;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("stack underflow");
            return null;
        }
        Object element = stack[top];
        stack[top] = null; // optional cleanup
        top--;
        return element;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
    
}
