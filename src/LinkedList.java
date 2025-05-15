import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(int value) {
        var node = new Node(value);

        if (isEmpty()) {
            first = last = node;
        }
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public void addFirst(int value) {
        var node = new Node(value);
        if(isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void print() {
        if(isEmpty())
            throw new NoSuchElementException();

        Node node = first;
        if(first == last) System.out.println(node.value);
        else {
            while (node != null) {
                System.out.println(node.value);
                node = node.next;
            }
        }
    }

    public int indexOf(int num) {
        int index = 0;
        var node = first;
        while (node != null) {
            if(node.value == num) return index;
            index++;
            node = node.next;
        }
        return -1;
    }

    public boolean contains(int num) {
        return indexOf(num) != -1;
    }

    public void deleteFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if( first == last) {
            first = last = null;
        }
        else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }
    private boolean isEmpty () {
        return (first == null);
    }

    public void deleteLast() {
        if(isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        }
        else {
            var node = first;
            while (node != null) {
                if (node.next == last) {
                    last = node;
                    last.next = null;
                }
                node = node.next;
            }
        }

        size--;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        if (isEmpty())
            throw new NoSuchElementException();

        int[] array = new int[size];
        var node = first;
        int i = 0;
        while(node != null) {
            array[i++] = node.value;
            node = node.next;
        }
        return array;
    }

    public void reverse() {
        if(isEmpty()) return;

        var previous = first;
        var current = first.next;
        while(current != null) {
            var store = current.next;
            current.next = previous;
            previous = current;
            current = store;
        }

        last = first;
        last.next = null;
        first = previous;
    }



}
