package ders19_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C02_Arrays_Sirali_Yazdirma {
    public static void main(String[] args) {
        String[] harfler={"L", "a" , "P","d","T","t"};
        System.out.println(Arrays.toString(harfler));
        Arrays.sort(harfler);

        System.out.println(Arrays.toString(harfler));
        //Arrays.sort() arraydeki elemenleri natural order'a göre siralar
        //Array'lerde ve bundan sonra görecegimiz arrayListlerde method
        // kullanildiginda array/arrayList kalici olarak degisir
    }
}
