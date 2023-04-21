public class Coding3 {
    public static void main(String[] args) {

        int[][] numbers = {
                {50, 21, 24, 17, 30},
                {19, 77, 67, 99, 20},
                {10, 60, 70, 25, 65}
        };

        for (int[] number : numbers) {
            for (int num : number) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
