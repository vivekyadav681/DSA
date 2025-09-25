import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(15);
        tree.insert(20);
        tree.insert(10);
        tree.insert(22);
        tree.insert(7);
        tree.insert(18);
        tree.insert(2);
        System.out.println("done");
        System.out.println(tree.find(200));
        tree.traverseInOrder();
    }
}