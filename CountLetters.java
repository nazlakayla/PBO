import java.util.Scanner;

public class CountLetters {

    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        // Meminta pengguna memasukkan sebuah kata
        System.out.print("Enter a single word (letters only, please): ");
        String word = scan.nextLine();

        // Mengonversi kata menjadi huruf kapital
        word = word.toUpperCase();

        // Menghitung frekuensi setiap huruf dalam string
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i) - 'A']++; // Melakukan operasi pada karakter
            } catch (ArrayIndexOutOfBoundsException e) {
                // Menampilkan pesan saat karakter bukan huruf
                System.out.println("Not a letter: " + word.charAt(i));
            }
        }

        // Mencetak frekuensi huruf
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}