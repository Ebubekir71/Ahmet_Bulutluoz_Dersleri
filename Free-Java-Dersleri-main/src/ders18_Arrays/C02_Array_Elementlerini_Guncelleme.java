package ders18_Arrays;

import java.util.Arrays;

public class C02_Array_Elementlerini_Guncelleme {
    public static void main(String[] args) {

        int[] sayilar = new int[6];
        System.out.println(Arrays.toString(sayilar)); //[0, 0, 0, 0, 0, 0]
        sayilar[1]=25;
        System.out.println(Arrays.toString(sayilar)); //[0, 25, 0, 0, 0, 0]
        sayilar[1]=7;
        System.out.println(Arrays.toString(sayilar)); //[0, 7, 0, 0, 0, 0]
        //Index kullanmadan bir elemente atama yapmak mümkün degildir.

        //5. index'teki elementi 8 yapin
        sayilar[5]=8;
        System.out.println(Arrays.toString(sayilar));

        // 6. index'te yeni bir element ekleyelim
        //  sayilar[6]=20;
        System.out.println(Arrays.toString(sayilar));

        //ArrayIndexOutOfBoundsException
        //run dedikten sonra bu hata olustugu icin
        //buna Run Time Error denilir

        // Uzunlugu verilen bir array'a yeni bir element ekleyip
        //  uzunlugunu degitirmek isterseniz Run Time Error olusur

    }
}
