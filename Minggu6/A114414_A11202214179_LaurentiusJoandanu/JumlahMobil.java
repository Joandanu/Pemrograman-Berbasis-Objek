class JumlahMobil extends Pembeli implements Penjualan {
    private int jumlahMobil;

    public JumlahMobil(String nama, String alamat, String noTlp, int jumlahMobil) {
        super(nama, alamat, noTlp);
        this.jumlahMobil = jumlahMobil;
    }

    public void beliMobil(Mobil mobil, int jumlah){
        jumlahMobil = jumlah;
    }

    public void data(){
        super.data();
        System.out.println("Jumlah Mobil Yang Dibeli : " + jumlahMobil);
    }
}