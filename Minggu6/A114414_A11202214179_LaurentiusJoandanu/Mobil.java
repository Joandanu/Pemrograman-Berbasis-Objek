abstract class Mobil {
    protected String tipe;
    protected double harga;

    public Mobil(String tipe) {
        this.tipe = tipe;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public String getTipe() {
        return tipe;
    }
}