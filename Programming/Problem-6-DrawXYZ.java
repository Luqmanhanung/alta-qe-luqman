public class DrawXYZ {
    //Maaf kode program dibawah belum selesai sepenuhnya karena saya masih binggung untuk menciptakan
    //logic untuk menampilkan pola huruf yang muncul sesuai dengan soal yang diberikan. kode program dibawah hanya bisa menampilkan row dan column
    // sesuai inputan yang diberikan
    public static void drawXYZ(int a) {
        for (int i = 1; i <= a; i++){
            for (int j = 1; j <= a; j++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("----baris dan kolom sejumlah 5----");
        drawXYZ(5);
        System.out.println("----baris dan kolom sejumlah 3----");
        drawXYZ(3);
        System.out.println("----baris dan kolom sejumlah 2----");
        drawXYZ(2);

    }
}
