package ders14_While_Loop;

public class C03_Deneme {
    public static void main(String[] args) {
        int toplam = 0;
        for (int i = 1; i < 100; i++) {
            toplam = toplam + i;
        }
        System.out.println("for loop ile toplam "+toplam);


        toplam = 0;
        int i =1;
        while(i<100){
            toplam +=i;
            i++;
        }
        System.out.println(toplam);
    }
}
