// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 8 Mei 2023
// Deskripsi : Kelas yang berisi implementasi main class BangunDatarGenericTest

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : " + bdg.hitungKeliling());
        System.out.println("tipe generic : " + bdg.get().getClass().getName());
        Persegi p = new Persegi(8);
        BangunDatarGeneric<Persegi>bdg2 = new BangunDatarGeneric<Persegi>();
        bdg2.set(p);
        System.out.println("keliling Lingkaran : " +bdg2.hitungKeliling());
        System.out.println("tipe generic: "+bdg2.get().getClass().getName());

    }
}
