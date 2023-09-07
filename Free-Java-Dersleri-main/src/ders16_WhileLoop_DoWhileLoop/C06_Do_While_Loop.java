package ders16_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C06_Do_While_Loop {
    public static void main(String[] args) {
        //Kullanicidan toplanmak üzere pozitif sayilar isteyin
        //kullanici islemi bitirmek icin 0'a basmalidir
        //kullanici 0'a bastiginda kac pozitif sayi girdigini
        //ve toplamlarinin kac oldugunu yazdirin

        //once while loop ile yapalim
        /*Scanner scan ;
        int sayac = 0;
        int toplam =0;
        int girilenSayi= 9999;   //sifir yapmada herhangi bir sayi yaz

        while (girilenSayi!=0){
            scan= new Scanner(System.in);
            System.out.println("Lütfen toplanmak üzere bir tamsayi giriniz");
            girilenSayi = scan.nextInt();
            if (girilenSayi!=0){
                toplam += girilenSayi;
                sayac++;
            }
        }
        System.out.println("Girilen " + sayac+" adet sayinin toplami : "+ toplam);*/

        // do while ile yapalim

        Scanner scan;
        int sayac = 0;
        int toplam = 0;
        int girilenSayi;

        do {
            scan = new Scanner(System.in);
            System.out.println("Lütfen toplanmak üzere bir tamsayi giriniz");
            girilenSayi = scan.nextInt();

            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayac++;

            }
        }while (girilenSayi != 0) ;
            System.out.println("Girilen " + sayac + " adet sayinin toplami : " + toplam);
        }

}
