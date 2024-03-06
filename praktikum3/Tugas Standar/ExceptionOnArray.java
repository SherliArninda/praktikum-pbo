// Nama : Sherli Arninda
// NIM : 24060122120028
// Tanggal : 6 Maret 2024
// Deskripsi : Kelas yang berisi program class ExceptionOnArray

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) { // penulisan catch ditulis dari yang paling khusus ke yang paling umum
            System.out.println("index eror");
        } catch (Exception exception){
            System.out.println("eror umum");
        }finally{
            System.out.println("clean up code...");
        }
    }
}
