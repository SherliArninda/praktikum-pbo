// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 23 Maret 2024
// Deskripsi : Kelas yang berisi implementasi class Lingkaran

import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran (double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
} 
