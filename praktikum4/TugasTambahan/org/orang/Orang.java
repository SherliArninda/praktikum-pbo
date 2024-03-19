// Nama      : Sherli Arninda
// NIM       : 24060122120028
// Tanggal   : 19 Maret 2024
// Deskripsi : Kelas yang berisi progam class Orang dan mempunyai package org.orang


package org.orang;

public class Orang{
    protected String nama;
    protected String nik;

    public Orang(String nama, String nik){
        this.nama = nama;
        this.nik = nik;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNik(){
        return nik;
    }

    public void setNik(String nik){
        this.nik = nik;
    }

    public void cetak(){
        System.out.println("Nama : " + nama);
        System.out.println("NIK : " + nik);
    }

}