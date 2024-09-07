import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input string
        String s = scanner.nextLine();

        // Memisahkan string berdasarkan karakter non-alfabet
        String[] tokens = s.split("[^a-zA-Z]+");

        // Menghitung jumlah token
        int n = tokens.length;
        System.out.println(n);

        // Mencetak setiap token
        for (String token : tokens) {
            System.out.println(token);
        }

        scanner.close();
    }
}