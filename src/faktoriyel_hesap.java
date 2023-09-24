import java.util.Scanner;

public class faktoriyel_hesap {
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi gir: ");
        int sayi = scan.nextInt();
        int total = 1;

        for (int i = 1; i <= sayi; i++) {
            total = total * i ;
        }

        System.out.println(total);
        
    }
}
