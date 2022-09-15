import static java.lang.Math.sqrt;

    public class PrimaNumber {
        static boolean cekBilanganPrima(int angka)
        {
        // Cek jika angka adalah kurang dari sama dengan 1
            if (angka <= 1)
                return false;

            // Cek jika angka sama dengan 2
            else if (angka == 2)
                return true;

            // Periksa apakah angka adalah kelipatan dari 2
            else if (angka % 2 == 0)
                return false;

        // Jika tidak, maka periksa saja peluangnya
            for (int i = 3; i <= sqrt(angka); i += 2)
            {
                if (angka % i == 0)
                    return false;
            }
            return true;
        }

        public static void main(String[] args)
        {
            System.out.println(cekBilanganPrima(23));
            System.out.println(cekBilanganPrima(21));
            System.out.println(cekBilanganPrima(17));
            System.out.println(cekBilanganPrima(29));
            System.out.println(cekBilanganPrima(30));
        }
}
