import java.util.Scanner;

public class BukaJalan {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Membaca satu baris input yang berisi plat nomor mobil
        String line = scanner.nextLine();

        // Menghapus semua spasi dari input untuk mendapatkan gabungan angka plat nomor
        String noplat = line.replace(" ", "");

        // Mengonversi gabungan plat nomor yang merupakan string menjadi tipe data long
        long plat = Long.parseLong(noplat);

        // Mengurangi 999999 dari nilai gabungan plat nomor
        long result = plat - 999999;

        // Memeriksa apakah hasil pengurangan habis dibagi 5
        if (result % 5 == 0) {
            // Jika ya, cetak "jalan"
            System.out.println("jalan");
        } else {
            // Jika tidak, cetak "berhenti"
            System.out.println("berhenti");
        }

        // Menutup scanner untuk melepaskan sumber daya
        scanner.close();
    }
}