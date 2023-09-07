package ders16_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C05_Us_Hesaplama {
    public static void main(String[] args) {
        /* Kullanicidan bir sayi ve hesaplamak istedigi üssünü istein.
           While loop kullanarak verilen sayinin istenen üssünü
           hesaplayip yazdiran bir method olusturun
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üssünü hesaplayacaginiz pozitif bir sayi giriniz");
        double sayi = scan.nextDouble();

        System.out.println("Lütfen hesaplanacak pozitif bir tam sayi girin");
        int us = scan.nextInt();
        usHesapla(sayi,us);

    }
    public static void usHesapla(double sayi, int us){
        double sonuc = 1;

        while(us>0){
            sonuc= sonuc*sayi;  // bu sonuc*=sayi; olarak yazilabiliyor
            us--;
        }
        System.out.println(sonuc);
    }
}
