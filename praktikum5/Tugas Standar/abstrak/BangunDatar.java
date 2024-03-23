// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 23 Maret 2024
// Deskripsi : Kelas yang berisi implementasi class abstract BangunDatar

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}