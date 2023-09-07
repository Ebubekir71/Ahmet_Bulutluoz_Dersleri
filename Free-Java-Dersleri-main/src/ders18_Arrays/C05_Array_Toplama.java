package ders18_Arrays;

import java.util.Arrays;

public class C05_Array_Toplama {
    public static void main(String[] args) {
        //Verilen bir arraydaki pozitif sayilari toplayin ve geri döndüren bir method yazdirin

        int[] arr={-4,5,2,0,3}; //beklenen output pozitif elementin toplami 10 dur.

        System.out.println(sayilariToplamaMethodu(arr));


    }
    public  static int sayilariToplamaMethodu(int[] arr){
        int toplam=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>0){
                toplam += arr[i];
            }
        }
        return toplam;
    }
}
