// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 23 Maret 2024
// Deskripsi : Kelas yang berisi implementasi program utama class MLingkaran

import java.util.Scanner;
public class MLingkaran{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jari-jari lingkaran : ");
        double jari2 = scan.nextDouble();
        Lingkaran l = new Lingkaran(jari2);
        System.out.println("Luas lingkaran dengan jejari " + jari2 + " satuan adalah " + l.hitungLuas());
        Lingkaran l2 = new Lingkaran(10.2);
        System.out.println("Luas lingkaran dengan " + "jejari 10.2 satuan adalah " + l.hitungLuas());
    }
}