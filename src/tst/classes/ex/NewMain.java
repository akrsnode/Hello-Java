package tst.classes.ex;

public class NewMain {

    private static int findSecondGreatest(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array is null");
        }
        if (array.length < 2) {
            throw new IllegalArgumentException("Array contain not enough elements: " + array.length);
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] array = null;

//        System.out.println(findSecondGreatest(array));
        array = new int[]{1};
        System.out.println(findSecondGreatest(array));
    }
}
