import java.util.Scanner;

public class PenjualanDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ulang;

        Penjualan[] daftarPenjualan = new Penjualan[100];

        int jumlahData = 0;

        do {
            System.out.println("=========================================");
            System.out.println("Input Data Penjualan : ");
            System.out.println("=========================================");

            Penjualan penjualan = new Penjualan();

            penjualan.isiData();
            penjualan.getTotalPembelian();
            penjualan.cetakNota();

            daftarPenjualan[jumlahData] = penjualan;
            jumlahData++;

            System.out.println("Input Data Lagi [Y/T]    :");
            ulang = sc.nextLine();

        } while (ulang.equalsIgnoreCase("Y"));

        Penjualan.daftarPenjualan(daftarPenjualan, jumlahData);
        sc.close();
    }
}