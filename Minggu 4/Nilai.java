import java.util.Scanner;

public class Nilai {
    String nim, nama, predikat;
    float tgs, uts, uas, pTgs, pUts, pUas, nakh;
    char nHuruf;
    Scanner sc = new Scanner(System.in);

    public Nilai(String nim, String nama, Float tgs, Float uts, Float uas){
        this.nim = nim;
        this.nama = nama;
        this.tgs = tgs;
        this.uts = uts;
        this.uas = uas;
    }

    public Nilai() {}

    void isiData(){
        System.out.print("NIM   : ");
        nim = sc.next();
        System.out.print("Nama   : ");
        nama = sc.next();
        System.out.print("Nilai Tugas   : ");
        tgs = sc.nextFloat();
        System.out.print("Nilai UTS   : ");
        uts = sc.nextFloat();
        System.out.print("Nilai UAS   : ");
        uas = sc.nextFloat();
    }

    void hitungNilai() {
        pTgs = 0.3f*tgs;
        pUts = 0.35f*uts;
        pUas = 0.35f*uas;
        nakh = pTgs+pUts+pUas;
    }

    char getNilaiHuruf(float nilai) {
        if (nilai >= 85) 
            nHuruf = 'A';
        else if(nilai >= 70 && nilai < 85)
            nHuruf = 'B';
        else if(nilai >= 60 && nilai < 70)
            nHuruf = 'C';
        else if(nilai >= 40 && nilai <60)
            nHuruf = 'D';
        else
            nHuruf = 'E';
        return nHuruf;
    }

    String getPredikat(char huruf){
        switch(huruf){
            case 'A' : predikat = "Apik";
            break;
            case 'B' : predikat = "Baik";
            break;
            case 'C' : predikat = "Cukup";
            break;
            case 'D' : predikat = "Dablek";
            break;
            default : predikat = "Elek";
        }
        return predikat;
    }

    void cetakNilai() {
        System.out.println("NIM            : " + nim);
        System.out.println("Nama           : " + nama);
        System.out.println("Tugas          : " + tgs + "   : " + pTgs);
        System.out.println("UTS            : " + uts + "   : " + pUts);
        System.out.println("UAS            : " + uas + "   : " + pUas);
        System.out.println("Nilai Akhir    : " + nakh);
        System.out.println("Nilai Huruf    : " + getNilaiHuruf(nakh));
        System.out.println("Predikat       : " + getPredikat(getNilaiHuruf(nakh)));
    }

    public static void daftarNilai(Nilai[] daftarNilai, int jumlahData) {
        System.out.println("=====================================");
        System.out.println("Daftar Nilai Mahasiswa : ");
        System.out.println("=====================================");
        System.out.println("No\tNIM\tNama\tNilai Akhir\tNilai Huruf\tPrediket");

        for (int i = 0; i <jumlahData; i++){
            Nilai nilai = daftarNilai[i];
            System.out.printf("%d\t%s\t%s\t%.2f\t\t%c\t\t%s\n",
            i + 1, nilai.nim, nilai.nama, nilai.nakh, nilai.getNilaiHuruf(nilai.nakh), nilai.getPredikat(nilai.getNilaiHuruf(nilai.nakh)));
        }
    }
}
