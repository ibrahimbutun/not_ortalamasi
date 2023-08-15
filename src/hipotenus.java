import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a, b, c, u, alan;
        double d;
        System.out.print("ücgen birinci kenarını giriniz: ");
        a = inp.nextInt();
        System.out.print("Üçgenin ikinci kenarını giriniz: ");
        b = inp.nextInt();
        System.out.print("Üçgenin üçünücü kenarını giriniz: ");
        c = inp.nextInt();

        u = (a + b + c) / 2;
        alan = (u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin alanı : " + alan);
        System.out.println("Üçgenin çevresi : " + u);

        d = (a * a) + (b * b);

        System.out.println("Üçgenin hipotenüsü : " + Math.sqrt(d));

    }
}
