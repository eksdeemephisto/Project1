public class Coding8 {
    public static void main(String[] args) {

        int[] numbers = {50, 21, 24, 17, 30};
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            if (number < min){
                min = number;
            }
            if (number > max){
                max = number;
            }
        }
        System.out.println("The minimum number in the array is " + min);
        System.out.println("The maximum number in the array is " + max);
    }
}
