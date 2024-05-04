Nama      : Sherli Arninda
NIM       : 24060122120028
Tanggal   : 1 Mei 2023
Deskripsi : Kelas yang berisi implementasi class Car

public class Car extends Vehicle{
    void calRent(int jarak, float harga){
        float fare = jarak*harga;
        fare=fare-100.00f;
        System.out.println("harga sewa mobil = " + fare);
    }
}
