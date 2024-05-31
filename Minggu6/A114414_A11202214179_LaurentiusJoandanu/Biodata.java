abstract class Biodata {
    protected String nama;
    protected String alamat;

    public Biodata(String nama, String alamat){
        this.nama = nama;
        this.alamat = alamat;
    }

    public abstract void data();

    // Setter dan Getter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Setter dan Getter untuk alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}