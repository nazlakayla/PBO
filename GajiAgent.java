import java.util.Scanner;

public class GajiAgent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gaji pokok agent
        int gajiPokok = 500000;
        int hargaPerItem = 50000;

        // Membaca input jumlah penjualan bulan ini
        int penjualan = scanner.nextInt();

        // Inisialisasi variabel untuk total gaji
        int totalGaji = gajiPokok;

        // Bonus dan denda berdasarkan jumlah penjualan
        if (penjualan >= 80) {
            // Bonus 35% dari total penjualan
            totalGaji += penjualan * hargaPerItem * 35 / 100;
        } else if (penjualan >= 40) {
            // Bonus 25% dari total penjualan
            totalGaji += penjualan * hargaPerItem * 25 / 100;
        } else if (penjualan >= 15) {
            // Bonus 10% dari total penjualan
            totalGaji += penjualan * hargaPerItem * 10 / 100;
        } else {
            // Denda 15% dari selisih 15 dengan jumlah penjualan
            totalGaji -= (15 - penjualan) * hargaPerItem * 15 / 100;
        }

        // Output total gaji yang diterima
        System.out.println(totalGaji);

        scanner.close();
    }
}