import java.util.Scanner;

public class asalSayi {
    public static void main(String[] args) {

        int counter = 0;
        for (int sayi = 2; sayi <= 100; sayi++) {
            Boolean status = false;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    status = true;
                    break;
                }
            }

            if (status == false) {
                System.out.print("asal: " + sayi + "\n");
                counter++;
            }
        }
    }
}
