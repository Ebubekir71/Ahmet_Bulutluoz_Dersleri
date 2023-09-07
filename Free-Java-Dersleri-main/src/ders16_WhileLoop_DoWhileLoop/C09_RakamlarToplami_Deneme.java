package ders16_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C09_RakamlarToplami_Deneme {
    public static void main(String[] args) {
        /*   While loop kullanarak kullanicidan
             alinan sayinin rakamlar toplamini bulun     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen rakamlar toplamini istediginiz sayiyi yaziniz");
        int girilenSayi = scan.nextInt();
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        while(girilenSayi>0){
            birlerBasamagi=girilenSayi%10;
            rakamlarToplami =rakamlarToplami + birlerBasamagi;
            girilenSayi= girilenSayi/10;
        }
        System.out.println(rakamlarToplami);
    }
}
