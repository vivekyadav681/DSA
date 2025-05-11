import java.util.Arrays;

public class Array {
    private int[] array;
    private int count = 0;

    public Array(int length) {
        this.array = new int[length];
    }

    private void resize() {
        int newArray[] = new int[count*2];
        for(int i = 0; i < count; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getLength() {
        return count;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }

    public void insert(int number) {
        if(array.length == count) resize();
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

        for (int i = 0; i < count/2; i++) {
            int num = array[i];
            array[i] = array[(count-1)-i];
            array[count-1-i] = num;
        }
    }

    public int lastElement() {
        return array[count-1];
    }

    public int get(int index) {
        if (index >= count)
            throw new IllegalArgumentException("index not in array");
        return array[index];
    }

    public void insertAt(int item, int index) {
        if(index >= count || index < 0) {
            throw new IllegalArgumentException();
        }
        if(array.length == count) resize();

        for(int i = count; i >= index; i--) {
            array[i] = array[i-1];
        }
        array[index] = item;
        count++;
    }

    public Array intersect(Array arr) {
        Array commons = new Array(1);
        for(int i =0; i < count; i++){
            for(int j = 0; j < arr.getLength(); j++){
                if(array[i] == arr.get(j)) commons.insert(array[i]);
            }
        }
        return commons;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, count));
    }
}
