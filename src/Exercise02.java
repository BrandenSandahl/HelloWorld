import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by branden on 2/15/16 at 10:49.
 */
public class Exercise02 {

    public static void main(String[] args) {

        ArrayList<Email> allEmails = new ArrayList<>();
        allEmails.add(new Email("Alice@gmail.com", "Hi", "What's up?"));
        allEmails.add(new Email("Bob@gmail.com", "Hi", "What's up?"));
        allEmails.add(new Email("Charlie@gmail.com", "hey der", "What's up?"));
        allEmails.add(new Email("Alice@gmail.com", "Hi2", "What's up?"));
        allEmails.add(new Email("Bob@gmail.com", "Hi2", "What's up?"));

        Collections.sort(allEmails);
        System.out.println(allEmails);



        HashMap<String, ArrayList<Email>> emailsByDest = new HashMap<>();

        for (Email email : allEmails) {
            if (!emailsByDest.containsKey(email.destination)) {
                emailsByDest.put(email.destination, new ArrayList<>());
            }
            emailsByDest.get(email.destination).add(email);
        }





    }


}