import java.util.ArrayList;

/**
 * Created by branden on 2/9/16 at 09:29.
 */
public class PersonFinder {



    public static void main(String[] args) {
        ArrayList<Person> people   = new ArrayList<>();

        people.add(new Person("Alice Smith", 30));
        people.add(new Person("bob Smoth", 35));
        people.add(new Person("charlie Moth", 40));

        ArrayList<Person> peopleUnder40 = new ArrayList<>();
        for (Person p : people) {
            if (p.getAge() < 40) {
                peopleUnder40.add(p);
            }
        }

        System.out.println(peopleUnder40);
        System.out.println("");

        Person firstMatch = null;
        for (Person p : people) {
            if (!p.getName().startsWith("A")) {
                firstMatch = p;
                break;
            }
        }
        System.out.println(firstMatch.getName());
    }




}