package week10.exercise2_2;

import java.util.Arrays;

public class MyHashMap implements MyMap {
    MyHashMapEntry[] table;
    final static int INITIAL_SIZE = 8;
    int size = 0;

    public MyHashMap() {
        table = new MyHashMapEntry[INITIAL_SIZE];
    }

    public Object get(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            return table[bucket].getValue();
        }
        return -1;
    }

    public void put(Object key, Object value) {
        if (capacityRatio() > 0.6) {
            enlarge();
        }
        int bucket = getBucket(key);
        if (table[bucket] == null) {
            table[bucket] = new MyHashMapEntry(key, value);
            size++;
        }
    }

    @Override
    public void remove(Object key) {
        try {


            int bucket = getBucket(key);
            if (table[bucket] != null) {
                table[bucket] = null;
            }
            size--;
        } catch (Exception e) {
            System.out.println("Invalid");
        }

    }

    @Override
    public boolean contains(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                sb.append(String.format("[bucket %d] -> null\n", i));
            } else {
                sb.append(String.format("[bucket %d] -> (%s, %s)\n", i, table[i].getKey(), table[i].getValue()));
            }
        }
        return sb.toString();
    }

    int getBucket(Object key) {
        int bucket = (Math.abs(key.hashCode()) % table.length);
        while (table[bucket] != null && table[bucket].getKey() != key) {
            bucket = (bucket + 1) % table.length;
        }
        return bucket;
    }

    double capacityRatio() {
        return size / (double)table.length;
    }

    void enlarge() {
        Arrays.copyOf(table, table.length*2);
    }
}
