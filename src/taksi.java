import java.util.Scanner;

public class taksi {
    public static void main(String[] args) {
        int km;
        double tutar, perKm = 2.20, startPrice = 10;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km olarak gir: ");
        km = inp.nextInt();

        tutar = km * perKm;
        tutar += startPrice;
        tutar = (tutar < 20) ? 20 : tutar;
        System.out.println("Toplam tutar : " + tutar);

    }
}
    