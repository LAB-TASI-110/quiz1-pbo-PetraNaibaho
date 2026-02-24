// 12S24002 - Petra Naibaho
// Sistem Informasi 2024

import java.util.Scanner;

public class Driver2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Input jumlah data
        int N = sc.nextInt();

        // 2. Input deret nilai
        int[] nilai = new int[N];
        for (int i = 0; i < N; i++) {
            nilai[i] = sc.nextInt();
        }

        // 3. Input kode kelompok
        int kodeKelompok = sc.nextInt();

        // Validasi kode kelompok
        if (kodeKelompok < 1 || kodeKelompok > N) {
            System.out.println("Kode kelompok tidak valid");
            return:
        }

        // Proses penjumlahan nilai kelompok
        int total = 0;
        for (int i = kodeKelompok - 1; i < N; i += kodeKelompok) {
            total += nilai[i];
        }

        // Output hasil
        System.out.println(total);

        sc.close();
    }
}
