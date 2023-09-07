package ders18_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {


        int[] sayilar ={2,4,6,8,10,12,14,16,18,20};
        String[] harfler={"a","f","c","e"};

        System.out.println(sayilar[0]);
        System.out.println(harfler[3]);

        String[] ogrencilar={
                "Ebubekir",
                "Süleyman",
                "Yunus",
                "Oguzhan",
                " Mehmet",
                "Serhat",
                "Mümin"};
        System.out.println(ogrencilar[0]);
        /*
            Bir array olusturulurken 2 sey mutlaka belirtilmelidir
            1- icine konulacak datalarin türü
            2- Array'in (Bir array'e olusturulurken yazilan uzunlugundan
                            daha fazla element konuslamaz)
         */
        //Bir arrayin tümünü nasil yazdirabiliriz ?
        System.out.println(sayilar);
        for (int i=0; i<sayilar.length; i++){
            System.out.println(sayilar[i] + " ");
        }
        System.out.println("");
        //Array'in tamamini yazdirmak isterseniz
        //Arrays classindan hazir method kullaniriz
        System.out.println(Arrays.toString(sayilar));

        //for loop ile elementleri yazdiririz
        //Arrays.toString()

        int[] notlar= new int[5];
        System.out.println(Arrays.toString(notlar)); //[0, 0, 0, 0, 0]

        String[] isimler = new String[5];
        System.out.println(Arrays.toString(isimler)); //[null, null, null, null, null]

        boolean[] blList= new boolean[5];
        System.out.println(Arrays.toString(blList)); //[false, false, false, false, false]

        double[] dbNotlar = new double[5];
        System.out.println(Arrays.toString(dbNotlar)); //[0.0, 0.0, 0.0, 0.0, 0.0]

    }
}
