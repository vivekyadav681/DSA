import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.middleElement();
//        System.out.println(list.previous(list.get(40)))
        System.out.println(list.get(30));
        System.out.println(list.previous(list.get(30)));
    }
}