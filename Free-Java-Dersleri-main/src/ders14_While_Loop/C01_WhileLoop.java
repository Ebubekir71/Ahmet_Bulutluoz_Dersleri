package ders14_While_Loop;

import ders13_Method_Class_Baglam.C04_MethodOverloading;

public class C01_WhileLoop {
    public static void main(String[] args) {
        // Bir den 100 e kadar olan sayilari for loop ile hesaplayin

        int toplam = 0 ;
        for (int i = 0; i <=100 ; i++) {
            toplam = toplam +i;
        }
        System.out.println("for loop ile toplam = " + toplam);

        toplam =0;
        int i =1;
        while (i<=100){
            toplam = toplam+i;
            i++;
        }
        System.out.println("while loop ile toplam = " + toplam);
    }
}
