public class PersegiPanjang {
    public int panjang;
    public int lebar;
    public static int jumlahObjek = 0;
    
    //kontruktor dari objek PersegiPanjang
    public PersegiPanjang(){
        jumlahObjek ++;
    }

    //kontruktor dari objek PersegiPanjang
    public PersegiPanjang(int panjangBaru, int lebarBaru){
        panjang = panjangBaru;
        lebar = lebarBaru;
        jumlahObjek++;
    }

    //mengembalikan nilai getJumlahObjek
    public static int getJumlahObjek(){
        return jumlahObjek;
    }

    //mengembalikan nilai luas persegi panjang
    public int getLuas(){
        return panjang*lebar;
    }

    //mengembalikan nilai keliling persegi panjang
    public int getKeliling(){
        return 2*(panjang+lebar);
    }
    
}