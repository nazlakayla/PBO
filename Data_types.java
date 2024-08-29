import java.util.Scanner;

public class Data_types {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang akan diuji  : ");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            try {
                long n = sc.nextLong();
                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) System.out.println("- byte");
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) System.out.println("- short");
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) System.out.println("- int");
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) System.out.println("- long");
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}