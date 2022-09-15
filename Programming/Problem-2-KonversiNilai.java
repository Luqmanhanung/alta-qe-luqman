class KonversiNilai {
    public static void main(String[] args) {
        int studentScore = 65;

        //dilakukan perkondisian dengan beberapa kondisi
        if (studentScore >= 80 && studentScore <= 100){                            // --> jika nilai antara 80-100
            System.out.println("Nilai Anda A");                                    // --> maka cetak kalimat ini
        }else if (studentScore >=65 && studentScore <= 79 ) {                      // --> jika nilai antara 65-100
            System.out.println("Nilai Anda B+");                                   // --> maka cetak kalimat ini
        }else if (studentScore >=50 && studentScore <= 64 ) {                      // --> jika nilai antara 50-64
            System.out.println("Nilai Anda B");                                    // --> maka cetak kalimat ini
        }else if (studentScore >=35 && studentScore <= 49) {                       // --> jika nilai antara 35-49
            System.out.println("Nilai Anda C");                                    // --> maka cetak kalimat ini
        }else if (studentScore < 34) {                                             // --> jika nilai antara 0-34
            System.out.println("Nilai Anda D");                                    // --> maka cetak kalimat ini
        }else{                                                                     // --> jika nilai yang diinputan tidak diantara 0-100
            System.out.println("Maaf Inputan Nilai Anda Invalid");                 // --> maka cetak kalimat ini
        }
    }
}
