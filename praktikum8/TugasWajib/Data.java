// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 10 Mei 2023
// Deskripsi : Kelas yang berisi implementasi class Data
public class Data<T extends Kupu>{
    private T isi;

    public void setIsi(T x){
        this.isi = x;
    }

    public T getIsi(){
        return this.isi;
    }
}
