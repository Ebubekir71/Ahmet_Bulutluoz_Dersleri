package ders16_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C08_Toplam_Deneme {
    public static void main(String[] args) {
        //Kullanicidan toplamak üzere sayilar alin
        //girilen sayilarin toplami 500'ü gecerse
        //bu kadar yeter girilen sayilarin toplami ... oldu yazdirin
        //girilen sayi adedi 10 veya daha yüksek olursa
        //10'dan fazla sayi giremezsin, girilen sayilarin toplami ... oldu yazdirin
        //ve islemi bitirin
        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        int toplam =0;
        while(toplam<500 && sayac<=10){
            System.out.println("Lütfen toplamak üzere sayilarinizi girin" );
            int sayi = scan.nextInt();
            toplam= toplam + sayi;
            sayac++;
            System.out.println("Su ana kadar girilen sayilarin toplami = " + toplam);
        }
        if (toplam > 500 ){
            System.out.println("Bu kadar yeter girilen sayilarin toplami = " + toplam);
        }
        if (sayac>=10){
            System.out.println("10'dan fazla sayi giremezsin. Girilen sayilarin toplami = "+ toplam);
        }
    }
}
