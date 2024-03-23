// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 23 Maret 2024
// Deskripsi : Kelas yang berisi implementasi program utama MBujurSangkar

import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas Bujur Sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
        
        scan.close();
    }
}
