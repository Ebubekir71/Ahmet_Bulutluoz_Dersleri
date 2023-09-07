package ders18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_Array_Olustur_Methodu {
    public static void main(String[] args) {
        /*
        Kullanicidan arrayin boyutunu ve elementlerini alip
        arrayi olusturan ve bize döndüren bir method olusturun
         */
        System.out.println(Arrays.toString(arrayOlusturMethodu()));
    }
    public static int[]arrayOlusturMethodu(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen arrayin uzunlugunu giriniz");
        int uzunluk= scan.nextInt();
        int[] arr= new int[uzunluk]; //[0,0,0,0,0...]
        for (int i=0; i<arr.length; i++){
            scan = new Scanner(System.in); //for loop ile her seferinde deger
                                            // alabilmesi icin var olan scanner
                                            //objesine yeniden deger atayalim
            System.out.println("Array icin element giriniz");
            arr[i]=scan.nextInt();
        }
        return arr;
    }
}
