import java.util.Scanner;

public class kullanici_girdisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String dogruKullaniciAdi = "ibo";
        String dogruSifre = "12345";
        
        System.out.print("Kullanıcı adınızı girin: ");
        String kullaniciAdi = scanner.nextLine();
        
        System.out.print("Şifrenizi girin: ");
        String girilenSifre = scanner.nextLine();
        
        if (kullaniciAdi.equals(dogruKullaniciAdi) && girilenSifre.equals(dogruSifre)) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Hatalı kullanıcı adı veya şifre. Şifrenizi sıfırlamak ister misiniz? (evet/hayir)");
            String cevap = scanner.nextLine();
            
            if (cevap.equalsIgnoreCase("evet")) {
                System.out.print("Yeni şifre girin: ");
                String yeniSifre = scanner.nextLine();
                
                System.out.print("Yeni şifreyi tekrar girin: ");
                String yeniSifreTekrar = scanner.nextLine();
                
                if (yeniSifre.equals(yeniSifreTekrar) && !yeniSifre.equals(dogruSifre)) {
                    dogruSifre = yeniSifre;
                    System.out.println("Şifre oluşturuldu.");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                }
            } else {
                System.out.println("İşlem iptal edildi.");
            }
        }
    }
}
