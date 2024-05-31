class Karyawan extends Biodata {
    private String nip;

    public Karyawan(String nama, String alamat, String nip){
        super(nama, alamat);
        this.nip = nip;
    }

    public String getNIP() {
        return nip;
    }

    public void setNIP(String nip) {
        this.nip = nip;
    }

    public void lihatDataPembeli(Pembeli pembeli) {
        pembeli.data();
    }

    public void data() {
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Alamat        : " + alamat);
        System.out.println("NIP           : " + nip);
    }
}