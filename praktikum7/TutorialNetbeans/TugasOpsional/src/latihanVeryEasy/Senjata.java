/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanVeryEasy;

/**
 *
 * @author ASUS
 *  Nama      : Sherli Arninda
    NIM       : 24060122120028
    Tanggal   : 3 Mei 2023
    Deskripsi : Kelas yang berisi implementasi class Senjata
 */
public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi=bunyi;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru (int peluru){
        this.peluru = peluru;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void menembak(){
        System.out.println(bunyi);
        int sisaPeluru = getPeluru()-1;
        System.out.println("Sisa Peluru: " + sisaPeluru);
    }
}
