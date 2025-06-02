import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("popped: " + stack.pop());
        stack.print();
        System.out.println("size: " + stack.getSize());
    }
}