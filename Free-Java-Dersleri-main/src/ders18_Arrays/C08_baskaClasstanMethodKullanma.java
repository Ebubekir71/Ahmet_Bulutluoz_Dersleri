package ders18_Arrays;

import ders16_WhileLoop_DoWhileLoop.C02_GirilenSayilariToplama;

import java.util.Arrays;

public class C08_baskaClasstanMethodKullanma {
    public static void main(String[] args) {
        int[] arr ={2,4,6,8};
        System.out.println("Eski array : " + Arrays.toString(arr));
        arr=C03_Arrayin_Elemanlarini_Istenen_Kadar_Artirma.elementleriArttirMethodu(arr, 15);
        System.out.println("Yeni array : "+ Arrays.toString(arr));
        C03_Arrayin_Elemanlarini_Istenen_Kadar_Artirma.elemenleriArtirma(arr, 2);
        int[] kullaniciArrayi =C07_Array_Olustur_Methodu.arrayOlusturMethodu();
        System.out.println(Arrays.toString(kullaniciArrayi));
    }
}
