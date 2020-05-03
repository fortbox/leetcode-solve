/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.no604;/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

import java.util.ArrayDeque;
import java.util.Deque;

class StringIterator {
    /**
     * Create a class to represent times and characters
     */
    Deque<Item> list;

    public StringIterator(String compressedString) {
        list = new ArrayDeque<>();
        StringBuilder builder = new StringBuilder();
        Character tc = null;
        for (int i = 0; i < compressedString.length(); i++) {
            char c = compressedString.charAt(i);
            if (c >= '0' && c <= '9') {
                builder.append(c);
            } else {
                if (builder.length() != 0) {
                    list.add(new Item(tc.charValue(), Integer.parseInt(builder.toString())));
                    builder = new StringBuilder();
                }
                tc = c;
            }
        }
        if (builder.length() != 0) {
            list.add(new Item(tc.charValue(), Integer.parseInt(builder.toString())));
        }
    }

    public char next() {
        if (hasNext()) {
            Item item = list.pollFirst();
            item.times--;
            if (item.times > 0) {
                list.addFirst(item);
            }
            return item.ch;
        }
        return ' ';


    }

    public boolean hasNext() {
        return list.size() > 0;

    }


    private class Item {
        public char ch;
        public long times;

        public Item(char ch, long times) {
            this.ch = ch;
            this.times = times;
        }
    }
}
