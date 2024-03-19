// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 16 Maret 2024
// Deskripsi : Kelas yang berisi progam utama untuk mengaplikasikan class Mahasiswa dan WaliMahasiswa

package org.main;
import org.mahasiswa.*;
import org.walimahasiswa.*;

public class Main {
    public static void main(String[] args) {
        WaliMahasiswa wali1 = new WaliMahasiswa("Budi S.kom.,M.Kom","123456789", "08123456789","Jl. Mawar Merah No.15");
        WaliMahasiswa wali2 = new WaliMahasiswa("Laila S.Kom.,M.Kom", "123456788", "0897654321", "Jl.Anggrek No.12A");

        Mahasiswa mhs1 = new Mahasiswa("Nur Lisa","12345677","24060122120009", "Informatika", wali1);
        Mahasiswa mhs2 = new Mahasiswa("Anton Saputra", "12345667", "24060122130056","Informatika", wali2);

        System.out.println("====Daftar WaliMahasiswa====");
        System.out.println("================");
        wali1.cetak();
        System.out.println("================");
        wali2.cetak();
        System.out.println("================");

        System.out.println("====Daftar Mahasiswa====");
        System.out.println("================");
        mhs1.cetak();
        System.out.println("================");
        mhs2.cetak();


    }
}