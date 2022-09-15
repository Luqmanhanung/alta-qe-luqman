public class Dimensi extends CekOngkosKirim{
    int dimensi(int panjang, int lebar, int tinggi){
        return dimensi = panjang* lebar * tinggi;
    }
    public int biayaOngkir(){
        return biayaOngkosKirim = dimensi *berat * harga;
    }

    public void cekbiayaOngkir(){
        if (dimensi<=50){
            System.out.println("Dikarenakan dimensi kurang dari 50 cm3 maka biaya Ongkos Kirim = "+ 5000);
        }else{
            System.out.println("Biaya Ongkos Kirim = "+ biayaOngkir());
        }
    }

}
