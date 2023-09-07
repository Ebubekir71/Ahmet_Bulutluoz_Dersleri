package ders15_While_Deneme;

import java.util.Scanner;

public class C02_WhileLoop_Deneme2 {
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
        boolean sonuc = false;
        while (!sonuc){
            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen sifrenizi giriniz");
            String sifre = scan.nextLine();
            sonuc = sifreKontrolümüz(sifre);
        }
        System.out.println("Sifreniz basariyla kaydedildi");
    }
    public static boolean sifreKontrolümüz(String sifre){
        int sayac =0;
        //- ilk harf kücük harf olmali
        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf>'a'&&ilkHarf<'z')){
            System.out.println("Lüften ilk harfi kücük giriniz");
            sayac++;
        }
        //- son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length()-1);
        if (!(sonKarakter>'0'&& sonKarakter<'0')){
            System.out.println("Son karakter rakam olmali");
            sayac++;
        }
        //- sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("Sifre Bosluk iceremez");
            sayac++;
        }
        //- uzunluguen az 10 karakter olmali
        if (sifre.length()<10){
            System.out.println("Sifre uzunlugu en az 10 karakter olmalidir");
            sayac++;
        }
        if (sayac==0){
            return true;
        }else{
            return false;
        }
    }
}
