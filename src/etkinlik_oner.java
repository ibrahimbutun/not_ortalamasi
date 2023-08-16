import java.util.Scanner;

public class etkinlik_oner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sıcaklık değerini girin: ");
        int sicaklik = scanner.nextInt();
        
        if (sicaklik < 5) {
            System.out.println("Kayak yapmayı öneririz.");
        } else if (sicaklik >= 5 && sicaklik <= 15) {
            System.out.println("Sinema etkinliğini öneririz.");
        } else if (sicaklik > 15 && sicaklik <= 25) {
            System.out.println("Piknik etkinliğini öneririz.");
        } else {
            System.out.println("Yüzme etkinliğini öneririz.");
        }
    }
}
