public class Stack {

    private LinkedList list = new LinkedList();

    public void push(int element) {
        list.addLast(element);
    }

    public int pop() {
        int size = list.size();
        int popped = list.getLast();
        list.deleteLast();
        return popped;
    }

    public int peek() {
        return list.getLast();
    }

    public void print() {
        list.print();
    }
}
