// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 19 Maret 2024
// Deskripsi : Kelas yang berisi progam class Mahasiswa dan mempunyai package org.mahasiswa

package org.mahasiswa;
import org.orang.Orang;
import org.walimahasiswa.WaliMahasiswa;

public class Mahasiswa extends Orang{
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali){
        super(nama, nik);
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNim(){
        return nim;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getJurusan(){
        return jurusan;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public WaliMahasiswa getWali(){
        return wali;
    }

    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }

    public void cetak(){
        super.cetak();
        System.out.println("NIM : " + this.getNim());
        System.out.println("Jurusan : " + this.getJurusan());
        System.out.println("Wali : " + wali.getNama());
    }
}
