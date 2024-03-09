// Nama     : Sherli Arninda
// NIM      : 24060122120028
// Tanggal  : 9 Maret 2024
// Deskripsi: Kelas yang berisi program class Product

public class Product {
    private String name;
    private int stock;
    private int price;
    public Product() {
    this.name = "";
    this.stock = 0;
    this.price = 0;
    }
    public Product(String name, int stock, int price) {
    this.name = name;
    this.stock = stock;
    this.price = price;
    }
    public String getName() {
    return name;
    }
    public int getStock() {
    return stock;
    }
    public int getPrice() {
    return price;
    }
    public void setName(String name) {
        // TODO : Tambahkan kode untuk set atribut name dan berikan asersi jika name yang dimasukkan berupa string kosong
        assert (!name.isEmpty()) : "Nama tidak boleh kosong";
        this.name = name;
    }
    public void setStock(int stock) {
        // TODO : Tambahkan kode untuk set atribut stock dan berikan asersi bahwa jumlah stock yang dimasukkan harus bilangan positif
        assert (stock > 0) : "Stock tidak boleh negatif";
        this.stock = stock;
    }
    public void setPrice(int price) {
        // TODO : Tambahkan kode untuk set atribut price danberikan asersi bahwa jumlah stok yang dimasukkan harus bilangan positif
        assert (price > 0): "Jumlah stock tidak boleh negatif";
        this.price = price;
    }
    public void purchaseProduct(int quantity) {
        // TODO : Tambahkan kode untuk mengurangi stok produk jika dilakukan pembelian. 
        // Berikan asersi dimana quantity yang dimasukkan harus bilangan positif dan berikan juga asersi
        // jika stok produk yang tersedia tidak mencukupi.
        assert (quantity > 0) : "Quantity tidak boleh negatif";
        assert (quantity <= stock) : "Stock tida mencukupi";
        stock -= quantity;
    }
    public void addStock(int quantity) {
        // TODO : Tambahkan kode untuk menambah stok produk.
        // Berikan asersi dimana quantity yang dimasukkan harus bilangan
        // positif
        assert (quantity > 0) : "Quantity tidak boleh negatif";
        stock += quantity;
    }
}

