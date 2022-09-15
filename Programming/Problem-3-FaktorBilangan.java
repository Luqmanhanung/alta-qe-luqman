class FaktorBilangan {
    public static void main(String[] args) {
        int n = 6;                      // --> pembuatan variabel n yang berisi 6 (type data number)

        for (int i = 1; i <= n; i++){   // --> dilakukan perulangan i dimulai dari 1 hingga n, i increment

            if(n % i == 0){             // --> perkondisian jika n dimodulo i sama dengan 0
                System.out.println(i);  // --> maka cetak i
            }
        }
    }
}
