// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 2 Maret 2024
// Deskripsi : Kelas yang berisi program utama untuk mengaplikasikan kelas Mahasiswa dan WaliMahasiswa

public class Main{
    public static void main(String[] args) {
        WaliMahasiswa wali1 = new WaliMahasiswa("Intan Maharani S.kom", "081123456", "Magelang");
        WaliMahasiswa wali2 = new WaliMahasiswa("Rahayu S.kom", "08123465", "Semarang");
        Mahasiswa mhs1 = new Mahasiswa("Sherli Arninda", "24060122120028", "Informatika", wali1);
        Mahasiswa mhs2 = new Mahasiswa("Arninda Sherli", "24060122120078", "Informatika", wali2);
        
        mhs1.cetak();
        mhs2.cetak();
    }
}