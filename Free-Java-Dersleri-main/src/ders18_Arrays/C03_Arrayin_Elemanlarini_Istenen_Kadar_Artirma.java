package ders18_Arrays;

import java.util.Arrays;

public class C03_Arrayin_Elemanlarini_Istenen_Kadar_Artirma {
    public static void main(String[] args) {
        // verilen arrayin tüm elementlerini
        //artis miktari kadar artirin
        int[] arr ={3, 53, 65};
        int artis = 0;

        for (int i=0; i<arr.length; i++){//i indexteki arrayleri geziyor
            arr[i] += artis;
        }
        System.out.println(Arrays.toString(arr));
        int[] sayilar={15,25,35};
        System.out.println(Arrays.toString(elementleriArttirMethodu(sayilar,5)));
        System.out.println(Arrays.toString(elemenleriArtirma(arr, 25)));
    }
    public static int[] elementleriArttirMethodu(int[] arr, int artis){
        for (int i = 0; i<arr.length; i++){
            arr[i]+=artis;
        }
        return arr;
    }
    public static int[] elemenleriArtirma(int[] arr, int artis){
        for (int i=0; i<arr.length; i++){
            arr[i]= arr[i] + artis;
        }
        return arr;
    }
}
