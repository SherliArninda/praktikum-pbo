// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 19 Maret 2024
// Deskripsi : Kelas yang berisi progam class WaliMahasiswa dan mempunyai package org.walimahasiswa

package org.walimahasiswa;
import org.orang.Orang;

public class WaliMahasiswa extends Orang{
    private String nomorHp;
    private String alamat;

    public WaliMahasiswa(String nama, String nik, String nomorHp, String alamat){
        super(nama, nik);
        this.nomorHp = nomorHp;
        this.alamat = alamat;
    }

    public String getNomorHp(){
        return nomorHp;
    }

    public void setNomorHp(String nomorHp){
        this.nomorHp = nomorHp;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void cetak(){
        super.cetak();
        System.out.println("Nomor Hp : " + this.getNomorHp());
        System.out.println("Alamat : " + this.getAlamat());
    }
    
}