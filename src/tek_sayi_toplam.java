import java.util.Scanner;

public class tek_sayi_toplam {
    public static void main(String[] args) {
        int t;
        int sum = 0;

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("sayı gir: ");
            t = scan.nextInt();
            if (t % 2 == 1) {
                sum += t;
            }
        } while (t > 0);

        System.out.println(sum);
    }
}
