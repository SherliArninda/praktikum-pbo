// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 2 Maret 2024
// Deskripsi : Kelas yang berisi program class mahasiswa
public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nim, String jurusan, WaliMahasiswa wali){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNim(){
        return this.nim;
    }

    public String getJurusan(){
        return this.jurusan;
    }

    public WaliMahasiswa getWali(){
        return this.wali;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }

    public void cetak(){
        System.out.println("------Data Mahasiswa-------");
        System.out.println("Nama : "+ nama);
        System.out.println("NIM : "+ nim);
        System.out.println("Jurusan : "+ jurusan);
        System.out.println();
        System.out.println("------Data Wali Mahasiswa------");
        System.out.println("Nama : "+ wali.getNama());
        System.out.println("Nomor HP : "+ wali.getNomorHp());
        System.out.println("Alamat : " + wali.getAlamat());
    }
    
}