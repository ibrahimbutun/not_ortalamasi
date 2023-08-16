import java.util.Scanner;

public class hesap_makinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("İki sayı girin:");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();
        
        System.out.println("İşlem seçin:");
        System.out.println("1: Toplama");
        System.out.println("2: Çıkarma");
        System.out.println("3: Çarpma");
        System.out.println("4: Bölme");
        
        int secim = scanner.nextInt();
        double sonuc = 0.0;
        
        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                break;
            case 4:
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Bölme işlemi için ikinci sayı 0 olamaz.");
                    return;
                }
                break;
            default:
                System.out.println("Geçersiz seçim.");
                return;
        }
        
        System.out.println("Sonuç: " + sonuc);
    }
}
