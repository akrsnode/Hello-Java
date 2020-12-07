package tst.classes.ex;

import java.util.TreeSet;

public class FindSecondGreatest {

    private static int findSecondGreatest(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array is null");
        }
        TreeSet<Integer> setFromArray = new TreeSet<>();
        for (int elem : array) {
            setFromArray.add(elem);
        }
        if (setFromArray.size() < 2) {
            throw new IllegalArgumentException("Array contain not enough unique elements: " + setFromArray.size());
        }
        return setFromArray.lower(setFromArray.last());
    }

    public static void main(String[] args) {
        int[] array = null;
//        System.out.println(findSecondGreatest(array));
        array = new int[]{1};
//        System.out.println(findSecondGreatest(array));
        array = new int[]{1, 1};
//        System.out.println(findSecondGreatest(array));
        array = new int[]{1, 2};
        System.out.println(findSecondGreatest(array));
        array = new int[]{1, 2, 3, 4, 5};
        System.out.println(findSecondGreatest(array));
        array = new int[]{2, 1};
        System.out.println(findSecondGreatest(array));
        array = new int[]{-5, 61, -31, 0};
        System.out.println(findSecondGreatest(array));
        array = new int[]{-5, -61, -31, 0};
        System.out.println(findSecondGreatest(array));
        int[] array2 = new int[]{10, 10, 7, 8};
        System.out.println(findSecondGreatest(array2));
        array = new int[]{10, 10, 10, 10, 10};
        System.out.println(findSecondGreatest(array));
    }
}
