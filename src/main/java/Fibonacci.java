import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci();
        FibonacciStream();
    }

    private static void Fibonacci(){
        System.out.println("Fibonacci Series by imperative coding");
        int num1 = 0, num2 = 1, limit = 15;

        for (int i = 0; i < limit; i++) {
            System.out.println(num1 + " ");
            int sum = num1 + num2;

            num1 = num2;
            num2 = sum;
        }
    }

    private static void FibonacciStream(){
        System.out.println("Fibonacci Series by declarative coding");

        Stream.iterate(new int[]{0,1}, number -> new int[]{number[1], number[0]+number[1]})
                .limit(15)
                .map(fibonacciNumber -> fibonacciNumber[0])
                .forEach(fibonacciNumber -> System.out.print(fibonacciNumber + " "));
    }
}
