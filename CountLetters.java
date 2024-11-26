package com.example;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CountLetters {

    private static final Logger LOGGER = Logger.getLogger(CountLetters.class.getName());

    public static void main(String[] args) {
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

        // Meminta pengguna memasukkan sebuah kata
        LOGGER.info("Please enter a single word (letters only): ");
        String word = scan.nextLine();

        // Mengonversi kata menjadi huruf kapital
        word = word.toUpperCase();

        // Menghitung frekuensi setiap huruf dalam string
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i) - 'A']++; // Melakukan operasi pada karakter
            } catch (ArrayIndexOutOfBoundsException e) {
                // Menampilkan pesan saat karakter bukan huruf
                LOGGER.log(Level.WARNING, "Not a letter: {0}", word.charAt(i));
            }
        }

        // Mencetak frekuensi huruf
        LOGGER.info("\nLetter frequencies:");
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                LOGGER.log(Level.INFO, "{0}: {1}", new Object[]{(char) (i + 'A'), counts[i]});
            }
        }

        scan.close();
    }
}
