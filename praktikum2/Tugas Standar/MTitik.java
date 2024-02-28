// Nama : Sherli Arninda
// NIM  : 24060122120028
// Tanggal : 28 Februari 2024
// Deskripsi : Kelas yang berisi program utama untuk mengaplikasikan kelas Titik

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
    
        

    }
}
