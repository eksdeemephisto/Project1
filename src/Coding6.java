import java.util.Scanner;

public class Coding6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();

        if (num == 1 || num == 0) {
            System.out.println("The number is neither a prime nor composite");
        } else if (num == 2 || num == 3 || num == 5 || num == 7) {
            System.out.println("The number is a prime number");
        } else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
            System.out.println("The number is not a prime number");
        } else if (num < 0) {
            System.out.println("Invalid input");
        } else {
            System.out.println("The number is a prime number");
        }
    }
}
