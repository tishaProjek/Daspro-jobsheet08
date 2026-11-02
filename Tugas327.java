import java.util.Scanner;

public class Tugas327{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal harus 1.");
        } else {
            int totalBarangSeluruhToko = 0;
            int maxBarang = -1;
            int tokoTerbanyak = 0;

            for (int i = 1; i <= jumlahToko; i++) {
                System.out.println("\n--- Toko " + i + " ---");
                System.out.print("Masukkan jumlah pelanggan: ");
                int jumlahPelanggan = sc.nextInt();

                int totalBarangToko = 0;

                for (int j = 1; j <= jumlahPelanggan; j++) {
                    int barang;
                    do {
                        System.out.print("  Jumlah barang dibeli pelanggan " + j + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("  Jumlah barang tidak boleh negatif. Ulangi input!");
                        }
                    } while (barang < 0);

                    totalBarangToko += barang;
                }

                System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

                totalBarangSeluruhToko += totalBarangToko;

                if (totalBarangToko > maxBarang) {
                    maxBarang = totalBarangToko;
                    tokoTerbanyak = i;
                }
            }

            System.out.println("\n==================================");
            System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
        sc.close();
    }
}