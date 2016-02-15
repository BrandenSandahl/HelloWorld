

/**
 * Created by branden on 2/15/16 at 10:44.
 */
public class Email implements Comparable{

    String destination, body, subject;


    public Email(String destination, String body, String subject) {
        this.destination = destination;
        this.body = body;
        this.subject = subject;
    }

    @Override
    public int compareTo(Object o) {
        Email e = (Email) o;
        return destination.compareTo(e.destination);

    }


    @Override
    public String toString() {
        return "Email{" +
                "destination='" + destination + '\'' +
                ", body='" + body + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}