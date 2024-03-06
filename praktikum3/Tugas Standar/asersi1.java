// Nama : Sherli Arninda
// NIM : 24060122120028
// Tanggal : 6 Maret 2024
// Deskripsi : Kelas yang berisi program class asersi1

public class asersi1{
    public static void main(String[] args){
        int x = 0;
        if(x>0){
            System.out.println("bilangan positif");
        }else{
            assert(x<0): "Ada kesalahan kode";
            System.out.println("bilangan negatif");

        }
    }
}