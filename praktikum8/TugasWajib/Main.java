// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 10 Mei 2023
// Deskripsi : Kelas yang berisi implementasi class Main

public class Main {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<Kupu>();
        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}
