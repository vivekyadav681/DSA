import java.util.List;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(5);
        array.insert(8);
        array.insert(11);
        array.insert(14);
        array.insert(79);
        //array.deleteAt(0);
        array.print();
        System.out.println(array.search(79));



    }
}