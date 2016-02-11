import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by branden on 2/11/16 at 09:51.
 */
public class Exercise01 {

    public static void main(String[] args) {

        String[] names = {"Alice", "Bob", "Charlie", "David", "Edward", "Albert", "Beth"};

        HashMap<Character, ArrayList<String>> nameMap = new HashMap<>();

        // Create empty arraylists
        for (String name : names ) {
            char firstLetter = name.charAt(0);
            nameMap.put(firstLetter, new ArrayList<String>());
        }

        //add the names
        for (String name : names) {
            char firstLetter = name.charAt(0);
            nameMap.get(firstLetter).add(name);

        }

        System.out.println(nameMap);



    }


}