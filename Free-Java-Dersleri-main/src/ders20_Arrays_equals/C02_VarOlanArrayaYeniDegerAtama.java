package ders20_Arrays_equals;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_VarOlanArrayaYeniDegerAtama {
    public static void main(String[] args) {
   /* Var olan bir array'e length olarak belirlenenden daha fazla element atanamaz*/
        int[] arr = {6,4,5,6,8,1};
        System.out.println(arr.length); //6

        //7. elementi atamak istersek?

        //arr[6]=13;  //hata ArrayIndexOutOfBoundsException

        arr = new int[8];  // 8 elementli bir array atamasi yaptim hepsi sifir oldu
        // Var olan array in uzunlugunu arttiramiyoruz yeni bir array olusturup
        //atama yapabiliyoruz
        System.out.println(Arrays.toString(arr));  // [0, 0, 0, 0, 0, 0, 0, 0]
        String[] harfler ={ "a", "n", "y"};
        String[] yeniHarfler ={"k", "l", "m", "n"};

        harfler=yeniHarfler;
        System.out.println(Arrays.toString(harfler)); //[k, l, m, n]
        //burada tamamen yeni bir array atiyor
        System.out.println(Arrays.toString(yeniHarfler));   //[k, l, m, n]

        harfler = new String[]{"x"}; //Eger liste seklinde degisiklik
                                        // yapacaksak böyle new yazacaz
        System.out.println(Arrays.toString(harfler));


    }
}
