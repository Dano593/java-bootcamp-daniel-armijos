import java.util.Scanner;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String args[]){
        FizzBuzz();
        FizzBuzzStream();
    }
    public static void FizzBuzz(){
        System.out.println("FizzBuzz game by imperative coding");
        boolean endGame = false;
        while (endGame==false){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int number = input.nextInt();
        if (number%7==0 && number%5==0){
            System.out.println("fizzbuzz");
            endGame = true;
        }else if (number%7==0){
            System.out.println("buzz");
            endGame = true;
        }else if (number%5==0){
            System.out.println("fizz");
            endGame = true;
        }else{
            System.out.println("Try again, ");
            endGame = false;
        }
        }
    }
        public static void FizzBuzzStream(){
            System.out.println("FizzBuzz game by declarative coding");
            Scanner inputStream = new Scanner(System.in);
            System.out.println("please enter a number: ");
            int numberStream = inputStream.nextInt();
            IntStream.rangeClosed(1, numberStream)
                    .mapToObj(i->i%7==0?(i%5==0? "fizzbuzz ":"buzz "):(i%5==0? "fizz ": i+" "))
                    .forEach(System.out::print);
            inputStream.close();
        }
}
