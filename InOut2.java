import java.util.Scanner;

public class InOut2 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Membuat array untuk menyimpan string dan integer
        String[] str = new String[3]; // Array untuk menyimpan 3 string
        int[] num = new int[3]; // Array untuk menyimpan 3 integer

        // Membaca 3 pasang input (string dan integer)
        for (int i = 0; i < 3; i++) {
            // Membaca string dan menyimpannya ke dalam array str
            str[i] = scanner.next();
            // Membaca integer dan menyimpannya ke dalam array num
            num[i] = scanner.nextInt();
        }

        // Menampilkan header
        System.out.println("================================");

        // Menampilkan hasil dengan format yang diatur
        for (int i = 0; i < 3; i++) {
            // Menampilkan string yang rata kiri dengan lebar 15 karakter dan integer dengan padding 3 digit
            System.out.printf("%-15s%03d%n", str[i], num[i]);
        }

        // Menampilkan footer
        System.out.println("================================");

        // Menutup scanner untuk melepaskan sumber daya
        scanner.close();
    }
}