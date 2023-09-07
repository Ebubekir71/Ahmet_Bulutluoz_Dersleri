package ders18_Arrays;

import java.util.Arrays;

public class C04_Array_Sayi_Arttirma {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 56,15 , 23};
        arr=arrayElementleriniIkiArttir(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayElementleriniIkiArttir(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //arr[i]=arr[i]+2;
            arr[i] +=2;
        }
        return arr;
    }
}