package ders21_Multidimensional_Arrays;

import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {
        int[] numberList ={1,2,4,5,1,23,21,55,92,15};
        Arrays.sort(numberList);
        System.out.println(Arrays.toString(numberList));
        System.out.println(Arrays.binarySearch(numberList, 15));
        int[][] numberList2 = {{1,2,3,3},{15,25,35,65,25,23}};
        Arrays.sort(numberList2[1]);
        System.out.println(Arrays.deepToString(numberList2));
        System.out.println(Arrays.binarySearch(numberList2[1], 15));
    }
}
