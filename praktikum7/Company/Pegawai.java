Nama      : Sherli Arninda
NIM       : 24060122120028
Tanggal   : 1 Mei 2023
Deskripsi : Kelas yang berisi implementasi class Pegawai

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama: " + nama + ", Gaji Pokok: " + gajiPokok);
    }    
}

