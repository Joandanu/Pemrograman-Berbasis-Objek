import java.util.Scanner;

public class MahasiswaEnkapsulasiDemo {
    public static void main(String[] args) {
        MahasiswaEnkapsulasi mhs = new MahasiswaEnkapsulasi();

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama   : ");
        mhs.setNama(input.nextLine());
        System.out.print("Masukkan Alamat : ");
        mhs.setAlamat(input.nextLine());
        System.out.print("Masukkan NIM    : ");
        mhs.setNim(input.nextLine());
        System.out.print("Masukkan IPK    : ");
        mhs.setIpk(input.nextDouble());

        input.close();

        System.out.println("===============================");

        mhs.cetak();

    }
    
}
