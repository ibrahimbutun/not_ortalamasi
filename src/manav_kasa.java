import java.util.Scanner;

/*
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL 
*/
public class manav_kasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, total;

        System.out.print("Armut kaç kg ? :");
        double armutKg = input.nextDouble();
        armutKg *= armut;
        // System.out.println(armutKg + "₺");

        System.out.print("Elma kaç kg ? :");
        double elmaKg = input.nextDouble();
        elmaKg *= elma;
        // System.out.println(elmaKg + "₺");

        System.out.print("Domates kaç kg ? :");
        double domatesKg = input.nextDouble();
        domatesKg *= domates;
        // System.out.println(domatesKg + "₺");

        System.out.print("Muz kaç kg ? :");
        double muzKg = input.nextDouble();
        muzKg *= muz;
        // System.out.println(muzKg + "₺");

        System.out.print("Patlican kaç kg ? :");
        double patlicanKg = input.nextDouble();
        patlicanKg *= patlican;
        // System.out.println(patlicanKg + "₺");

        total = elmaKg + armutKg + domatesKg + muzKg + patlicanKg;

        System.out.print("Toplam tutar ₺ : " + total);
    }
}
