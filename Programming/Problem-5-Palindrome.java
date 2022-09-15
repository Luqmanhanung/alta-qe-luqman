public class Palindrome {
        public static boolean cekPalindrome(String value)
        {
            // membuat variabel bertipe data String dengan nama "katakosong" untuk menampung kata yang akan ditulis balik dari belakang
            String kataKosong = "";

            // menginialisasi variabel bertipe boolean dengan data awal False
            boolean cekkata = false;

            //dilakukan perulangan dengan membuat variabel i dimana data awalnya berasal dari panjang value yang dinput dikurangi 1.
            // perulangan ini dilakukan jika data pada variabel i lebih dari sama dengan 0. setiap perulangan terjadi maka nilai pada variabel i akan dikurangi 1
            for (int i = value.length() - 1; i >= 0; i--) {
                kataKosong = kataKosong + value.charAt(i); //dilakukan proses penulisan ulang huruf dari kata yang diinputkan dari huruf belakang ke depan
            }

            //dilakukan perkondisian jika kata pada variabel Value sama dengan variabel kataKosong maka mencetak true. begitu sebaliknya.
            if (value.equals(kataKosong)) {
                cekkata = true;
            }
            return cekkata; // mengembalikan result dari perkondisian
        }
        public static void main(String[] args)
        {
            System.out.println(cekPalindrome("civic"));
            System.out.println(cekPalindrome("katak"));
            System.out.println(cekPalindrome("kasur rusak"));
            System.out.println(cekPalindrome("kupu-kupu"));
            System.out.println(cekPalindrome("lion"));
        }


}

