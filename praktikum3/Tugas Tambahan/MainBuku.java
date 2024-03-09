// Nama     : Sherli Arninda
// NIM      : 24060122120028
// Tanggal  : 9 Maret 2024
// Deskripsi: Kelas yang berisi Main program class Buku

public class MainBuku {
    public static void main(String[] args) {

        Buku buku1 = new Buku("Pemrograman Berbasis Objek");
        Buku buku2 = new Buku("Gravika dan Komputasi Visual");
        Buku buku3 = new Buku("Analisis dan Strategi Algoritma");
        Buku buku4 = new Buku("Sistem Cerdas");

        Anggota anggota = new Anggota("Sherli Arninda");

        buku1.setTersedia(true);
        buku2.setTersedia(true);
        buku3.setTersedia(false); // Menjadikan buku3 tidak tersedia

        try {
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);
            anggota.pinjamBuku(buku3); // Akan melempar BukuTidakTersediaException karena buku3 tidak tersedia
            anggota.pinjamBuku(buku4); // Akan melempar MaksimumBukuTerpinjamException karena anggota sudah meminjam maksimum jumlah buku
        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println("Exception Message : " + e.getMessage());
        } catch (BukuTidakTersediaException e) {
            System.out.println("Exception Message : " + e.getMessage());
        }

        // Menampilkan buku-buku yang sedang dipinjam oleh anggota
        System.out.println("\nBuku yang sedang dipinjam oleh " + anggota.getNama() + ":");
        for (Buku buku : anggota.getBukuPinjaman()) {
            if (buku != null) {
                System.out.println("- " + buku.getJudul());
            }
        }
    }
}
