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

    public void addLast(int value) {
        var node = new Node(value);

        if (isEmpty()) {
            first = last = node;
        }
        else {
            last.next = node;
            last = node;
        }
    }

    public void addFirst(int value) {
        var node = new Node(value);
        if(isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }

    public void print() {
        Node node = first;
        if(first == last) System.out.println(node.value);
        else {
            while (true) {
                System.out.println(node.value);
                if (node.next == null) {
                    System.out.println(node.value);
                    break;
                }
                node = node.next;
            }
        }
    }

    public int indexOf(int num) {
        int index = 0;
        if (!isEmpty()) {
            var node = first;
            while (true) {
                if (num == node.value)
                    return index;
                node = node.next;
                index++;
            }
        }
        return -1;
    }

    private boolean isEmpty () {
        return (first == null);
    }

}
