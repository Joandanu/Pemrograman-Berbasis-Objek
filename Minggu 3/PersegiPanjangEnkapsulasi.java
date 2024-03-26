public class PersegiPanjangEnkapsulasi {

    //panjang, lebar, dan jumlahObjek dengan modifier private
    private int panjang;
    private int lebar;
    private static int jumlahObjek = 0;

    //konstruktor dari objek PersegiPanjang
    public PersegiPanjangEnkapsulasi(){
        jumlahObjek++;
    }
    
    //konstruktor dari objek PersegiPanjang
    public PersegiPanjangEnkapsulasi(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
        jumlahObjek++;
    }
 
    //method setter untuk property panjang
    public void setPanjang(int panjangBaru){
        panjang = panjangBaru;
    }
 
    //method getter untuk property panjang
    public int getPanjang(){
        return panjang;
    }
 
    //method setter untuk property lebar
    public void setLebar(int lebar){
        //gunakan kata kunci this karena nama masukan parameter
        //lebar sama dengan nama property lebar
        this.lebar = lebar;
    }
 
    //method getter untuk property lebar
    public int getLebar(){
        return lebar;
    }
 
    //method getter untuk mengembalikan nilai getJumlahObjek
    public static int getJumlahObjek(){
        return jumlahObjek;
    }
 
    //method getter untuk mengembalikan nilai luas persegi panjang
    public int getLuas(){
        return panjang*lebar;
    }
 
    //method getter untuk mengembalikan nilai keliling
    public int getKeliling(){
        return 2*(panjang+lebar);
    }
}
