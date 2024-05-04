/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author ASUS
 *  Nama      : Sherli Arninda
    NIM       : 24060122120028
    Tanggal   : 4 Mei 2023
    Deskripsi : Kelas yang berisi implementasi class KontrolSenjata
 */
public class KontrolSenjata{
    Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return this.senjata.getPeluru()>0;
    }
    
    public void isiPeluru(int jumPeluru){
        this.senjata.setPeluru(jumPeluru);
        System.out.println("Peluru berhasil ditambah: " + jumPeluru);
    }
    
    public void menembak(int jumlah){
        System.out.println("Siap menembak " + jumlah + " kali");
        int bnykPeluru = this.senjata.getPeluru();
        if (isAdaPeluru()) {
            for (int i = 0; i < jumlah; i++) {
                if (isAdaPeluru()) {
                    System.out.println(this.senjata.getBunyi());
                    this.senjata.setPeluru(this.senjata.getPeluru() - 1);
                } else {
                    System.out.println("Gagal tembak, peluru habis");
                    
                }
                
            }
            System.out.println("Peluru sisa: " + this.senjata.getPeluru());
        } else {
            System.out.println("Peluru habis");
        }
    }
    
    public String menusuk(){
        if(this.senjata.isMenusuk()){
            return "Jleb";
        }else{
            return "Gagal, Bayonet belum terpasang!";
        }
    }
    
    public void pasangBayonet(){
        this.senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}

