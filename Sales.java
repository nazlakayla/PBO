package com.polban.jtk.sales;

import java.text.DecimalFormat;

public class Sales {
    private Product product;

    // Constructor
    public Sales(Product product) {
        this.product = product;
    }

    // Metode untuk melakukan penjualan
    public void sellProduct(int quantity) {
        System.out.println("Memproses penjualan...");
        product.sellProduct(quantity);
        System.out.println("Stok setelah penjualan: " + product.getStock());
    }

    // Metode untuk menambah stok produk
    public void restockProduct(int quantity) {
        System.out.println("Menambah stok...");
        product.addStock(quantity);
        System.out.println("Stok setelah penambahan: " + product.getStock());
    }

    // Metode untuk memperbarui harga produk dengan format decimal yang benar
    public void updateProductPrice(double newPrice) {
        System.out.println("Memperbarui harga produk...");
        product.setPrice(newPrice);

        // Format price agar tidak dalam notasi ilmiah
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Harga baru: " + df.format(product.getPrice()));
    }
}