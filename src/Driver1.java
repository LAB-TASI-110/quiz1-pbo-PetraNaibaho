// 12S24002 - Petra Naibaho
// SISTEM INFORMASI 2024

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Driver1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<String, String> namaMenu = new LinkedHashMap<>();
        Map<String, Integer> hargaMenu = new LinkedHashMap<>();

        namaMenu.put("NGS", "Nasi Goreng Spesial");
        hargaMenu.put("NGS", 15000);

        namaMenu.put("AP", "Ayam Penyet");
        hargaMenu.put("AP", 20000);

        namaMenu.put("SA", "Sate Ayam (10 Tusuk)");
        hargaMenu.put("SA", 25000);

        namaMenu.put("BU", "Bakso Urat");
        hargaMenu.put("BU", 18000);

        namaMenu.put("MAP", "Mie Ayam Pangsit");
        hargaMenu.put("MAP", 15000);

        namaMenu.put("GG", "Gado-Gado");
        hargaMenu.put("GG", 15000);

        namaMenu.put("SAM", "Soto Ayam");
        hargaMenu.put("SAM", 17000);

        namaMenu.put("RD", "Rendang Daging");
        hargaMenu.put("RD", 25000);

        namaMenu.put("IB", "Ikan Bakar");
        hargaMenu.put("IB", 35000);

        namaMenu.put("NUK", "Nasi Uduk Komplit");
        hargaMenu.put("NUK", 20000);

        int totalPembayaran = 0;

        System.out.println("Masukkan Kode Menu lalu Porsi Butet (ketik END untuk selesai)");
        System.out.println("==============================================================");
        System.out.printf("%-25s %5s %10s %10s\n", "Menu", "Porsi", "Harga", "Total");
        System.out.println("==============================================================");

        while (true) {

            String kode = input.nextLine().toUpperCase();

            if (kode.equals("END")) {
                break;
            }

            int porsiButet = Integer.parseInt(input.nextLine());

            if (namaMenu.containsKey(kode)) {

                String menu = namaMenu.get(kode);
                int harga = hargaMenu.get(kode);

                int porsiUcok = porsiButet * 2; // Perbandingan 100 : 50 = 2 : 1
                int totalPorsi = porsiButet + porsiUcok;

                int totalHarga = harga * totalPorsi;
                totalPembayaran += totalHarga;

                System.out.printf("%-25s %5d %10d %10d\n",
                        menu, totalPorsi, harga, totalHarga);

            } else {
                System.out.println("Kode menu tidak ditemukan!");
            }
        }

        System.out.println("==============================================================");

        // ================= DISKON =================
        double diskonPersen = 0;
        String kupon = "Tidak ada";

        if (totalPembayaran >= 500000) {
            diskonPersen = 0.25;
            kupon = "Kupon Hitam (25%)";
        } else if (totalPembayaran >= 400000) {
            diskonPersen = 0.20;
            kupon = "Kupon Hijau (20%)";
        } else if (totalPembayaran >= 300000) {
            diskonPersen = 0.15;
            kupon = "Kupon Merah (15%)";
        } else if (totalPembayaran >= 200000) {
            diskonPersen = 0.10;
            kupon = "Kupon Kuning (10%)";
        } else if (totalPembayaran >= 100000) {
            diskonPersen = 0.05;
            kupon = "Kupon Biru (5%)";
        }

        double potongan = totalPembayaran * diskonPersen;
        double totalAkhir = totalPembayaran - potongan;

        System.out.println("Total Pembayaran : " + totalPembayaran);
        System.out.println("Kupon Didapat    : " + kupon);
        System.out.println("Potongan         : " + (int) potongan);
        System.out.println("Total Bayar      : " + (int) totalAkhir);
        System.out.println("==============================================================");

        input.close();
    }
}