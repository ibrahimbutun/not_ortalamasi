import java.util.Scanner;

public class ikinin_kuvvetleri {
    public static void main(String[] args) {
        int sayi;

        Scanner scan = new Scanner(System.in);
        System.out.print("sayi gir: ");
        sayi = scan.nextInt();

        for (int i = 1; i < sayi; i*=2) {
            System.out.println(i);
        }
    }
}
