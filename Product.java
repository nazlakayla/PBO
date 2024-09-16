package com.polban.jtk.sales;

public class Product {
    // Atribut private untuk menyembunyikan informasi
    private String productName;
    private double price;
    private int stock;

    // Constructor
    public Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    // Getter untuk mendapatkan nama produk
    public String getProductName() {
        return productName;
    }

    // Getter untuk mendapatkan harga produk
    public double getPrice() {
        return price;
    }

    // Setter untuk memperbarui harga produk dengan validasi
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Harga tidak valid!");
        }
    }

    // Getter untuk mendapatkan stok produk
    public int getStock() {
        return stock;
    }

    // Method untuk menambah stok produk dengan validasi
    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
        } else {
            System.out.println("Jumlah stok tidak valid!");
        }
    }

    // Method untuk menjual produk dengan validasi
    public void sellProduct(int quantity) {
        if (quantity > 0 && quantity <= stock) {
            stock -= quantity;
            System.out.println(quantity + " " + productName + " terjual.");
        } else {
            System.out.println("Jumlah stok tidak cukup untuk penjualan.");
        }
    }
}