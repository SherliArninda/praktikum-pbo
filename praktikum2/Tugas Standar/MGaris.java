// Nama : Sherli Arninda
// NIM  : 24060122120028
// Tanggal : 28 Februari 2024
// Deskripsi : Kelas yang berisi program utama untuk mengaplikasikan kelas Garis

public class MGaris {
    public static void main(String[] args) {
        Garis garis2 = new Garis(new Titik(1, 2), new Titik(1, 5));
        Garis garis3 = new Garis(new Titik(9,5), new Titik(-9,-7));
        
        System.out.println("titikAwal garis2: (" + garis2.getTitikAwal().getAbsis() + garis2.getTitikAwal().getOrdinat() + ")");
        //System.out.println("titikAwal garis2: (" + garis2.getTitikAwal().getAbis() +garis2.getTitikAwal().getOrdinat() +")");
        System.out.println("Banyaknya garis yang terbuat: " + Garis.getCounterGaris());

        Titik titik1 = new Titik(1, 2);
        Titik titik2 = new Titik(4, 6);
        Garis garis = new Garis(titik1, titik2);
        System.out.println("Panjang garis: " + garis.getPanjang());
        System.out.println("Gradien garis: " + garis.getGradien());

        Garis titik3 = garis.getRefleksiY();
        System.out.println("GetRefleksiY Titik Awal: (" + titik3.getTitikAwal().getAbsis() + ", " + titik3.getTitikAwal().getOrdinat() + ")");
        System.out.println("GetRefleksiY Titik Akhir: (" + titik3.getTitikAkhir().getAbsis() + ", " + titik3.getTitikAkhir().getOrdinat() + ")");
        
        Titik titik4 = new Titik(1, 1);
        Titik titik5 = new Titik(2, 3);
        Garis g1 = new Garis(titik4, titik5);
        Garis g2 = new Garis(titik1, titik2);

        System.out.println("Apakah Garis 1 tegak lurus dengan Garis 2 ? " + g1.isTegakLurus(g2));
    }
}