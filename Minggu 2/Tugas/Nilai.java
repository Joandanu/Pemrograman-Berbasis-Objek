import java.util.Scanner;

public class Nilai {
    public static void main(String [] args){

        HitungNilai Hnilai = new HitungNilai();

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM           : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Nama          : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nilai Tugas   : ");
        Hnilai.nilaiTUGAS = input.nextDouble();
        System.out.print("Masukkan Nilai UTS     : ");
        Hnilai.nilaiUTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS     : ");
        Hnilai.nilaiUAS = input.nextDouble();

        input.close();

        Hnilai.hitung();

        System.out.println("Hasil Hitung Nilai Mahasiswa");
        System.out.println("NIM               : " + nim);
        System.out.println("Nama              : " + nama);
        Hnilai.cetakNilai();
    }
}
