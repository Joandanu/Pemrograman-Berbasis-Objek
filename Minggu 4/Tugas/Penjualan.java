import java.util.Scanner;

public class Penjualan {
    
    String kode;
    String nama;
    float harga;
    int jumlah;
    float total;
    String bns;
    Scanner sc = new Scanner(System.in);

    public Penjualan(String kode, String nama, float harga, int jumlah ){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public Penjualan(){}

    void isiData(){
        System.out.print("Kode            : ");
        kode = sc.nextLine();
        System.out.print("Nama            : ");
        nama = sc.nextLine();
        System.out.print("Harga Barang    : ");
        harga = sc.nextFloat();
        System.out.print("Jumlah Barang   : ");
        jumlah = sc.nextInt();
    }

    void getTotalPembelian(){
        total = harga * jumlah;
    }

    String getBonus(float bonus, int jumlahB){
        if (bonus >= 500000 && jumlahB > 5) {
            bns = "Setrika";
        }
        else if (bonus >= 100000 && jumlahB > 3) {
            bns = "Payung";
        }
        else if (bonus >= 50000 && jumlahB > 2){
            bns = "Bolpoin";
        }
        else
            bns = "-";
        return bns;
    }

    void cetakNota(){
        System.out.println("=====================================");
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        System.out.println("Harga Barang    : " + harga);
        System.out.println("Jumlah Barang   : " + jumlah);
        System.out.println("Total           : " + total);
        System.out.println("Bonus           : " + getBonus(total, jumlah));
    }

    public static void daftarPenjualan(Penjualan[] daftarPenjualan, int jumlahData){
        System.out.println("=====================================");
        System.out.println("Daftar Pejualan : ");
        System.out.println("=====================================");
        System.out.println("No\tKode\tNama\tTotal\t\tBonus"); 

        for (int i = 0; i < jumlahData; i++){
            Penjualan penjualan = daftarPenjualan[i];
            System.out.printf("%d\t%s\t%s\t%.2f\t%s\n",
            i + 1, penjualan.kode, penjualan.nama, penjualan.total, penjualan.getBonus(penjualan.total, penjualan.jumlah));
        }
    }
}
