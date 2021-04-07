package beratideal_xi.rpl.pkg4_03_anila.dwi.lestari;

import java.util.Scanner;

public class BeratIdeal_XIRPL4_03_AnilaDwiLestari {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String nama;
       int jk;
       String jk2;
       Float berat, tinggi;
       double tbi;
       
        System.out.println("|Menghitung Berat Badan Ideal Anda|");
        System.out.println("|---------------------------------|");
        
        System.out.print("Masukkan Nama Anda : ");
        nama = input.nextLine();
        System.out.println("");
        System.out.println("|Pilih Jenis Kelamin Anda!|");
        System.out.println("|---------------------------------|");
        System.out.println("|1. Laki-laki                     |");
        System.out.println("|2. Perempuan                     |");
        System.out.print("Masukkan Pilihan Anda : ");
        jk = input.nextInt();
        
        System.out.println("");
        
        System.out.println("|Mari Berhitung!|");
        System.out.println("|---------------------------------|");
        System.out.print("Masukkan Berat Badan Anda : ");
        berat = input.nextFloat();
        System.out.print("Masukkan Tinggi Badan Anda : ");
        tinggi = input.nextFloat();
        
        System.out.println("");
        
        System.out.println("Hasil Berat Ideal Anda");
        System.out.println("|---------------------------------|");
        
            if(jk==1){
                System.out.println("Laki-laki");
            }
            else if(jk==2){
                System.out.println("Perempuan");
            }
            else{
                System.out.println("Jenis Kelamin Tidak Ditemukan");
            }
            
            switch(jk){
                case 1:
                    jk2="Laki-laki";break;
                case 2:
                    jk2="Perempuan";break;
                default:
                    jk2="Jenis Kelamin Tidak Ditemukan";
            }
            
            switch(jk){
                case 1 : tbi=((tinggi-100)-(0.10*(tinggi-100)));break;
                case 2 : tbi=((tinggi-100)-(0.15*(tinggi-100)));break;
                default : tbi=0;
            }
            
            int hasil = (int)tbi;
            
            System.out.println("Nama Anda : "+""+ nama);
            System.out.println("Jenis Kelamin Anda : "+""+jk2);
            System.out.println("Berat Badan Ideal Anda Adalah : "+""+hasil+"kg");
    }
    
}
