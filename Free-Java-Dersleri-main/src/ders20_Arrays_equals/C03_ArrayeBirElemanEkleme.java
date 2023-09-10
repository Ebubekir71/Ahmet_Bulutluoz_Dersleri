package ders20_Arrays_equals;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C03_ArrayeBirElemanEkleme {
    public static void main(String[] args) {
        //Verilen bir array'in uzunlugunu 1 arttirarak
        //Verilen bir elementi ekleyin

        int[] arr = {3,7,8};
        int eklenecekSayi =10;
        //1- önce uzunlugu eski arrayden bir fazla olan yeniarray olusturalim
        int[] yeniArr = new int[arr.length+1]; //[0,0,0,0]
        //2- arr deki var olan ayni indexlerle yeniarr ye kopyalayalim
        for (int i = 0; i<arr.length; i++){
            yeniArr[i]=arr[i];
        }   //[3,7,8,0]
        yeniArr[yeniArr.length-1]=eklenecekSayi;
        System.out.println(Arrays.toString(yeniArr));
        // eski arr ye yeni degeri atayalim
        arr=yeniArr;
        System.out.println(Arrays.toString(arr));
        //arr nin son hali

    }
}
