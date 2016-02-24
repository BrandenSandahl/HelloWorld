
/**
 * Created by branden on 2/22/16 at 10:03.
 */
public class Exercise04 {

    public static void main(String[] args) {
        String sentence = "To be or not to be, that is the question.";

        sentence = sentence.toLowerCase();
        sentence = sentence.replaceAll("[,.]", "");

        String[] sentenceSplit = sentence.split(" ");

        for (int i = 0; i < sentenceSplit.length; i++) {
            String test = sentenceSplit[i];
            for (int j = sentenceSplit.length - 1; j > i; j--) {
                if (test.equals(sentenceSplit[j])) {
                    sentenceSplit[j] = "";
                }

                }
            }

        String rebuilt = "";
        for (String word : sentenceSplit) {
            rebuilt = rebuilt + word + " ";
        }

        System.out.println(rebuilt);


        }



    }


