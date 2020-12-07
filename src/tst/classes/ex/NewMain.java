package tst.classes.ex;

public class NewMain {

    private static int findSecondGreatest(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array is null.");
        }
        return 0;
    }

    public static void main(String[] args) {

//        int array[] = { 1, 2, 3, 4, 5 };
        int[] array = null;

        System.out.println(findSecondGreatest(array));


    }
}
