
import java.util.Scanner;

public class PrimeValues{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");

        for (int count = 0; count < 10; count++) {
            int num = scanner.nextInt();
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(num + " is a prime number.");
            }
        }

        // scanner.close();
    }
}
