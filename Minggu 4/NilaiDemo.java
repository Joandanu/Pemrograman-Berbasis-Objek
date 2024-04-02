import java.util.Scanner;

public class NilaiDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ulangi;

        Nilai[] daftarNilai = new Nilai[100];

        int jumlahData = 0;

        do {
            System.out.println("=========================================");
            System.out.println("Program Menghitung Nilai Mahasiswa : ");
            System.out.println("=========================================");

            Nilai nilai = new Nilai();

            nilai.isiData();
            nilai.hitungNilai();
            nilai.cetakNilai();

            daftarNilai[jumlahData] = nilai;
            jumlahData++;

            System.out.println("Apakah masih ingin hitung nilai[Y/N] : ");
            ulangi = sc.nextLine();

        } while (ulangi.equalsIgnoreCase("Y"));

        Nilai.daftarNilai(daftarNilai, jumlahData);
    }
}
