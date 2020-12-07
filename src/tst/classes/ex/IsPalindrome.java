package tst.classes.ex;

public class IsPalindrome {

    private static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        if (text.length() > 1) {
            StringBuilder reversedText = new StringBuilder(text).reverse();
            if (reversedText.toString().equals(text)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("ab"));
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("acab"));
        System.out.println(isPalindrome("AbBa"));
    }
}
