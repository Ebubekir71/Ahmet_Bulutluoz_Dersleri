package ders13_Method_Class_Baglam;

public class C04_MethodOverloading {
    public static void main(String[] args) {
        /*
        method overloading olan bir class da hangi methodung calisacagina karar vermek icin
        asagidaki siralamaya göre method'lar incelenir
        1-isim
        2-parametre sayisi                      argüment   s
        3-argument - parametre uyumu            parametre  int sayi
        4- minimum casting
         */
        toplama('s'); //tek int girilirse 2 kati yazilir
        toplama(3,4); // iki int toplami :7
        toplama('a','b'); //iki int toplami : 195
        toplama(5,6,5.3); //3 double nin toplami 16.3
    }
    public static void toplama(int sayi1 , int sayi2){
        System.out.println("Iki int 'in toplami :" + (sayi1+sayi2));
    }
    public static void toplama(double sayi1 , double sayi2){
        System.out.println("double ve double'in toplami : " + (sayi1 + sayi2));
    }
    public static void toplama(double b, int a){
        System.out.println("double ve int'in toplami : " + (a+b));
    }
    public static void toplama(int sayi){
        System.out.println("tek int girilirse 2 kati yazilir " + 2*sayi);
    }
    public static void toplama(double a, double b, double c){
        System.out.println("3 double'nin toplami : "+ (a+b+c));
    }
}
