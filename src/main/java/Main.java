public class Main {
    public static void main(String[] args) {
        // Imprime apenas os números ímpares entre 1 e 50
        System.out.println("Números ímpares entre 1 e 50:");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
