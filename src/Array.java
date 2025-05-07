public class Array {
    private int[] array;
    private int count = 0;

    public Array(int length) {
        this.array = new int[length];
    }

    public void print() {

        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }

    }

    public void insert(int number) {

        if(array.length == count) {
            int[] newArray = new int[count * 2];
            for(int i = 0; i < count; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        array[count++] = number;
    }

    public void deleteAt(int index) {
        if(index > count) {
            System.out.println("element does not exist.");
        }
        else if (index != count) {
            for(int i = index; i < count-1; i++) {
                array[i] = array[i+1];
            }
            count--;
        }

    }

}
