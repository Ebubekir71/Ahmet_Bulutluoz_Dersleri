package ders20_Arrays_equals;

public class C04_ArrayeBirElemaniMethodlaEkleme {
    public static void main(String[] args) {
        int[] arr = {3,7,8};
        int eklenecekSayi = 10;
        System.out.println(arrayeBirElemanEkle(arr, eklenecekSayi));
    }
    public static int[] arrayeBirElemanEkle(int[] eskiArr, int eklenecekSayi){
        int[] yeniArr = new int[eskiArr.length+1];
        for (int i=0; i<eskiArr.length; i++){
            yeniArr[i]= eskiArr[i];
        }
        yeniArr[yeniArr.length-1]=eklenecekSayi;
        eskiArr=yeniArr;
        return yeniArr;
    }
}
