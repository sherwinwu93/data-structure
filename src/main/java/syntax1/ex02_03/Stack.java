package syntax1.ex02_03;

import java.util.EmptyStackException;

public class Stack<E> {
    private E[] elements;
    private int top;
    private final static int size = 100;
    public Stack() {
        elements = (E[]) new Object[size];
        top = -1;
    }

    public void push(E element) {
        if (top == size - 1) {
            throw new StackOverflowError();
        } else {
            elements[++top] = element;
        }
    }

    public E poll() {
        if (top == -1) {
            throw new EmptyStackException();
        } else {
            return elements[top--];
        }
    }

    public E peek() {
        return elements[top];
    }

    public boolean empty() {
        return top == -1;
    }
}
