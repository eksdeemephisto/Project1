public class Coding4 {
    public static void main(String[] args) {

        int[][] numbers = {
                {50, 21, 24, 17, 30},
                {19, 77, 67, 99, 20},
                {10, 60, 70, 25, 65}
        };
        int sumEven = 0;
        int sumOdd = 0;

        for (int[] number : numbers) {
            for (int num : number) {
                if (num % 2 == 0) {
                    sumEven += num;
                }
                if (num % 2 != 0) {
                    sumOdd += num;
                }
            }
        }
        System.out.println("The sum of all even numbers is " + sumEven);
        System.out.println("The sum of all odd numbers is " + sumOdd);
    }
}
