import java.util.Arrays;

public class ArrayQueue {
    private int[] queue;
    int front, rear;
    private int count;

    public ArrayQueue(int size) {
        queue = new int[size];
    }

    public void enqueue(int item) {
        if(count == queue.length) throw new IllegalArgumentException();
        queue[rear] = item;
        rear = (rear + 1) % queue.length;
        count++;
    }

    public int dequeue() {
        if(isEmpty()) throw new IllegalArgumentException();
        var item = queue[front];
        queue[front] = 0;
        front = (front+1) % queue.length;
        count--;
        return item;
    }

    public int peek() {
        return queue[front];
    }

    public boolean isEmpty() {
        return queue == null;
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
