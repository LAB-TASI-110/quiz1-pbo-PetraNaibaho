// 12S24002 - Petra Naibaho
// Sistem Informasi 2024

import java.util.Scanner;

public class Driver3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SISTEM LAUNDRY DEL ===");

        System.out.print("Nama Pelanggan: ");
        String nama = input.nextLine();

        System.out.print("No HP: ");
        String noHp = input.nextLine();

        System.out.print("Berat Cucian (Kg): ");
        double berat = input.nextDouble();

        int hargaPerKg = 7000;
        double total = berat * hargaPerKg;

        System.out.println("\n--- STRUK ---");
        System.out.println("Nama  : " + nama);
        System.out.println("No HP : " + noHp);
        System.out.println("Berat : " + berat + " Kg");
        System.out.println("Total : Rp" + total);
    }
}
