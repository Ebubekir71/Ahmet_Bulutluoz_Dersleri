package ders20_Arrays_equals;

import java.util.Arrays;

public class C01_Equals {
    public static void main(String[] args) {
        String str ="Java candir, Selenium heyecan";
        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));     //[Java, candir,, Selenium, heyecan]
        //aralardaki bosluklar arrayin kendi özelliginden

        String[] yeniArr=str.split(", ");
        System.out.println(Arrays.toString(yeniArr));   //[Java candir, Selenium heyecan]
        //aralardaki bosluklar array den geliyor . Bu özellikler ayirma yapiyor.

        String[] karakterler= str.split("");
        System.out.println(Arrays.toString(karakterler));   //[J, a, v, a,  , c, a, n, d, i, r, ,,  , S, e, l, e, n, i, u, m,  , h, e, y, e, c, a, n]
        //hiclik koydugumuzda her harfe göre ayirla yapiyor

    }
}
