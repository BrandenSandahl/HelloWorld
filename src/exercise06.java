import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by branden on 2/25/16 at 09:58.
 */
public class exercise06 {


    public static void main(String[] args) {

        String[] names = {"Alice", "Smith", "Bob", "Hope", "Charlie", "Brown"};

        //reverse the list
        //turn list into hashmap
        // {"smith": "alice", "hope": "bob", "brown":"charlie"}





        ArrayList<String> reversedNames = new ArrayList<>(Arrays.asList(names));
        Collections.reverse(reversedNames);

        HashMap<String, String> nameMap = new HashMap<>();

       //if uneven number of items in this list you will get an out of bounds error
        for (int i = 0; i < reversedNames.size(); i+=2) {
            nameMap.put(reversedNames.get(i), reversedNames.get(i + 1));
        }

        /**  MY WAY

        HashMap<String, String> nameMap = new HashMap<>();

        for (int i = names.length - 1  ; i > 0; i -= 2  ) {
            nameMap.put(names[i], names[i-1]);

        }

         */






        System.out.println("Stop me");

    }


}