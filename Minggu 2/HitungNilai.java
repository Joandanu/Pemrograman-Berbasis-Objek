import java.util.Scanner;

public class HitungNilai {

    Scanner input = new Scanner(System.in);
    void Nim(){
        System.out.print("Nim  : ");
        String nim = input.nextLine();
    }
    void Nama(){
        System.out.print("Nama  : ");
        String nama = input.nextLine();
    }
    void Tugas(){
        System.out.print("Nilai Tugas  : ");
        double nTugas = input.nextDouble();
    }
    void UTS(){
        System.out.print("Nilai UTS  : ");
        double nUTS = input.nextDouble();
    }
    void UAS(){
        System.out.print("Nilai UAS  : ");
        double nUAS = input.nextDouble();
    }
        input.close();

        
    
}
