public class Coding1 {
    public static void main(String[] args) {

        int[] temp = {76, 87, 88, 76, 68, 63, 64};

        int high = temp[0];
        int low = temp[0];

        for (int arr : temp) {
            if (arr > high) {
                high = arr;
            }
            if (arr < low) {
                low = arr;
            }
        }
        System.out.println("The highest temperature of the week is " + high);
        System.out.println("The lowest temperature of the week is " + low);
    }
}
