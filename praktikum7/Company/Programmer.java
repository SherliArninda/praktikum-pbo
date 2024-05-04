Nama      : Sherli Arninda
NIM       : 24060122120028
Tanggal   : 1 Mei 2023
Deskripsi : Kelas yang berisi implementasi class Programmer

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer (String nama){
        setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus: " + bonus);
    }
}
