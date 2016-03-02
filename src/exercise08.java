import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by branden on 3/2/16 at 09:42.
 */
public class exercise08 {

    public static void main(String[] args) {


        String[] names = {"Charlie", "David", "Alice", "Bob"};
        ArrayList<String> sortedNames = new ArrayList<>(Arrays.asList(names));


        for (String name : names) {
            int index = 0;

            for (String sortedName : sortedNames) {
                if (name.compareTo(sortedName ) > 0) {
                    index++;
                } else {
                    break;
                }
            }
            sortedNames.add(index, name);


        }


    }




//        for (int i = 0; i < names.length -1; i++) {
//            int minIndex = i;
//            int minValue = names[i].charAt(0);
//
//           for (int j =  i + 1; j < names.length; j++) {
//               if (names[j] < minIndex) {
//
//               }
//
//           }
//
//
//        }
//
//        for (String s : names) {
//            System.out.println(s);
//        }
//    }

//    public static void swap(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//    }

}