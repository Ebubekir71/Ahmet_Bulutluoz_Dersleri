package ders15_While_Deneme;

import java.util.Scanner;

public class C03_Deneme {
    public static void main(String[] args) {
        boolean sonuc = false;
        Scanner scan;
        String sifre;
        while (sonuc == false){
            scan = new Scanner(System.in);
            System.out.println("Lütfen sifrenizi giriniz");
            sifre = scan.nextLine();
            sonuc = sifreKontrol(sifre);
        }
        System.out.println("Sifreniz basariyla kaydedildi");
    }
    public static boolean sifreKontrol (String sifre){
        int sayac = 0;
        //- ilk harf kücük harf olmali
        char ilkHarf = sifre.charAt(0);
        if (!(ilkHarf>'a'&& ilkHarf<'z')){
            System.out.println("Ilk harfi kücük harf giriniz");
            sayac++;
        }
        //- son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length()-1);
        if (!(sonKarakter-1>'1' && sonKarakter<'9')){
            System.out.println("Lütfen son karakteri rakam giriniz");
            sayac++;
        }
        //- sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            sayac++;
        }
        //- uzunluguen az 10 karakter olmali
        if (sifre.length()<10){
            System.out.println("Sifre 10 karakter uzunlugunda olmali");
            sayac++;
        }
        if (sayac==0){
            return true;
        }else{
            return false;
        }
    }
}
