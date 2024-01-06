import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (short type): ");
        short number = scanner.nextShort();

        long factorial = calculateFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }

    private static long calculateFactorial(short n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
        long result = 1;
        for (short i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
