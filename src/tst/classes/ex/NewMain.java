package tst.classes.ex;

import java.util.Arrays;

public class NewMain {

    private static int findSecondGreatest(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array is null");
        }
        if (array.length < 2) {
            throw new IllegalArgumentException("Array contain not enough elements: " + array.length);
        }
        Arrays.sort(array);
        return array[array.length-2];
    }

    public static void main(String[] args) {
        int[] array = null;
//        System.out.println(findSecondGreatest(array));
        array = new int[]{1};
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
    }
}
