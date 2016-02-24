import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Created by branden on 2/24/16 at 09:56.
 */
public class Exercise05 {

    public static void main(String[] args) {

        String[] names = {"alice", "bob", "charlie", "andrew", "edward", "alex"};

        //grab first 5
        //make names entirely uppercase
        //extract all names staring with "A"


        //zachs way of doing it
        ArrayList<String> newNames = new ArrayList<>(Arrays.asList(names));
        newNames = new ArrayList<>(newNames.subList(0,5));

        solveViaStream(newNames);
        solveViaTempList(newNames);
        solveViaDirectModification(newNames);


        //my way

//        ArrayList<String> namesList = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            namesList.add(names[i].toUpperCase()); //cut down the file to 5 and make upper
//        }

//
//        ArrayList<String> cutList = new ArrayList<>();
//
//        namesList.forEach(item -> {
//            if (item.startsWith("A")) { cutList.add(item); }
//        });
//
//        cutList.forEach(item -> {
//            System.out.println(item);
//        });


    }

    static void solveViaDirectModification(ArrayList<String> names) {
        //make all the names uppercase
        for (int i = 0; i < names.size(); i++) {
            names.set(i, names.get(i).toUpperCase());
        }

        //filter out ones that don't start with A
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (!name.startsWith("A")) {
                iter.remove();
            }
        }

        System.out.println(names);
    }

    static void solveViaTempList(ArrayList<String> names) {
        //make all the names uppercase
        ArrayList<String> temp = new ArrayList<>();
        for (String name : names) {
            temp.add(name.toUpperCase());
        }
        names = temp;

        //filter out names that dont start with A
        temp = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith("A")) {
                temp.add(name);
            }
        }
        names = temp;

        System.out.println(names);
    }


    static void solveViaStream(ArrayList<String> names) {
        names = names.stream()               //turn my list into a stream
                .map((name) -> {           //apply a function to every item
                    return name.toUpperCase();
                })
                .filter((name)  ->  {       //returns a boolean if it should be included or not
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new));   //need to turn the stream back into an ArrayList here.

        System.out.println(names);
    }

}