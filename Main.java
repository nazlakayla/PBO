import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Data Jadwal Perkuliahan
        JadwalPerkuliahan[] jadwalPerkuliahan = new JadwalPerkuliahan[11];
        jadwalPerkuliahan[0] = new JadwalPerkuliahan(new Jadwal("Senin", "08.40", "10.40"), new MataKuliah("Komputer Grafik"), new Dosen("Yudi Widhiyasana", "KO013N"), new Ruangan("D105-Kelas"), "21IF2015", "Teori");
        jadwalPerkuliahan[1] = new JadwalPerkuliahan(new Jadwal("Senin", "10.40", "12.20"), new MataKuliah("Pengantar Rekayasa Perangkat Lunak"), new Dosen("Santi Sundari", "KO009N"), new Ruangan("D105-Kelas"), "21IF2013", "Teori");
        jadwalPerkuliahan[2] = new JadwalPerkuliahan(new Jadwal("Senin", "13.00", "15.30"), new MataKuliah("Komputer Grafik"), new Dosen("Trisna Gelar A", "KO078N"), new Ruangan("D102-Lab. MT"), "21IF2015", "Praktek");
        jadwalPerkuliahan[3] = new JadwalPerkuliahan(new Jadwal("Selasa", "07.00", "12.20"), new MataKuliah("Basis Data"), new Dosen("Ade Hodijah", "KO060N"), new Ruangan("D106-Lab. SDB"), "21IF2012", "Praktek");
        jadwalPerkuliahan[4] = new JadwalPerkuliahan(new Jadwal("Selasa", "13.00", "14.40"), new MataKuliah("Aljabar Linear"), new Dosen("Muhammad Rizqi S", "KO074N"), new Ruangan("D101-Kelas"), "21IF2014", "Teori");
        jadwalPerkuliahan[5] = new JadwalPerkuliahan(new Jadwal("Rabu", "07.00", "16.40"), new MataKuliah("Proyek 3: Pengembangan Perangkat Lunak Berbasis Web"), new Dosen("Bambang Wisnuadhi;Wendi Wirasta;Didik Suwito Pribadi", "KO003N;KO079N;KO005N"), new Ruangan("D116-Lab. PjBL-2"), "21IF2016", "Teori dan Praktek");
        jadwalPerkuliahan[6] = new JadwalPerkuliahan(new Jadwal("Kamis", "07.00", "08.40"), new MataKuliah("Basis Data"), new Dosen("Ade Chandra Nugraha", "KO001N"), new Ruangan("D105-Kelas"), "21IF2012", "Teori");
        jadwalPerkuliahan[7] = new JadwalPerkuliahan(new Jadwal("Kamis", "08.40", "10.40"), new MataKuliah("Pemrograman Berorientasi Objek"), new Dosen("Zulkifli Arsyad", "KO061N"), new Ruangan("D105-Kelas"), "21IF2011", "Teori");
        jadwalPerkuliahan[8] = new JadwalPerkuliahan(new Jadwal("Kamis", "10.40", "13.50"), new MataKuliah("Pemrograman Berorientasi Objek"), new Dosen("Zulkifli Arsyad", "KO061N"), new Ruangan("D116-Lab. PjBL-2"), "21IF2011", "Praktek");
        jadwalPerkuliahan[9] = new JadwalPerkuliahan(new Jadwal("Kamis", "13.50", "16.40"), new MataKuliah("Matematika Diskrit II"), new Dosen("Siti Dwi Setiarini", "KO075N"), new Ruangan("D108-Kelas"), "21IF2010", "Teori");
        jadwalPerkuliahan[10] = new JadwalPerkuliahan(new Jadwal("Jumat", "07.50", "14.40"), new MataKuliah("Pengantar Rekayasa Perangkat Lunak"), new Dosen("Yadhi Aditya P.", "KO052N"), new Ruangan("D116-Lab. PjBL-2"), "21IF2013", "Praktek");

        // Data Mahasiswa
        Mahasiswa[] mahasiswa = new Mahasiswa[10];
        mahasiswa[0] = new Mahasiswa("Nazla Kayla", "231511057", "2B-D3");
        mahasiswa[1] = new Mahasiswa("Mahasiswa 1", "231511001", "2B-D3");
        mahasiswa[2] = new Mahasiswa("Mahasiswa 2", "231511002", "2B-D3");
        mahasiswa[3] = new Mahasiswa("Mahasiswa 3", "231511003", "2B-D3");
        mahasiswa[4] = new Mahasiswa("Mahasiswa 4", "231511004", "2B-D3");
        mahasiswa[5] = new Mahasiswa("Mahasiswa 5", "231511005", "2B-D3");
        mahasiswa[6] = new Mahasiswa("Mahasiswa 6", "231511006", "2B-D3");
        mahasiswa[7] = new Mahasiswa("Mahasiswa 7", "231511007", "2B-D3");
        mahasiswa[8] = new Mahasiswa("Mahasiswa 8", "231511008", "2B-D3");
        mahasiswa[9] = new Mahasiswa("Mahasiswa 9", "231511009", "2B-D3");

        // Data Dosen (menggunakan data dari jadwal perkuliahan)
        Dosen[] dosen = new Dosen[12];
        dosen[0] = new Dosen("Yudi Widhiyasana", "KO013N");
        dosen[1] = new Dosen("Santi Sundari", "KO009N");
        dosen[2] = new Dosen("Trisna Gelar A", "KO078N");
        dosen[3] = new Dosen("Ade Hodijah", "KO060N");
        dosen[4] = new Dosen("Muhammad Rizqi S", "KO074N");
        dosen[5] = new Dosen("Bambang Wisnuadhi", "KO003N");
        dosen[6] = new Dosen("Wendi Wirasta", "KO079N");
        dosen[7] = new Dosen("Didik Suwito Pribadi", "KO005N");
        dosen[8] = new Dosen("Ade Chandra Nugraha", "KO001N");
        dosen[9] = new Dosen("Zulkifli Arsyad", "KO061N");
        dosen[10] = new Dosen("Siti Dwi Setiarini", "KO075N");
        dosen[11] = new Dosen("Yadhi Aditya P.", "KO052N");

        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Tampilkan Jadwal Perkuliahan");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nData Mahasiswa Kelas 2B-D3:");
                    System.out.printf("%-20s %-10s %-10s\n", "Nama", "NIM", "Kelas");
                    for (Mahasiswa m : mahasiswa) {
                        m.tampilkanInfo();
                    }
                    break;

                case 2:
                    System.out.println("\nData Dosen Pengampu Kelas 2B-D3:");
                    System.out.printf("%-20s %-15s\n", "Nama", "Kode Dosen");
                    for (Dosen d : dosen) {
                        d.tampilkanInfo();
                    }
                    break;

                case 3:
                    System.out.println("\nJadwal Perkuliahan Kelas 2B-D3:");
                    String hariSebelumnya = ""; // Variabel untuk menyimpan hari sebelumnya

                    for (JadwalPerkuliahan jp : jadwalPerkuliahan) {
                        if (!jp.getJadwal().getHari().equals(hariSebelumnya)) {
                            // Jika hari saat ini berbeda dari hari sebelumnya, cetak hari
                            if (!hariSebelumnya.equals("")) {
                                System.out.println("----------------------------------------------------------------------");
                            }
                            System.out.println("Hari: " + jp.getJadwal().getHari());
                            hariSebelumnya = jp.getJadwal().getHari(); // Update hari sebelumnya
                        }
                        // Cetak jadwal tanpa menampilkan hari lagi
                        System.out.println("Waktu: " + jp.getJadwal().getWaktuMulai() + " - " + jp.getJadwal().getWaktuSelesai());
                        System.out.println("Kode Mata Kuliah: " + jp.getKodeMataKuliah());
                        System.out.println("Nama Mata Kuliah: " + jp.getMataKuliah().getNama());
                        System.out.println("Jenis Mata Kuliah: " + jp.getJenisMataKuliah());
                        System.out.println("Dosen Pengampu: " + jp.getDosen().getNama());
                        System.out.println("Ruangan: " + jp.getRuangan().getNama());
                        System.out.println(); // Tambahkan baris kosong antara jadwal yang berbeda pada hari yang sama
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}