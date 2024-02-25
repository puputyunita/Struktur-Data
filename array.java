1. array satu dimensi bertipe data primitif
   
     public static void main(String[] args) {
   

        int bulan[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            bulan [1] = 29;
            
        System.out.println(Arrays.toString(bulan));
        
    }
}
--------------------------------------------------------------
2. array 1 dimensi bertipe data non primitif
   
    public static void main(String[] args) {
   
        String buah[] = {"anggur", "apel", "jeruk", "berry", "pisang", "semangka"};
        
        for (int i = 0; i < buah.length; i++) {
            
            System.out.println("buah ke-" + i + " : " + buah[i]);
        }
        
        System.out.println("buah ke 3 adalah : " + buah[3]);
    }
}
-----------------------------------------------------------------------
3. array 2 dimensi betipe data primitif
   
    public static void main(String[] args) {
   
        int[][] angka = {
            {80, 78, 90,},
            {68, 78, 89,},
            {80, 70, 60,},};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(angka[i][j] + " ");
            }
             System.out.println();
        }
    }
}
-------------------------------------------------------------------------
4. kode untuk mencetak array
   
    // Cetak Array menggunakan Array perpustakaan standar 
   
       System.out.println(array.toStriong(array));
   
    //Cetak Array menggunakan loop For 
   
       for (int element: array) {
            System.out.println(element);/*
       
   //Cetak Array Multidimensi 
   
       System.out.println(Arrays.deepToString(array));
