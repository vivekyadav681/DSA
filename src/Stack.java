import java.util.NoSuchElementException;

public class Stack {

    private static class StackNode {
        int data;
        StackNode prev;

        public StackNode(int data) {
            this.data = data;
        }
    }

    private StackNode top;
    private StackNode base;
    int size;

    public void push(int data) {
        StackNode node = new StackNode(data);
        node.prev = top;
        top = node;
        size++;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int pop() {
        if(isEmpty())
            throw new NoSuchElementException("Stack is empty");
        StackNode node = top;
        top = top.prev;
        return node.data;
    }

    public void print() {
        if(isEmpty()) throw new NoSuchElementException("Stack is empty");
        StackNode node = top;
        while(node.prev != null) {
            System.out.println(node.data);
            node = node.prev;
        }
    }
}
