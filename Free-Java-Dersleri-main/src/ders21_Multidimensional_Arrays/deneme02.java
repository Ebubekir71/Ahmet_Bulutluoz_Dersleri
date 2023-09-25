package ders21_Multidimensional_Arrays;

import java.util.Arrays;

public class deneme02 {
    public static void main(String[] args) {
        int arr[]={2,11,0,23,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,11));
    }
}
