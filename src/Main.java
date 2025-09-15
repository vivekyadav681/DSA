import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        HashTable hash = new HashTable();
        hash.put(2, "something");
        hash.put(33, "something else");
        hash.put(41, "idk what");
        System.out.println(hash);
    }
}