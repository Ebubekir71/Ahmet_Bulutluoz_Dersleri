package ders17_Scope;

public class C03_ClassLevelVariablelar {
    static boolean bls;
    boolean bli;
    static String strs="Java";
    String stri;
    static int sayis;
    int sayii =23;
    static char chrs='a';
    char chri;
    public static void main(String[] args) {
        System.out.println(bls);        // false
        System.out.println(strs);       // java
        System.out.println(sayis);      // 0
        System.out.println(chrs);       // a

        C03_ClassLevelVariablelar obje = new C03_ClassLevelVariablelar();
        System.out.println(obje.bli);       // false
        System.out.println(obje.stri);      // null
        System.out.println(obje.sayii);     // 23
        System.out.println(obje.chri);      // ''
    }
    /*
    Class level kurallar
    1- class level variable'lara deger atanmasa da hem olusturulabilir ,
    hemde kullanilabilir. Deger atamasi yapmadiysak, java onlara default
    olan degerleri atar
    boolean ==> false
    sayisal variable'lar ==>0
    non-primitive variable'lar icin ==>null
    char ==> '' char olarak hiclik

    2- Instance variabla'lar static methodlar icinden direk ulasilamaz
    Eger static method icinde instance method kullanmamiz gerekirse
    o class dan bir obje olusturup o obje üzerinden instance
    variabla'lara ulasilabilir

    3-Baska class'daki class level variable'lara ulasmak istersek
        static variable'lar icin classIsmi.staticVariableIsmi yazarak
        ulasabiliriz
        instance variable'lara ulasmak icin ise
        variable'larin oldugu class dan obje olusturmaliyiz

        Eger static bir variable'a obje üzerinden ulasmak isterseniz
        java otomatik olarak getirmez ama elle yazarsaniz kabullenir.
        Intelij static variable'a instance gibi obje üzerinden ulasirsaniz
        kodu sariya boyayarak sizi uyarir.
     */
}
