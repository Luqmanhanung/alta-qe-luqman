public class BangunDataDemo {
    public static void main(String[] args) {
        Persegi prsg = new Persegi();
        Segitiga sgtg = new Segitiga();
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Keliling Persegi : " + prsg.keliling());
        System.out.println("Luas Persegi : " + prsg.luas());
        System.out.println("Keliling Segitiga : " + sgtg.keliling());
        System.out.println("Luas Segitiga : " + sgtg.luas());
        System.out.println("Keliling Persegi Panjang : " + pp.keliling());
        System.out.println("Luas Persegi Panjang : " + pp.luas());

    }
}
