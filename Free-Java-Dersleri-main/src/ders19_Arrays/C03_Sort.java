package ders19_Arrays;

import java.util.Arrays;

public class C03_Sort {
    public static void main(String[] args) {
        String[] isimler = {"Ayse", "Yusuf","Bugra", "Abdullah", "Nergiz","Gülay", "Ramazan"};
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));
        // [Abdullah, Ayse, Bugra, Gülay, Nergiz, Ramazan, Yusuf]
        //      a       a       b   g       n       r       y  "a'larida kendi arasinda siralar
        //ve kücükler sona gider. kcükler büyüklere yer verir
        int[] sayilar = {4, 78,4,2,98,3,7,1};
        Arrays.sort(sayilar, 3,6);
        System.out.println(Arrays.toString(sayilar));
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));


    }
}
