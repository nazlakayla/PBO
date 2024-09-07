import java.math.BigInteger;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input bilangan a dan b
        BigInteger a = new BigInteger(scanner.nextLine().trim());
        BigInteger b = new BigInteger(scanner.nextLine().trim());

        // Menampilkan hasil penjumlahan a + b
        System.out.println(a.add(b));

        // Menampilkan hasil perkalian a * b
        System.out.println(a.multiply(b));

        scanner.close();
    }
}