// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 16 Maret 2024
// Deskripsi : Kelas yang berisi progam class PersegiPanjang dan mempunyai package org.bangundatar

package org.bangundatar;
import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }

    public void printInfo(){
        System.out.println("Bangun Persegi Panjang Bersisi " + getJumlahSisi());
    }
}
