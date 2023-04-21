public class Coding7 {
    public static void main(String[] args) {

        int x = 0;
        int y = 1;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = x + y;
            System.out.print(x + " ");
            x = y;
            y = sum;
        }
    }
}
