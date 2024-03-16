// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 16 Maret 2024
// Deskripsi : Kelas yang berisi progam utama untuk mengaplikasikan class PersegiPanjang dan Segitiga

package org.main;
import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi panjang : " + persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(3, 4, 3);
        segitiga.printInfo();
        System.out.println("Luas Segitiga : " + segitiga.hitungLuas());
    }
}
