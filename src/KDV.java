import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double kdv_8 = 1.08, kdv_18 = 1.18;
        double tutar;
        Scanner scn = new Scanner(System.in);

        System.out.print("Tutar giriniz: ");
        tutar = scn.nextInt();

        if (tutar >= 1000) {
            System.out.println("KDV Tutari (% 8) = " + ((tutar * kdv_8) - tutar));
            System.out.println("KDV Dahil = " + tutar * kdv_8);
        } else if (tutar < 1000) {
            System.out.println("KDV'siz Tutar = " + tutar);
            System.out.println("KDV Tutari (% 18) = " + ((tutar * kdv_18) - tutar));
            System.out.println("KDV Dahil = " + (tutar * kdv_18));
        }

    }
}
