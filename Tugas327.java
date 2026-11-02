
import java.util.Scanner;

public class Tugas327 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();

            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1!");
            }
        } while (jumlahToko < 1);

        int totalBarangSemuaToko = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;

        int i = 1;

        while (i <= jumlahToko) {

            int jumlahPelanggan;
            do {
                System.out.print("Masukkan jumlah pelanggan toko " + i + ": ");
                jumlahPelanggan = sc.nextInt();

                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif!");
                }
            } while (jumlahPelanggan < 0);

            int totalBarangToko = 0;
            int totalPelanggan = 0;

            int j = 1;

            while (j <= jumlahPelanggan) {

                int jumlahBarang;

                do {
                    System.out.print("Jumlah barang pelanggan " + j + ": ");
                    jumlahBarang = sc.nextInt();

                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif!");
                    }
                } while (jumlahBarang < 0);

                totalBarangToko += jumlahBarang;
                totalPelanggan++;

                j++;
            }

            System.out.println("Toko " + i + " - pelanggan: "
                    + totalPelanggan + ", total barang: " + totalBarangToko);

            totalBarangSemuaToko += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = i;
            }

            i++;
        }

        System.out.println("Total barang seluruh toko: " + totalBarangSemuaToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}
