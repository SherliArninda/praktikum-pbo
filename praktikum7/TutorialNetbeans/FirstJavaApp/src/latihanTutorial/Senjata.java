/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanTutorial;

/**
 *
 * @author ASUS
 *  Nama      : Sherli Arninda
    NIM       : 24060122120028
    Tanggal   : 1 Mei 2023
    Deskripsi : Kelas yang berisi implementasi class Senjata
 */
public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private boolean bayonetTerpasang;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }
    
    private void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    private String getBunyi(){
        return bunyi;
    }
    
    private void setMenusuk(){
        this.menusuk = true;
    }
    
    private boolean isMenusuk(){
        return menusuk;
    }
    
    private void setBayonetTerpasang(boolean status) {
        this.bayonetTerpasang = status;
    }
    
    private boolean isBayonetTerpasang() {
        return bayonetTerpasang;
    }
    
    public void menembak(int jumlah){
        for (int i = 0; i < jumlah; i++){
            System.out.print(bunyi + " ");
        }
        System.out.println();
    }
    
    public void pasangBayonet(){
        setBayonetTerpasang(true);
        System.out.println("Bayonet Terpasang");
    }
    
    public void menusuk(){
        if (!isBayonetTerpasang()) {
            System.out.print("Gagal, belum pasang bayonet\n");
            return;
        }
        
        setMenusuk();
        System.out.print("Jleb!\n");
    }
}
