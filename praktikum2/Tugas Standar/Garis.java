// Nama : Sherli Arninda
// NIM  : 24060122120028
// Tanggal : 28 Februari 2024
// Deskripsi : Kelas yang berisi program class Garis

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris;

    public Garis(){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
        counterGaris++;
    }

    public void setTitikAwal(Titik titikAwal){
        this.titikAwal = titikAwal;
    }

    public void setTitikAkhir(Titik titikAkhir){
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal(){
        return this.titikAwal;
    }

    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    public static double getCounterGaris(){
        return counterGaris;
    }

    public double getPanjang(){
        float x1 = titikAwal.getAbsis();
        float y1 = titikAwal.getOrdinat();
        float x2 = titikAkhir.getAbsis();
        float y2 = titikAkhir.getOrdinat();

        double panjang = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return panjang;
    }

    public double getGradien(){
        float x1 = titikAwal.getAbsis();
        float y1 = titikAwal.getOrdinat();
        float x2 = titikAkhir.getAbsis();
        float y2 = titikAkhir.getOrdinat();

        return (y2 - y1) / (x2 - x1);
    }

    public Garis getRefleksiY(){
        Titik refleksiTitikAwal = new Titik(-titikAwal.getAbsis(), titikAwal.getOrdinat());
        Titik refleksiTitikAkhir = new Titik(-titikAkhir.getAbsis(), titikAkhir.getOrdinat());
        return new Garis(refleksiTitikAwal, refleksiTitikAkhir);
    }
    
    public boolean isTegakLurus(Garis G){
        return this.getGradien() * G.getGradien() == -1;
    }
}
