//   Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 
// Deskripsi : Kelas yang berisi program class walimahasiswa

public class WaliMahasiswa{
    private String nama;
    private String nomorHp;
    private String alamat;

    public WaliMahasiswa(String nama, String nomorHp, String alamat){
        this.nama = nama;
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNomorHp(){
        return this.nomorHp;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

}