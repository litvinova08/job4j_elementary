package traker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] withKeyNames = new Item[size];
        int countWithKeyNames = 0;
        for (int index = 0; index < size; index++) {
            if (items[index].getName().equals(key)) {
                withKeyNames[countWithKeyNames] = items[index];
                countWithKeyNames++;
            }
        }
        return withKeyNames = Arrays.copyOf(withKeyNames, countWithKeyNames);
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(int id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index == -1) {
            rsl = false;
        } else {
            items[index] = null;
            int start = index + 1;
            int length = size - index;
            System.arraycopy(items, start, items, index, length);
            items[size - 1] = null;
            size--;
            rsl = true;
        }
        return rsl;
    }
}

