import java.util.List;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(5);
        array.insert(8);
        array.insert(11);
        array.insert(79);

        array.reverse();
        array.print();
    }
}