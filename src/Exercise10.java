/**
 * Created by branden on 3/10/16 at 10:05.
 */
public class Exercise10 {

    public static void main(String[] args) throws Exception {

        String palindrome = "racecar";
        String nonPalindrome = "hello";

        if (isPalindromWhile(palindrome) && !isPalindromWhile(nonPalindrome)) {
            System.out.println("IT WORKS");
        } else {
            throw new Exception("FAIL");
        }

    }

    public static boolean isPalindromeReverse(String s) throws Exception {

        String sReverse = new StringBuilder(s).reverse().toString();

        if (s.compareTo(sReverse) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindromeForLoop(String s) {

        int length = s.length();
        for (int i = 0; i < (length/2); i++ ) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromWhile(String s) {

        int i = 0;
        while (true) {
            if (i == s.length()/2) {
                return true;
            }
            if (s.charAt(i) == s.charAt(s.length() -i -1)) {
                i++;
            } else {
                return  false;
            }
        }

    }



}


