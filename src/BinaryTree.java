public class BinaryTree {

    private class Node {
        private int data;
        private Node leftChild;
        private Node rightChild;

        public Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "data = " + data;
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


    public boolean find(int data) {
        Node current = root;
        while (current != null) {
            if(current.data == data) {
                return true;
            }
            else if( current.data > data) {
                 current = current.leftChild;
            }
            else  {
                current = current.rightChild;
            }
        }
        return false;
    }


    public void traversePreOrder() {
        traversePreOrder(root);
    }


    private void traversePreOrder(Node root) {
        if (root == null) return;

        System.out.println(root.data);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }


    public void traverseInOrder() {
        traverseInOrder(root);
    }


    private void traverseInOrder(Node root) {
        if(root == null) return;

        traverseInOrder(root.leftChild);
        System.out.println(root.data);
        traverseInOrder(root.rightChild);
    }


    public void traversePostOrder() {
        traversePostOrder(root);
    }


    private void traversePostOrder(Node root) {
        if(root == null) return;

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.data);
    }

}
