public class CekOngkirDemo {
    public static void main(String[] args) {
        Dimensi dms = new Dimensi();
        System.out.println("Dimensi barang yang akan dikirim = " + dms.dimensi(5, 2, 4)+ " cm3");
        dms.cekbiayaOngkir();
    }

}
