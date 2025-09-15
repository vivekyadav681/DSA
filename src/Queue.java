public class Queue {
    private class Node {
        public int data;
        public Node next;
        public Node(int data) {this.data = data;}
    }
    private Node front;
    private Node back;
    private int size;

    public void add(int item) {
        Node node = new Node(item);
        if(isEmpty()) {
            front = back = node;
        }
        else {
            back.next = node;
            back = node;
        }
        size++;
    }
    public boolean isEmpty() {
        return front == null;
    }

    public int remove() {
        return 1;
    }
}
