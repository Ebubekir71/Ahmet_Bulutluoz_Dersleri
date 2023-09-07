package ders18_Arrays;

public class C06_Element_Say {
    public static void main(String[] args) {
        //Verilen bir arrayde istenen bir elemanin var
        // olup olmadigini ve varsa kac kere kullanildigini
        // yazdiran bir method olusturun
        int[] arr = {3,5,2,3,5,6,7,1,8};
        int arananSayi=9;

        elemanSay(arr, arananSayi);
    }
    public static void elemanSay(int[]arr, int arananSayi){
        int sayac=0;
        for (int i=0; i< arr.length; i++){
            if (arr[i]==arananSayi){
                sayac++;
            }
        }
        if (sayac==0){
            System.out.println("Aranan sayi bulunamadi");
        }else {
            System.out.println("Aranan sayi " + sayac + " adettir.");
        }
    }
}
