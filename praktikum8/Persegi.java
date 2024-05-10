// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 8 Mei 2023
// Deskripsi : Kelas yang berisi implementasi class Persegi

public class Persegi extends BangunDatar{
    private double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    public double hitungKeliling(){
        return 4*sisi;
    }
}