import java.util.List;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(5);
        array.insert(8);
        array.insert(11);
        array.insert(79);
        array.insert(67);
        array.insert(66);

        array.insertAt(55, 2);
        array.insertAt(49, 3);
        //array.print();
        Array array2 = new Array(4);
        array2.insert(2);
        array2.insert(5);
        array2.insert(79);
        array2.insert(85);
        array2.insert(55);
        array.insert(4);
        System.out.println(array);
        System.out.println(array.intersect(array2));
    }
}