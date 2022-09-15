public class Kalkulator {
    private int hasil;
    public void penjumlahan(int a, int b){
        hasil = a + b;
        System.out.println("Penjumlahan : " + hasil);
    }
    public void pengurangan(int a, int b){
        hasil = a - b;
        System.out.println("Pengurangan : " + hasil);
    }
    public void perkalian(int a, int b){
        hasil = a * b;
        System.out.println("Perkalian : " + hasil);
    }
    public void pembagian(int a, int b){
        hasil = a / b;
        System.out.println("Pembagian : " + hasil);
    }

    public static void main(String[] args) {
        Kalkulator kal = new Kalkulator();
        kal.penjumlahan(3,4);
        kal.pengurangan(15,4);
        kal.perkalian(10,10);
        kal.pembagian(12,3);
    }
}
