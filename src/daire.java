import java.util.Scanner;

public class daire {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap giriniz: ");
        r = input.nextInt();
        System.out.print("Merkez açı ölçüsünüz giriniz: ");
        a = input.nextInt();

        double alan = (pi * (r * r) * a) / 360;
        System.out.println("Daire diliminin alanı: " + alan);

        /*
         * 
         * , alan, cevre;
         * alan = pi * r * r;
         * cevre = 2 * pi * r;
         * System.out.println("Alan:" + alan);
         * System.out.println("Çevre: " + cevre);
         */

    }
}
