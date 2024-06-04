import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaList{
    public static void main(String[] args) {
        // ArrayList<String> mahasiswaList = new ArrayList<>();
        // mahasiswaList.add("Adi");
        // mahasiswaList.add("Bambang");
        // mahasiswaList.add("Cici");
        // mahasiswaList.add("Didi");

        Map<String, String> mahasiswaList = new HashMap<>();
        mahasiswaList.put("24060122120029", "Sherli Arninda");
        mahasiswaList.put("24060122120028", "Arninda Sherli");

        mahasiswaList.forEach(nama,nim){
            System.out.println("NIM :" + nim + ", Nama :" + nama);
        }
    }
}