public class Coding2 {
    public static void main(String[] args) {

        int[] numbers = {50, 21, 77, 88, 24};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum of all elements is " + sum);
    }
}
