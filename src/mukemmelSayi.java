import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("gir: ");
        int number = scanner.nextInt();
        System.out.println("Mükemmel sayılar: ");

        for (int i = 1; i <= number; i++) {
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}
