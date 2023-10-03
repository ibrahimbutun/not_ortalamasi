import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı adınız: ");
            username = input.nextLine();
            System.out.print("Şifreniz : ");
            password = input.nextLine();

            if (username.equals("patika") && password.equals("dev")) {
                System.out.println("hosgeldiniz");
                while (true) {
                    System.out.println("-----------------------");
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.println("-----------------------");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("-----------------------");
                            System.out.print("yatırılan para miktarı: ");
                            int depositedPrice = input.nextInt();
                            balance += depositedPrice;
                            System.out.println("başarıyla para yatırıldı.");
                            System.out.println("güncel bakiye: " + balance);
                            System.out.println("-----------------------");
                            break;
                        case 2:
                            System.out.println("-----------------------");
                            System.out.print("çekilecek para miktarı: ");
                            int withdrawnPrice = input.nextInt();
                            balance -= withdrawnPrice;
                            System.out.println("başarıyla para çekimi yapıldı. ");
                            System.out.println("güncel bakiye: " + balance);
                            System.out.println("-----------------------");
                            break;
                        case 3:
                            System.out.println("-----------------------");
                            System.out.println("Güncel bakiyeniz: " + balance);
                            System.out.println("-----------------------");
                            break;
                        case 4:
                            System.out.println("-----------------------");
                            System.out.println("Tekrar görüşmek üzere....");
                            System.out.println("-----------------------");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("hatalı tuşlama yaptınız.");
                            break;
                    }
                }
            } else {
                right--;
                System.out.println("hatalı giriş yaptınız, tekrar deneyiniz...");
                if (right == 0) {
                    System.out.println("hesabınız bloke olmuştur geçmiş olsun");
                } else {
                    System.out.println("kalan deneme hakkınız: " + right);
                }
            }
        }
    }
}
