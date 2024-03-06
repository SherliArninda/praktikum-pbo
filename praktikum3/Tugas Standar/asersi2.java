// Nama : Sherli Arninda
// NIM : 24060122120028
// Tanggal : 6 Maret 2024
// Deskripsi : Kelas yang berisi program class asersi2

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari!=0):"Jari jari tidak boleh nol!!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " +kelilingLingkaran);
    }
}

// secara konsep yang kurang tepat pada kodingan di atas yaitu pada bagian asert(jariJari>0):"jari jari tidak boleh nol!!!" 
// hal ini dikarenakan pada jariJari > 0 kurang sesuai dengan pesan yang akan ditampilkan, sehingga agar sesuai dengan pesan yang akan ditampilkan bisa mengganti tandanya jadi != 