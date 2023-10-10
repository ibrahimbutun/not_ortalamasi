public class fibonacci {
    public static void main(String[] args) {

        long num1 = 0;
        long num2 = 1;
        System.out.println("9 elemanlı fibonacci serisi: ");
        System.out.println("-----------------------------");
        System.out.println("                             ");
        for (int i = 0; i < 9; i++) {
            System.out.print(num1 + " ");
            long temp = num1;
            num1 = num2;
            num2 = temp + num2;

        }
        System.out.println("");
        System.out.println("                             ");
        System.out.println("-----------------------------");
    }
}