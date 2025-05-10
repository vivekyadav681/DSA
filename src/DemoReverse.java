public class DemoReverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int count = 5;
        for (int i = 0; i < (count/2); i++) {
            int temp = array[i];
            array[i] = array[(count-1)-i];
            array[(count-1)-i] = temp;
        }
        for (int num: array) System.out.println(num);
    }
}
