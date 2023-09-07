package ders13_Method_Class_Baglam;

import java.util.Scanner;

public class C01_Tam_Bolenlerini_Bulma {
    public static void main(String[] args) {
        //Kullanicidan main method icinde bir tamsayi alin.
        // Girilen sayinin pozitf tam bölenleri sayisini bulup
        // bize dönduren bir method olusturun

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println(tamBolenleri(sayi));

    }
    public static int tamBolenleri(int sayi){
        for (int i=1; i<sayi; i++){
            if (sayi<1){
                System.out.println("Girilen sayi 1 den kücük" +
                        " lütfen 1 den büyük bir sayi giriniz");
            }else if (sayi%i==0){
                System.out.println(i);
            }
        }return sayi;
    }
}
