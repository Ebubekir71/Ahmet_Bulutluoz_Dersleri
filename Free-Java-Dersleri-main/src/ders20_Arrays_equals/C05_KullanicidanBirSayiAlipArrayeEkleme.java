package ders20_Arrays_equals;

import java.util.Arrays;
import java.util.Scanner;

public class C05_KullanicidanBirSayiAlipArrayeEkleme {
    public static void main(String[] args) {
        int[] arr= {3,5,8};
        //Kullanicidan bir sayi alip arr ye 4. element olarak ekleyiniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen arraye eklenecek sayiyi giriniz");
        int eklenecekSayi = scan.nextInt();

        arr = C04_ArrayeBirElemaniMethodlaEkleme.arrayeBirElemanEkle(arr, eklenecekSayi);
        System.out.println(Arrays.toString(arr));
    }
}
