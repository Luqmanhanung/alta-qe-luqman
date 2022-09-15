public class Mean {
    //pembuatan method untuk menghitung rata-rata bernama HitungMean dengan parameter variabel a (float) --> untuk menuliskan array yang berisi kumpulan angka
    private static float HitungMean(float[] a)
    {
        int jum = 0; //inisialisasi variabel jum dengan data awal 0
        float n = a.length; //inisialisasi variabel n (float) untuk menghitung panjang array
        for (int i = 0; i < n; i++) //dilakukan perulangan dengan kondisi nilai awal i = 1 hingga i lebih kecil dari n. i increment
            jum += a[i]; // dilakukan penjumlahan seluruh angka pada array a disimpan pada variabel jum
            return (float) jum / n; // mengembalikan nilai dari variabel jum dibagi dengan variabel n
        }

        public static void main(String args[])
        {
            float a[] = { 1, 3, 4, 2, 7, 5, 8, 6 };

            System.out.println("Rata-rata = " + HitungMean(a));

        }


}
