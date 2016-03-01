import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by branden on 3/1/16 at 09:43.
 */
public class exercise07 {


    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = readFile();

        String searchTerm = "ali";

        ArrayList<String> namesContainingSearch = new ArrayList<>();

        namesContainingSearch = names.stream()
                .filter((name) -> name.toLowerCase().contains(searchTerm.toLowerCase()))
                .collect(Collectors.toCollection(ArrayList<String>::new));


//        for (String name : names) {
//            if (name.toLowerCase().contains(searchTerm.toLowerCase())) {
//                namesContainingSearch.add(name);
//            }
//
//        }

        namesContainingSearch.forEach(System.out::println);



    }









    static ArrayList<String> readFile() throws FileNotFoundException {
        File f = new File("people.csv");
        Scanner s = new Scanner(f);

        ArrayList<String> names = new ArrayList<>();
        s.nextLine();

        while (s.hasNext()) {
            String[] lineSplit = s.nextLine().split(",");
            String name = lineSplit[1] + " " + lineSplit[2];
            names.add(name);
        }

        return names;
    }


}