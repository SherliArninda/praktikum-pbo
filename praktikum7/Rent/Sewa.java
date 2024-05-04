Nama      : Sherli Arninda
NIM       : 24060122120028
Tanggal   : 1 Mei 2023
Deskripsi : Kelas yang berisi implementasi main class Sewa

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();

        kendaraan.calRent(50, 1000);
        mobil.calRent(50, 1000);
        bis.calRent(50, 1000);
    }
}
