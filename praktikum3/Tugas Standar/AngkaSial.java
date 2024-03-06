// Nama : Sherli Arninda
// NIM : 24060122120028
// Tanggal : 6 Maret 2024
// Deskripsi : Kelas yang berisi program class AngkaSial

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}
// pada baris 12 tidak akan dijalankan saat terjadi eksepsi karena baris tersebut akan dijalankan saat tidak terjadi eksepsi, dan jika terjadi eksepsi akan langsung diarahkan ke catch
// Untuk baris 21 akan dieksekusi jika terjadi eksepsi sehingga ketika dijalankan akan memunculkan pesan yang sudah di tuliskan pada file AngkaSialException