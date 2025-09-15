import java.util.NoSuchElementException;
import java.util.Stack;

public class StackQueue {
    private Stack<Integer> addingStack = new Stack<>();
    private Stack<Integer> removalStack = new Stack<>();
    private int size;

    public void enqueue(int item) {
        addingStack.push(item);
        size++;
    }

    public int dequeue() {
        if(isEmpty()) throw new NoSuchElementException();

        if(removalStack.empty()) tranferValues();
        size--;
        return removalStack.pop();
    }

    public int peek() {
        if(isEmpty()) throw new NoSuchElementException();

        if(removalStack.empty()) tranferValues();
        return removalStack.peek();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void tranferValues() {
        while(!addingStack.empty())
            removalStack.push(addingStack.pop());
    }

}
