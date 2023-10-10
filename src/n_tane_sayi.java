import java.util.Scanner;

public class n_tane_sayi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("kaç sayı gireceksiniz: ?");
        int n = scan.nextInt();

        System.out.print("1.sayiyi girin: ");
        int sayi = scan.nextInt();
        int enBuyuk = sayi;
        int enKucuk = sayi;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + "sayiyi giriniz: ");
            sayi = scan.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("en küçük sayı: " + enKucuk);
        System.out.println("en büyük sayi: " + enBuyuk);

    }
}
