import java.util.Scanner;

public class HitungLuasPersegi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi  : ");
        double sisi = input.nextDouble();
        input.close();
        double luas = sisi*sisi;
        System.out.print("Luas Persegi  : "+luas);
    }
}