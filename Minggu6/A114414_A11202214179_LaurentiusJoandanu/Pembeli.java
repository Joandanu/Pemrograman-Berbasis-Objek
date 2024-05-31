class Pembeli extends Biodata {
    private String noTlp;
    
    public Pembeli(String nama, String alamat, String noTlp){
        super(nama, alamat);
        this.noTlp = noTlp;
    }
    
    public void data(){
        System.out.println("Nama Pembeli  : " + nama);
        System.out.println("Alamat        : " + alamat);
        System.out.println("No Telepon    : " + noTlp);
    }
}