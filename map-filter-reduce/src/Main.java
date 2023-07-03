import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        String message = "I'll send an SOS to the garbage world, " + "I hope that someone garbage gets my message in a garbage bottle.";
        String wordToRemove = "garbage";

        String updatedSentence = Arrays.stream(message.split("\\s+"))
                .filter(word -> !word.equals(wordToRemove))
                .collect(Collectors.joining(" "));
        System.out.println(updatedSentence);

        String upperSentence = updatedSentence.toUpperCase();
        System.out.println(upperSentence);

    }
}




        /*ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(message2));

        arrayList.removeIf(s -> s.equals(wordToRemove));

        String[] message4 = arrayList.toArray(new String[0]);

        System.out.println(Arrays.toString(message4));*/









        /*String message3 = message.stream()
                .filter("garbage" -> message2.equals("message"))*/

        //Arrays.stream(message2).filter()

        //Stream<String> strmessage = Stream.of(message);

