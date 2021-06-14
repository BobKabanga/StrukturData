package com.dicoding.javafundamental.percabangan;
import java.util.Scanner;
public class ifThenElsifThenElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan Nilai Anda");
        int nilaiUjian = scan.nextInt();
        char indexPrestasi;

        if (nilaiUjian >= 90) {
            indexPrestasi = 'A';
        } else if (nilaiUjian >=80){
                indexPrestasi = 'B';
        } else if (nilaiUjian >=70){
            indexPrestasi = 'C';
        } else if(nilaiUjian >=70){
            indexPrestasi = 'D';
        } else if (nilaiUjian >=50){
            indexPrestasi = 'E';
        } else  {
            indexPrestasi = 'F';
        }
        System.out.println("Nilai Ujian Anda adalah = " + indexPrestasi);
    }
}
