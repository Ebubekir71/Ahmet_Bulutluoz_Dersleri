package ders21_Multidimensional_Arrays;

import java.time.LocalDateTime;
import java.util.Arrays;

public class C01_Multudimensional_Arrays {
    public static void main(String[] args) {
//        int[][] arr={{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
//        System.out.println(Arrays.deepToString(arr));
//        System.out.println(Arrays.toString(arr[2]));
//        int toplam=0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                toplam=toplam+arr[i][j];
//            }
//        }
//        System.out.println(toplam);
        int toplam=0;
        int[][][] rakamlar={{{0,23},{1,65},{2,3},{3,2}},{{15,23},{12,15}}};
        System.out.println(Arrays.deepToString(rakamlar));
        for (int i = 0; i < rakamlar.length; i++) {
            for (int j = 0; j < rakamlar[i].length; j++) {
                for (int k = 0; k < rakamlar[i][j].length; k++) {
                    toplam += rakamlar[i][j][k];
                }
            }
        }
        System.out.println(toplam);
        int ikiliToplam= rakamlar[1][1][0]+ rakamlar[0][1][0];
        System.out.println(ikiliToplam);
        System.out.println(rakamlar[0][0][0]+rakamlar[0][0][1]);
        int[] bolum = new int[2];
        bolum[0]= rakamlar[0][0][0];
        bolum[1]= rakamlar[0][0][1];
        System.out.println(Arrays.toString(bolum));



    }
}
