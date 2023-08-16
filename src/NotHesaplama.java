import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] dersler = {"Matematik", "Fizik", "Türkçe", "Kimya", "Müzik"};
        int gecmeNotu = 55;
        int toplamNot = 0;
        
        for (String ders : dersler) {
            System.out.print(ders + " notunu girin: ");
            int not = scanner.nextInt();
            
            if (not >= 0 && not <= 100) {
                toplamNot += not;
            }
        }
        
        double ortalama = (double) toplamNot / dersler.length;
        
        System.out.println("Ortalama: " + ortalama);
        
        if (ortalama >= gecmeNotu) {
            System.out.println("Tebrikler, geçtiniz!");
        } else {
            System.out.println("Maalesef, kaldınız.");
        }
    }
}
