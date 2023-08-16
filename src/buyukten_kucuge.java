import java.util.Scanner;

public class buyukten_kucuge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("a değerini girin: ");
        int a = scanner.nextInt();
        
        System.out.print("b değerini girin: ");
        int b = scanner.nextInt();
        
        System.out.print("c değerini girin: ");
        int c = scanner.nextInt();
        
        if (a <= b && a <= c) {
            if (b <= c) {
                System.out.println(a + " <= " + b + " <= " + c);
            } else {
                System.out.println(a + " <= " + c + " <= " + b);
            }
        } else if (b <= a && b <= c) {
            if (a <= c) {
                System.out.println(b + " <= " + a + " <= " + c);
            } else {
                System.out.println(b + " <= " + c + " <= " + a);
            }
        } else {
            if (a <= b) {
                System.out.println(c + " <= " + a + " <= " + b);
            } else {
                System.out.println(c + " <= " + b + " <= " + a);
            }
        }
    }
}
