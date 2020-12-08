package tsk.exercise;

import java.util.ArrayList;
import java.util.Iterator;

public class SimpleListMain {
    public static void main(String[] args) {
        SimpleList list = new SimpleList();
        list.add("One");
        list.add("Two");
        list.add("Three");
        System.out.println(list.toString());

        for (String s : list) {
            System.out.println(s);
        }
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.remove();
        }

    }
}