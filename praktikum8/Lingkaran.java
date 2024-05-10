// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 8 Mei 2023
// Deskripsi : Kelas yang berisi implementasi class Lingkaran

public class Lingkaran extends BangunDatar{
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}
