import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {
        reverseWord();
        reverseWordStream();
   }

   private static void reverseWord(){
       String normalString= "Hola", reversedString="";
       System.out.println("Reversing a string by imperative coding");
       char singleLetter;

       System.out.print("Original word: ");
       System.out.println(normalString);

       for (int i=0; i<normalString.length(); i++)
       {
           singleLetter= normalString.charAt(i);
           reversedString= singleLetter+reversedString;
       }
       System.out.println("Reversed word: "+ reversedString);
   }

    private static void reverseWordStream(){
        String normalString= "Hola";
        System.out.println("Reversing a string by declarative coding");
        System.out.print("Original word: ");
        System.out.println(normalString);
        String reversedStringByStream = Stream.of(normalString)
                .map(word->new StringBuilder(normalString).reverse())
                .collect(Collectors.joining(" "));
        System.out.println("Reversed word: "+ reversedStringByStream);
    }
}
