import java.util.Scanner;

public class harmonik_sayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("sayı gir: ");
        double sayi = scan.nextInt();   
        

        double result = 0;
        for (double i = 1; i <= sayi; i++) {
            result += (1/sayi);
        }
        System.out.println(result);
    }
}
