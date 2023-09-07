package ders16_WhileLoop_DoWhileLoop;
public class C07_Do_While_Loop {
    public static void main(String[] args) {
        /*

         */

        int bas = 10;
        int bit = 20;
        int toplam = 0;
        // while loop ile baslangic degeri ile bitis degeri arasindaki
        //sayilari toplayip yazdirin (sinirlar dahil)

        while (bas<=bit){
            toplam = toplam + bas;
            bas++;

        }
        System.out.println("While loop ile aradaki sayilarin toplami = "+ toplam);

        // simdi de do while loop ile yapalim

        bas =10;
        bit =20;
        toplam = 0;
        do {
            toplam += bas;
            bas++;
        }while (bas <= bit);
        System.out.println("do while loop ile aradaki sayilarin toplami = " + toplam);
    }
}
