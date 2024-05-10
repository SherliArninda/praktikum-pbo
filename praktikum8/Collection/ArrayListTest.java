// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 8 Mei 2023
// Deskripsi : Kelas yang berisi implementasi class ArrayListTest

import java.util.ArrayList;

public class ArrayListTest{
    public static void main(String[] args) {
        // inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        // menghapus elemen
        strings.remove("praktikum");
        // iterasi pada keseluruhan Arraylist
        for(String s : strings){
            System.out.print(s+"");
        }
    }
}