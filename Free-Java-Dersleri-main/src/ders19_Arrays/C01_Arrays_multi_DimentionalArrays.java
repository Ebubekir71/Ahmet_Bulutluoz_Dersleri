package ders19_Arrays;

public class C01_Arrays_multi_DimentionalArrays {
    public static void main(String[] args) {
        String[] isimler = {"Ayse", "Yusuf","Bugra", "Abdullah", "Nergiz","Gülay", "Ramazan"};
        //verilen bir arraydeki uzunlugu tek sayi olan isimleri
        //yan yana aralarinda bir bosluk birakarak yazdirin
        //en sonda alt satira gecerek toplam kac isim yazdirilacagini yazdirin.
        int kalan=0;
        int sayac =0;

        for (int i=0; i<isimler.length; i++){

            kalan=isimler[i].length()%2;
            if (kalan==1){
                System.out.print(isimler[i]+" ");
                sayac++;
            }
        }

        System.out.println("\nToplamda yazdirilan ismi tek sayi olan isimlerin sayisi = "+ sayac);
    }
}
