import java.util.Arrays;

public class PriorityQueue {
    private int[] items = new int[5];
    private int count = 0;

    public void add(int item) {
        if(count == items.length) throw new IllegalStateException();

        int i;
        for(i = count-1; i >= 0; i-- ) {
            if(items[i] > item) {
                items[i+1] = items[i];
            }
            else break;
        }
        items[i+1] = item;
        count++;
    }

    public int remove() {
        int item = items[0];
        for(int i = 0; i < count-1; i++) {
            items[i] = items[i+1];
        }
        items[count-1] = 0;
        count--;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
