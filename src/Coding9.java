public class Coding9 {
    public static void main(String[] args) {

        int numbers[] = {50, 21, 30, 24, 17};
        int highest = numbers[0];
        int secondHighest = 0;

        for (int number : numbers) {
            if (highest < number) {
                highest = number;
            } else if (number < highest && number > secondHighest) {
                secondHighest = number;
            }
        }
        System.out.println(secondHighest);
    }
}