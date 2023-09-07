package ders18_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {
        int[] numaralar = {3, 6, 6, 25, 65};
        String[] isimler = {"Ahmet", "Süleyman", "Saziye", "Büsra"};
        String toplam;
        toplam = isimler[3]+" "+ numaralar[0];
        System.out.println(toplam);
        System.out.println(Arrays.toString(isimler));
//        String[]soyisim = new String[2];
//        System.out.println(Arrays.toString(soyisim));
        String[] soyisim={"Tosun","Tosun1"};
        System.out.println(Arrays.toString(soyisim));
        int[] arr = new int[3];
        System.out.println(arr.length);
        arr[2]=15;
        System.out.println(Arrays.toString(arr));
    }
}
