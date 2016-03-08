/**
 * Created by branden on 3/8/16 at 09:26.
 */
public class exercise09 {


    public static void main(String[] args) {
        int num = 12345;

    }



    public static void useLoop(int num) {
        String numString = String.valueOf(num);
        String numStringBackwards = "";

        for (int i = 0; i < numString.length(); i++) {
            numStringBackwards += numString.charAt((numString.length() - 1) - i);
        }
        System.out.println(Integer.valueOf(numStringBackwards));

    }

    public static void useReverse(int num) {
        String numStr = String.valueOf(num);

        numStr = new StringBuilder(numStr).reverse().toString();
        int newNum = Integer.valueOf(numStr);
        System.out.println(newNum);
    }


    public static void useMath(int num) {
        int newNum = 0;
        int rem;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            newNum = newNum * 10 + rem;
        }
        System.out.println(newNum);
    }


}
