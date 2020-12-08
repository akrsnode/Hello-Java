package tsk.exercise;

import java.util.Arrays;
import java.util.Iterator;

class SimpleList implements Iterable<String> {

    private String[] strings = new String[0];

    void add(String string) {
        String[] newStrings = Arrays.copyOf(this.strings, strings.length + 1);
        newStrings[strings.length] = string;
        strings = newStrings;
    }

    @Override
    public String toString() {
        return Arrays.toString(strings);
    }

    @Override
    public Iterator<String> iterator() {
        return new StringIterator();
    }

    class StringIterator implements Iterator<String> {

        private int index = 0;

        public StringIterator() {
        }

        @Override
        public boolean hasNext() {
            return (index < strings.length);
        }

        @Override
        public String next() {
            String result = strings[index];
            index++;
            return result;
        }

        @Override
        public void remove() {
            String[] newStringArray = new String[strings.length - 1];
            if (strings.length > 1) {
                System.arraycopy(strings, 1, newStringArray, 0, strings.length - 1);
            }
            strings = newStringArray;

            System.out.println(Arrays.toString(newStringArray));//Only to see the changes
        }
    }
}
