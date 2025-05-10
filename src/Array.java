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
        if((index >= count) || (index < 0)) {
            throw new IllegalArgumentException();
        }

        for(int i = index; i < count; i++) {
            array[i] = array[i+1];
        }
        count--;
    }

    public int search(int number) {
        for(int i = 0; i < count; i++) {
            if(array[i] == number)
                return i;
        }
        return -1;
    }

    public int max() {
        if(count == 0)
            throw new IllegalArgumentException("null array");
        int max = 0;
        for(int i = 0; i < count; i++) {
            if(array[i] > array[max]) max = i;
        }
        return max;
    }

    public void reverse() {
        if(count == 0)
            throw new IllegalArgumentException("null array.");

        for (int i = 0; i < count-1; i++) {
            int num = array[i];
            array[i] = array[(count-1)-i];
            array[count-i] = num;
        }
    }

    public int lastElement() {
        return array[count];
    }
    public int get(int index) {
        if (index >= count)
            throw new IllegalArgumentException("index not in array");
        return array[index];
    }

}
