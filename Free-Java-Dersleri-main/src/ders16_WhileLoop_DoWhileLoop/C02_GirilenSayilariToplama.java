package ders16_WhileLoop_DoWhileLoop;

import java.util.Scanner;

public class C02_GirilenSayilariToplama {
    public static void main(String[] args) {
        //Kullanicidan toplamak üzere sayilar alin
        //girilen sayilarin toplami 500'ü gecerse
        //bu kadar yeter girilen sayilarin toplami ... oldu yazdirin
        //girilen sayi adedi 10 veya daha yüksek olursa
        //10'dan fazla sayi giremezsin, girilen sayilarin toplami ... oldu yazdirin
        //ve islemi bitirin
        Scanner scan;
        int sayac = 0;
        int toplam = 0;
        int sayi;

        while (toplam < 500 && sayac <= 10) {
            scan = new Scanner(System.in);
            System.out.println("Lütfen toplamak üzere sayilar girin");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++;
        }
        if (sayac >= 10) {
            System.out.println("10'dan fazla sayi giremezsin, sayilarin toplami " + toplam + " oldu");
        }
        if (toplam > 500) {
            System.out.println("Bu kadar yeter. Girilen sayilarin toplami " + toplam + " dir.");
        }
    }
}
