import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args){
        System.out.println("Factorial by imperative coding");
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int number = input.nextInt();
        System.out.println("Factorial of "+ number + " is " + factorial(number));

        System.out.println("Factorial by declarative coding");
        System.out.println("please enter a number: ");
        int inputStream = input.nextInt();
        System.out.println("Factorial of "+ inputStream + " is " + (int)factorialStream(inputStream));
        input.close();
    }

    private static int factorial(int number){
        if (number == 0)
            return 1;
        return number*factorial(number-1);
    }

    private static int factorialStream(int number){
        return (IntStream
                .rangeClosed(1, number)
                .reduce(1, (int x, int y) -> x * y));
    }
}
