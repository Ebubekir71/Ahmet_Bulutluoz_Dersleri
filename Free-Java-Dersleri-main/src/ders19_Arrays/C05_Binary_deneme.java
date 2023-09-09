package ders19_Arrays;

import java.util.Arrays;

public class C05_Binary_deneme {
    public static void main(String[] args) {
        int[] serial= {152,25,36,52,251,21,35,85,35};
        Arrays.sort(serial);
        System.out.println(Arrays.toString(serial));
        System.out.println(Arrays.binarySearch(serial,25));
    }
}
