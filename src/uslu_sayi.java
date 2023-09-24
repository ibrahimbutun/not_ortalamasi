import java.util.Scanner;

public class uslu_sayi {
    public static void main(String[] args) {
        int sayi;
        int us;
        int total = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz: ");
        sayi = scan.nextInt();
        System.out.print("üs giriniz: ");
        us = scan.nextInt();

        for (int i = 1; i <= us; i++) {
            total *= sayi;
        }
        System.out.println(total);

    }
}
