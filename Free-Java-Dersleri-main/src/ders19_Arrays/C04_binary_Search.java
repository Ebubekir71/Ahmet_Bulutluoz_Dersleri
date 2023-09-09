package ders19_Arrays;

import java.util.Arrays;

public class C04_binary_Search {
    public static void main(String[] args) {
        /*Binary yapisi cok büyük datalari kolayca depolayabilmek icin javanin kullandigi
        yöntemdir
        Binary mantigi aranan sayinin kolayca bulunmasina dayanir
        Binary search ün saglikli islemesi icin öncelikle arrayi kücükten büyüge siralamalisiniz
        Siralama yapmadan binary search kullanilirsa sonuc icin hic bir sey diyemeyiz
        dogruda olabilir ama yanlista olabilir  */
        int[] arr = {0,13,4,7,10,2,1,23};
        System.out.println(Arrays.binarySearch(arr,13));
        System.out.println(Arrays.binarySearch(arr, 7));
        System.out.println(Arrays.binarySearch(arr,10));
        System.out.println(Arrays.binarySearch(arr,4));
        /* Eger siralamasi bozuk olan bir arrayden bir rakam vs ariyorsak bunu önce
        Arrays.sort diyoruz önce sonra cikti istiyoruz o zaman hangi yerde oldugunu bize söylüyor.
        Eger index olarak -eksi  dönerse bu element yok demektir. eksiden sonra olsaydi yerini
         söylerdim diyor ama yok eksi olursa yok demek */
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,13));
        System.out.println(Arrays.binarySearch(arr, 7));
        System.out.println(Arrays.binarySearch(arr,10));
        System.out.println(Arrays.binarySearch(arr,4));
        //olmayan elementi arama
        System.out.println(Arrays.binarySearch(arr,-5));    //-1
        System.out.println(Arrays.binarySearch(arr, 5));    //-5
        System.out.println(Arrays.binarySearch(arr,25));    //-9
        System.out.println(Arrays.binarySearch(arr,44));    //-9


    }
}
