package org.example.rental;

import java.util.Scanner;

public class PenyewaanMobil {

    /**
     * Metode utama untuk menjalankan program penyewaan mobil.
     *
     * @param args argumen baris perintah (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data penyewaan
        System.out.println("=== Nota Penyewaan Mobil ===");
        System.out.print("Nama Penyewa: ");
        String namaPenyewa = scanner.nextLine();

        System.out.print("Jenis Mobil: ");
        String jenisMobil = scanner.nextLine();

        System.out.print("Lama Sewa (hari): ");
        int lamaSewa = scanner.nextInt();

        System.out.print("Harga per Hari: ");
        double hargaPerHari = scanner.nextDouble();

        // Perhitungan total biaya
        double totalBiaya = lamaSewa * hargaPerHari;

        // Cetak nota
        System.out.println("\n=== Nota Penyewaan Mobil ===");
        System.out.println("Nama Penyewa: " + namaPenyewa);
        System.out.println("Jenis Mobil: " + jenisMobil);
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("Harga per Hari: Rp " + hargaPerHari);
        System.out.println("Total Biaya: Rp " + totalBiaya);
    }
}
