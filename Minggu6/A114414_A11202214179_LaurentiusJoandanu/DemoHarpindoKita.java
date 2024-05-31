import java.util.Scanner;


public class DemoHarpindoKita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========DATA KARYAWAN==============");
        System.out.print("Masukkan Nama Karyawan  : ");
        String na = scanner.nextLine();
        System.out.print("Masukkan Alamat Karyawan: ");
        String al = scanner.nextLine();
        System.out.print("Masukkan NIP karyawan   : ");
        String ni = scanner.nextLine();
        Keuntungan karyawan = new Keuntungan(na, al, ni);

        System.out.println("======MASUKKAN HARGA MOBIL===========");
        System.out.print("Masukkan Harga Mobil Sedan  : ");
        double hargaSedan = scanner.nextDouble();
        System.out.print("Masukkan Harga Mobil Minibus: ");
        double hargaMinibus = scanner.nextDouble();
        System.out.print("Masukkan Harga Mobil Bus    : ");
        double hargaBus = scanner.nextDouble();

        Mobil sedan = new Sedan();
        Mobil minibus = new Minibus();
        Mobil bus = new Bus();

        sedan.setHarga(hargaSedan);
        minibus.setHarga(hargaMinibus);
        bus.setHarga(hargaBus);

        scanner.nextLine(); // Membersihkan buffer

        TotalBelanja total = new TotalBelanja("Suep", "Bandung", "0822123456", 2);
        total.beliMobil(sedan, 2);
        
        System.out.println("===========DATA PEMBELI=============");
        total.data();

        System.out.println("==========HARPINDO KITA============");
        karyawan.lihatDataPembeli(total);

        double keuntungan = total.getTotalBelanja();
        karyawan.hitungKeuntungan(keuntungan);
        karyawan.data();

        scanner.close();
    }
}
