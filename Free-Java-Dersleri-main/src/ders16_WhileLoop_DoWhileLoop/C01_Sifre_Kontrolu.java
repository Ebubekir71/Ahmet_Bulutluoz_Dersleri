package ders16_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C01_Sifre_Kontrolu {
    public static void main(String[] args) {
         /* Main methodda kullanicidan bir sifre isteyip,
         olusturacagimiz bir methodda asagidaki sartlari kontrol edip
          ve methoddan true ve false döndürün
            ve kullaniciya düzeltmesi gereken tüm eksikleri söyleyinn,
            eger tüm sartlari saglanincaya kadar tekrar tekrar deger isteyin
            ve sartlar saglaninca, "sifre basariyla kaydedildi" yazdirin
            - ilk harf kücük harf olmali
            - son karakter rakam olmali
            - sifre bosluk icermemeli
            - uzunluguen az 10 karakter olmali
         */
        /*
        1- Bu soruyu ders 14 de cözdük ama javada daha profesyonel
        kodlama icin iki düzeltme yapacagiz

        While loop un önündeki parantezin ici true oldugu müddetce
        loop calismali

        Bu soruda sonuc variable'i da boolen deger iceriyor ama
         sorunun mantigi acisindan sonuc false oldugu müddetce loop calismali

         2-while loop her calistiginda
         Scanner scan = new Scanner(System.in);
         calisiyor ve yeni bir scanner objesi olusturuyor.

         bunun yerine daha güzel olani loop tan önce objeyi olusturup
         loopun icerisine sadece deger atamasi yapmaktir.
         */

        boolean sonuc = false;
        Scanner scan;
        String sifre;
        while(!sonuc){          //Burayi sonuc == false yapmistik ama daha
             scan= new Scanner(System.in);      // professionellik acisindan
            System.out.println("Lütfen sifrenizi giriniz");//   !sonuc yapmamiz gerekiyor
            sifre = scan.nextLine();
            sonuc = sifreKontrolEtMethodu(sifre);
        }
        System.out.println("Sifreniz basariyla kaydedildi");


        //System.out.println(sifreKontrolEtMethodu(sifre)); //true veya false
    }
    public static boolean sifreKontrolEtMethodu(String sifre){
        int sayac = 0; // sayac hatalari saysin

//        - ilk harf kücük harf olmali
        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf>='a' && ilkHarf<='z')){
            System.out.println("Ilk harf kücük harf olmali");
            sayac++;
        }
//        - son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length()-1);
        if (!(sonKarakter>= '0' && sonKarakter<='9')){
            System.out.println("Son karakter rakam olmali");
            sayac++;
        }
//        - sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            sayac++;
        }
//        - uzunluguen az 10 karakter olmali
        if (sifre.length()<10){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmalidir");
            sayac++;
        }
        if (sayac==0){
            return true;
        }else {
            return false;
        }
    }

}
