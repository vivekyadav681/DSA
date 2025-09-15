import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashTable {
    private class Entry {
        int key;
        String value;
        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }
    private LinkedList<Entry>[] list = new LinkedList[10];

    private int hash(int key) {
        return key % list.length;
    }

    public void put(int key, String value) {
        var index = hash(key);
        var bucket = list[index];
        if(list[index] == null) {
            list[index] = new LinkedList<>();
        }
        for(var entry : bucket) {
            if(entry.key == key) {
                entry.value = value;
                return;
            }
        }
        bucket.addLast(new Entry(key, value ));

    }

    public String get(int key) {
        var index = hash(key);
        var bucket = list[index];
        if(list[index] != null) {
            for(var entry: bucket) {
                if(entry.key == key) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    public void remove(int key) {
        var index = hash(key);
        var bucket = list[index];
        if(bucket == null) throw new IllegalStateException();
        for(var entry: bucket) {
            if(entry.key == key) {
                bucket.remove(entry);
                return;
            }
        }
        throw new IllegalStateException();
    }

    @Override
    public String toString() {
        String output = "[";
        for(var elements : list) {
            output += elements.toString() + ", \n";
        }
        return output;
    }

}
