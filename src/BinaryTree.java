public class BinaryTree {
    private class Node {
        private int data;
        private Node leftChild;
        private Node rightChild;

        public Node(int data) {
            this.data = data;
        }
    }
    private Node root;

    public void insert(int data) {
        Node node = new Node(data);
        if(root == null) {
            root = node;
            return;
        }

        Node current = root;
        while(true) {
            if (current.data < data) {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    return;
                }
                current = current.rightChild;
            } else {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    return;
                }
                current = current.leftChild;
            }
        }
    }

}
