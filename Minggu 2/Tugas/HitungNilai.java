public class HitungNilai {

    double nilaiTUGAS;
    double nilaiUTS;
    double nilaiUAS;
    double pNilaiTUGAS;
    double pNilaiUTS;
    double pNilaiUAS;
    double nilaiAkhir;

    public void hitung(){
        
        pNilaiTUGAS = nilaiTUGAS * 0.20;
        pNilaiUTS = nilaiUTS * 0.35;
        pNilaiUAS = nilaiUAS * 0.45;
        nilaiAkhir = pNilaiTUGAS + pNilaiUTS + pNilaiUAS;
    }

    public void cetakNilai(){
        System.out.print("Nilai Tugas (20%) : " + nilaiTUGAS);
        System.out.println(" : " + pNilaiTUGAS);
        System.out.print("Nilai UTS   (35%) : " + nilaiUTS);
        System.out.println(" : " + pNilaiUTS);
        System.out.print("Nilai UAS   (45%) : " + nilaiUAS);
        System.out.println(" : " + pNilaiUAS);
        System.out.println("Nilai Akhir  : " + nilaiAkhir);
        
    }
}