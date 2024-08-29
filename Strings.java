import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membaca input string
        String A = sc.next();
        String B = sc.next();

        // 1. Menjumlahkan panjang A dan B
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // 2. Menentukan apakah A lebih besar secara leksikografis dari B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Mengubah huruf pertama dari A dan B menjadi besar dan mencetaknya
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        sc.close();
    }
}