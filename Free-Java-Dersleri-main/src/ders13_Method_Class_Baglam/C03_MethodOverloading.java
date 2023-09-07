package ders13_Method_Class_Baglam;

public class C03_MethodOverloading {
    /*
    Biz bir method call yaptigimizda java öncelikle method ismini
    kontrol eder.
    Sonra argüment olarak verilen deger ile , parametreler olarak
     yazilan variable lerin data türlerini karsilastirir.
     ve uyumlu ise methodu calistirir
     argümentler ile parametreler uyumlu degil ise Compile Tile Error
     verir

     Java'da ayni data türüne ve parametre sayisina
      sayip birden fazla method olusturulamaz
     */
    public static void main(String[] args) {
        toplama(4,6); // iki int ' in toplami : 10
        toplama(15,15.5);
        toplama(45.55,65);
        toplama(4.3,2.4);

    }

    public static void toplama(int sayi1 , int sayi2){
        System.out.println("Iki int 'in toplami :" + (sayi1+sayi2));
    }
    public static void toplama(int a, double b){
        System.out.println("int ile double'nin toplami : " +(a+b));
    }
    public static void toplama(double b, int a){
        System.out.println("double ve int'in toplami : " + (a+b));
    }
    public static void toplama(double sayi1 , double sayi2){
        System.out.println("double ve double'in toplami : " + (sayi1 + sayi2));
    }
}
/*
method ismi + parametrelerin data türlerine method signature denir.
Java ayni class da signature si ayni olan 2 methoda izin vermez.

Bir class da ismi ayni fakat signaturesi farkli birden fazla method olusturulmasina
METHOD OVERLOADING denir.
 */
