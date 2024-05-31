class TotalBelanja extends JumlahMobil {
    private double hargaTotal;
    private Mobil mobil;

    public TotalBelanja(String nama, String alamat, String noTlp, int jumlahMobil) {
        super(nama, alamat, noTlp, jumlahMobil);
        this.hargaTotal = 0;
    }

    public double getTotalBelanja() {
        return hargaTotal;
    }
    
    public void beliMobil(Mobil mobil, int jumlah){
        this.mobil = mobil;
        hargaTotal = mobil.getHarga() * jumlah;
    }

    public void data(){
        super.data();
        System.out.println("Jenis Mobil Yang Dibeli  : " + mobil.getTipe());
        System.out.println("Total Harga              : " + hargaTotal);
    }
}