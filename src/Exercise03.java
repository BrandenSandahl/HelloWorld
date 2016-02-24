
import java.util.HashMap;

/**
 * Created by branden on 2/15/16 at 11:05.
 */
public class Exercise03 {

    public static void main(String[] args) {

        String sentence = "To be or not to be, that is the question.";
        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll("[,.]", "");
        String[] words = sentence.split(" ");

        HashMap<String, Integer> frequencies = new HashMap<>();

        for (String word : words) {
            Integer count = frequencies.get(word);

            if (count == null) {
                frequencies.putIfAbsent(word, 1);
            } else {
                frequencies.put(word, frequencies.get(count) + 1);
            }
        }

    }


}