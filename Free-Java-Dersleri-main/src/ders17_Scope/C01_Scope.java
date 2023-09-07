package ders17_Scope;

public class C01_Scope {
    static int classLevelStatic =12 ;
    String strClassLevelStaticOlmayan = "Java Güzeldir";

    public static void main(String[] args) {
        int sayiMain=20;
        for (int i = 0; i < 10; i++) {
            int sayiForLoop=5;
        }
    }
    public static void staticMethod(){
        String strStaticMethod = "Java Candir";
    }

    public void staticOlmayanMethod(){
        boolean blStaticOlmayanMethod = true;
    }
    /*
    Scope temelde ikiye ayrilir
        1-Local variable'lar
            A-Scope'lari icerinde olusturulduklari kod blogudur.
             Bir methodda olusturulan variable, baska method'dan kullanilmaz.
            B- Loop scope'lari
              Bir loop icerisinde olusturulan variable sadece o loop
              icerisinde kullanilabilir. Olusturuldugu methodda loop'un
              disinda kullanilamaz
            Not: local variable ler deger verilmeden olusturulabilir ama
            deger atanmadan KULLANILAMAZ
         2-Class Level Variable'ler
           Class level variableler methodlarin ve kod bloklarinin
           disinda olusturulur ve scope'lari TÜM CLASS'dir

           Class Level Variablelerin scope'u tüm class olsada
           static keyword'de variable'lerin kullanimina etki eder.

           Hastane ismi , hastane adresi, bashekim adi gibi variable'lar
           herkes icin ortak olmalidir. Bu tür variable'lar static olarak isaretlenir.

           personel ismi, personel adresi, personel telefonu gibi variable'lar
           ise tüm personel icin tanimli olmakla birlikte,
           bu variable'lardaki degisim herkesi etkilemez sadece o personeli etkiler.
           Bu tür variable'lar ise static yapmayiz.
           static olmayan class level'daki variable'lara INSTANCE VARIABLE' lar denir.

           C- class level static variable'lar
           bu variable'lar static klübüne üye olduklari icin her yere gidebilir
            her method'dan kullanilabilirler

           D- class level instance variable'lar
           variable static olmayinca üstünlügü olmaz bu durumda secici olan method olur

           static method lar instance variablelerin girisine izin vermez ama static
           olmayan methodlar, static olmayan (instance) variableleri kabul eder
     */
}
