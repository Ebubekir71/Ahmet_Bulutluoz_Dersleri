package ders16_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C04_Rakamlar_Topplamini_Bulma {
    public static void main(String[] args) {
        /*   While loop kullanarak kullanicidan
             alinan sayinin rakamlar toplamini bulun     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen rakamlar toplamini bulmak istediginiz sayiyi giriniz");
        int girilenSayi= scan.nextInt();

        int sayi = girilenSayi;
        int birlerBasamagi = 0 ;
        int rakamlarToplami = 0 ;
        while(sayi>0){
            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;
        }
        System.out.println("girilen " +girilenSayi+ "'nin rakamlar toplami : "+ rakamlarToplami);
    }
}
