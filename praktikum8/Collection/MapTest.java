// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 8 Mei 2023
// Deskripsi : Kelas yang berisi implementasi class MapTest

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        // menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        // mengambil elemen pertama
        System.out.println(map.get(1));
        // mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key = map.keySet();
        // bagaimana iterasi untuk mengambil keseluruhan nilai dari kunci ? 
        // petunjuk : gunakan iterasi seperti program ArrayListTest
        for (Integer k : key){
            System.out.println(k);
            System.out.println(map.get(k));
        }

        

    }
}
