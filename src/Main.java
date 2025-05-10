import java.util.List;

public class Main {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(5);
        array.insert(8);
        array.insert(11);
        array.insert(79);
        array.reverse();
        System.out.println(array.lastElement());
        array.print();
        System.out.println("############");
        for(int i = 0; i < 4; i++){
            System.out.println(array.get(i));
        }



    }
}