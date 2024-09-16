package com.polban.jtk.inventory;

public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    // Constructor
    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }

    // Getter untuk stok
    public int getStok() {
        return stok;
    }

    // Setter untuk menambah stok (hanya penambahan yang diizinkan)
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        } else {
            System.out.println("Jumlah stok harus positif!");
        }
    }

    // Getter untuk nama_barang
    public String getNamaBarang() {
        return nama_barang;
    }
}