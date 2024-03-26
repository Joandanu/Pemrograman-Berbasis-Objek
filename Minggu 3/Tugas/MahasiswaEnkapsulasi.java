public class MahasiswaEnkapsulasi {
    
    private String nim;
    private String nama;
    private String alamat;
    private double ipk;

    public MahasiswaEnkapsulasi(){
    }

    public MahasiswaEnkapsulasi(String nim){
        this.nim = nim;
    }

    public MahasiswaEnkapsulasi(String nimBaru,String namaBaru, String alamatBaru, double ipkBaru){
        nim = nimBaru;
        nama = namaBaru;
        alamat = alamatBaru;
        ipk = ipkBaru;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public String getNim(){
        return nim;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getAlamat(){
        return alamat;
    }

    public void setIpk(double ipk){
        this.ipk = ipk;
    }

    public double getIpk(){
        return ipk;
    }

    public String predikat(double ipk){
        if (ipk >= 2.0 && ipk <= 2.75) {
            return "Memuaskan";
        }
        else if (ipk >= 2.76 && ipk <= 3.5) {
            return "Sangat Memuaskan";
        }
        else if (ipk >= 3.6 && ipk <= 4.0) {
            return "Dengan Pujian";
        }
        else {
            return "-";
        }
    }

    public void cetak(){
        System.out.println("Nama     : " + nama);
        System.out.println("Alamat   : " + alamat);
        System.out.println("NIM      : " + nim);
        System.out.println("IPK      : " + ipk);
        System.out.println("Predikat : " + predikat(ipk) + "\n");
    }

    
}
