package tugas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class strukturdata {
    public static void main(String[] args) {
    //1. array 1D dengan 8 tipe data 
        int aa[] = {17,18,19, 20};
        double bb[] = {1.0, 1.3, 18.9};
        byte cc[] = {1, 2, 3, 4 };
        long dd[] = {123, 456,78,90 };
        char ee[]= {'p', 'u', 'p', 'u', 't'};
        float ff[] = {3.3f, 1.2f, 4.5f};
        boolean gg[] = {false, true};
        short hh[] = {50, 20,10};
         
    //5 cara mencetak array
       //menggunakan arrays.toString
        System.out.println("=======NO 2======");
        char PP[]= {'p', 'u', 'p', 'u', 't'};
        System.out.print("arrays.toString :");
        System.out.println(Arrays.toString(PP));
        
        //menggunakan for each
        System.out.print("for each : ");
        for ( char i : PP ){
        System.out.print(i);   
        }
        System.out.println("");
        
        //menggunakan for
        System.out.print("for : ");
        for (int i = 0; i <PP.length; i++) {
            System.out.print( PP[i]);
        }
        System.out.println("");
        
        //menggunakan while
          System.out.print("while : ");
          int p =0;
          while ( p < PP.length){
              System.out.print(PP[p] + "");
          p++;
          }
          System.out.println("");
          
        //menggunakan Indeks
          System.out.println("indeks : ");
          System.out.println(PP[1]);
          System.out.println(PP[0]);
          
    //3. buat array 2 dimensi dan iput isi array menggunkan keyboard dan cetak 
        System.out.println("=====NO 3=====);
        Scanner pu = new Scanner (System.in);
        String[][] pt = new String[2][2];
        System.out.println("MASUKKAN NAMA : ");
        for (int i = 0; i < pt.length; i++) {
            for (int j = 0; j < pt[i].length; j++) {
                pt[i][j] = pu.nextLine();
            }  
        }
        System.out.println(Arrays.deepToString(pt));
        pu.close(); 
        
    //4. arraay list tipe data wrapper
        System.out.println("=====nomor 4=====");
        ArrayList <String> py = new ArrayList<>();
        py.add("puput");
        py.add("yunita");
        py.add("mie ayam");
        py.add("bakso");
        System.out.println(py);
        
    //5. ArratList bertipe data integer
        System.out.println("=====5=====");
        ArrayList <Integer> pa = new ArrayList<>();
        pa.add(17);
        pa.add(07);
        pa.add(70);
        pa.add(05);
        pa.add(19);
        System.out.println("Isi dari ArrayList :" + pa);
        System.out.println(" ArrayList Indeks ke 4 :" + pa.get(4));                
        pa.set(4, 20);
        System.out.println("Hasil ArrayList indeks ke 4 di ganti :" + pa);
        pa.remove(2);
        System.out.println("Setelah Arraylist indeks ke 2 di remove :" + pa);
        System.out.println("Ukuran ArrayList :" +  pa.size());;
             }
              
      }
    
    
