package com.polban.jtk.sales;

public class Main {
    public static void main(String[] args) {
        // 1. Buat object product dengan quantity produk 10
        Product laptop = new Product("Laptop", 14000000, 10);

        // 3. Buat object sales
        Sales sales = new Sales(laptop);

        // 4. Lakukan penjualan produk dengan quantity 5
        sales.sellProduct(5);

        // 5. Lakukan restock produk
        sales.restockProduct(7);

        // 6. Lakukan memperbaharui harga produk
        sales.updateProductPrice(1.4E7);

        // 7. Coba lakukan memperbaharui harga produk dengan nilai negatif
        sales.updateProductPrice(-2000000);
    }
}