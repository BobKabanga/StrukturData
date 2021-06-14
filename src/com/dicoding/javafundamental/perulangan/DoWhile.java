package com.dicoding.javafundamental.perulangan;

public class DoWhile {
    public static void main(String[] args) {
        int value =1;
        do{
            System.out.println("Angka : " +value);
            value++;
        } while (value <= 10);
    }
}
//Perulangan yang mempunyai fungsi yang sama dengan While,
// tetapi pengecekan kondisinya dilakukan di akhir.
// Pada perulangan ini minimal melaksanakan perintah sekali,
// kemudian mengecek kondisi.