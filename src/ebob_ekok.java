import java.util.Scanner;

/**
 * ebob_ekok
 */
public class ebob_ekok {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("n1 sayısını gir: ");
        int n1 = scan.nextInt();
        System.out.print("n2 sayısını gir: ");
        int n2 = scan.nextInt();

        int ebob = 1, ekok = 1;
        int i = 1;
        while (i <= n1) {
            i++;
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }

        }
        ekok = (n1 * n2) / ebob;
        System.out.println(ebob);
        System.out.println(ekok);
    }
}