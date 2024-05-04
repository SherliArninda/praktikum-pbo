Nama      : Sherli Arninda
NIM       : 24060122120028
Tanggal   : 1 Mei 2023
Deskripsi : Kelas yang berisi implementasi main class PegawaiDanGaji

public class PegawaiDanGaji {
    public static void main(String[] args){
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}
