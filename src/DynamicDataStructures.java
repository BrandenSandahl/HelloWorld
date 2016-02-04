
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by branden on 2/4/16 at 10:03.
 */
public class DynamicDataStructures {


    public static void main(String[] args) {
        Person alice = new Person("Alice ", 25);
        Person bob = new Person("Bob ", 30);
        Person charlie = new Person("Charlie ", 40);

        ArrayList<Person> people = new ArrayList<>();
        people.add(alice);
        people.add(bob);
        people.add(charlie);


        for (Person p : people) {
            System.out.println(p.getName());

        }

        HashMap<String, Person> peopleMap = new HashMap<>();
        peopleMap.put("alice", alice);
        peopleMap.put("bob", bob);
        peopleMap.put("Charlie", charlie);

        for (Person p : peopleMap.values()) {
            if (p.getAge() >= 30 ) {
                System.out.println(p.getName());
            }
        }

    }
}