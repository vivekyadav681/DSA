import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(5);
        list.addLast(10);
        list.addLast(15);
        list.addLast(18);
        list.addFirst(55);
        list.addLast(34);
        list.print();
        System.out.println("######");
        System.out.println(list.KthFromLast(8));
    }
}