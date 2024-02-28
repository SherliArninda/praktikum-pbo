// Nama : Sherli Arninda
// NIM  : 24060122120028
// Tanggal : 28 Februari 2024
// Deskripsi : Kelas yang berisi program utama untuk mengaplikasikan kelas Titik dan Garis

public class MTitik {
    public static void main(String[] args) {
        Titik t1;
        Titik t2;
        Titik t3;

        t1 = new Titik();
        t2 = new Titik();
        t3 = new Titik(5,6);

        t1.setAbsis(1);
        t1.setOrdinat(2);
        t2.setAbsis(3);
        t2.setOrdinat(4);

        int counterTitik;
        float absis;
        float ordinat;

        counterTitik = Titik.getCounterTitik();
        System.out.println("Jumlah objek titik : " + counterTitik);

        absis = t1.getAbsis();
        ordinat = t1.getOrdinat();
        System.out.printf("t1(%.1f, %.1f)\n", absis, ordinat);
        //System.out.println("t1("+ absis +", " + ordinat +")");

        absis = t2.getAbsis();
        ordinat = t2.getOrdinat();
        System.out.printf("t2(%.1f, %.1f)\n", absis, ordinat);
        //System.out.println("t2("+ absis +", " + ordinat +")");

        absis = t3.getAbsis();
        ordinat = t3.getOrdinat();
        System.out.printf("t3(%.1f, %.1f)\n", absis, ordinat);
        //System.out.println("t3("+ absis +", " + ordinat +")");

        
        System.out.println(t1.getJarakPusat());

        t3.refleksiX();
        System.out.println("RefleksiX = ("+t3.getAbsis()+","+t3.getOrdinat()+")");

        t3.refleksiY();
        System.out.println("RefleksiY = ("+t3.getAbsis()+","+t3.getOrdinat()+")");
        

        Titik t4 = t2.getRefleksiX();
        System.out.println("RefleksiX = (" + t4.getAbsis() + "," + t4.getOrdinat() + ")");

        Titik t5 = t2.getRefleksiY();
        System.out.println("RefleksiY = (" + t5.getAbsis() + "," + t5.getOrdinat() + ")") ;
    

        //Kesimpulan : Jika dalam main kita memanggil atribut atau method yang bersifat private maka akan menghasilkan eror saat dirun 
        //             dikarenakan atribut dan method yang bersifat private tidak bisa diakses dari luar kelas, 
        //             dan yang bisa dipanggil atau digunakan oleh kelas lain yaitu hanyalah atribut dan method yang bersifat public
    
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
