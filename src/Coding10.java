public class Coding10 {
    public static void main(String[] args) {

        String[] names = {"Zoro", "Luffy", "Sanji", "Jimbei", "Nami", "Nami", "Robin", "Chopper", "Usopp", "Franky", "Brook", "Luffy", "Brook" };

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println(names[i]);
                }
            }
        }
    }
}