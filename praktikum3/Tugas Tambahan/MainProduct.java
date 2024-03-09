// Nama     : Sherli Arninda
// NIM      : 24060122120028
// Tanggal  : 9 Maret 2024
// Deskripsi: Kelas yang berisi main program class Product

public class MainProduct {
    public static void main(String[] args) {
        // Membuat objek Product
        Product product = new Product("Komputer",10, 5000000);
        
        // Mengakses atribut
        System.out.println("Nama Produk: " + product.getName());
        System.out.println("Stok: " + product.getStock());
        System.out.println("Harga: $" + product.getPrice());

        System.out.println("======================================");

        Product product2 = new Product("Laptop", 15, 6000000);
        System.out.println("Nama Produk: " + product2.getName());
        System.out.println("Stok: " + product2.getStock());
        System.out.println("Harga: $" + product2.getPrice());

        product2.purchaseProduct(5);
        System.out.println("Stok produk setelah di purchase : " + product2.getStock());
        
        product2.addStock(1);
        System.out.println("Stok Produk setelah di add : " + product2.getStock());

        System.out.println("======================================");

        Product product3 = new Product();
        try {
            product3.setName("");
        } catch (Exception e) {
            System.out.println("Assertion error: " + e.getMessage());
        }
    }
}
