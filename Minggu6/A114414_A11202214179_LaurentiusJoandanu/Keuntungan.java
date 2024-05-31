class Keuntungan extends Karyawan {
    private double totalKeuntungan;

    public Keuntungan(String nama, String alamat, String nip) { 
        super(nama, alamat, nip);
        this.totalKeuntungan = 0; // Inisialisasi dengan nilai awal
    }
    
    public void hitungKeuntungan(double totalHarga){
        totalKeuntungan = totalHarga * 0.10;
    }

    public void data(){
        super.data();
        System.out.println("Keuntungan    : " + totalKeuntungan);
    }
}