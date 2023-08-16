import java.util.Scanner;

public class ucak_bileti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = scanner.nextInt();

        System.out.print("yaşınızı giriniz: ");
        int yas = scanner.nextInt();

        System.out.print("yolculuk tipini giriniz: (1 -> TEK YÖN // 2-> GİDİŞ-DÖNÜŞ) : ");
        int yolculukTipi = scanner.nextInt();

        if (yas > 0 && mesafe > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
            double fiyat;

            fiyat = mesafe * 0.1;

            if (yas < 12) {
                fiyat *= 0.5;
            } else if (yas >= 12 && yas <= 24) {
                fiyat *= 0.9;
                System.out.println("yaş 12-24 fiyatlandırma" + fiyat);
            } else if (yas > 65) {
                fiyat *= 0.7;
            }

            if (yolculukTipi == 2) {
                fiyat *= 0.8;
                fiyat *= 2;
                System.out.println("yolculuk2 fiyatlandırma: " + fiyat);
            }

            System.out.println("Toplam tutar: " + fiyat);

        } else {
            System.out.println("hatalı veri girdiniz !");
        }
    }
}
