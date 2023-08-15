import java.util.Scanner;

public class vucut_kitle_endeksi {
    public static void main(String[] args) {
        double kg, boy;

        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden girin(Örn. 1.75): ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        kg = input.nextDouble();

        double vucut_kitle_endeksi = kg / (boy * boy);
        System.out.println("Vücut Kitle Endeksiniz = " + vucut_kitle_endeksi);
    }
}
