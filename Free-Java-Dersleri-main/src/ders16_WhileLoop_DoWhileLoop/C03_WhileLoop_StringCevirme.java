package ders16_WhileLoop_DoWhileLoop;
public class C03_WhileLoop_StringCevirme {
    public static void main(String[] args) {
        //While loop kullanarak verilen bir string'i terse cevirip,
        // bu halini bize döndüren bir hethod olusturun.
        System.out.println(metniTerseCevir("Bu is bu kadar"));
        System.out.println(metniTerseCevir("ey edip adanada pide ye"));
        System.out.println(classimm.dongu("Benim bir adim var"));
    }
    public static String metniTerseCevir (String metin){
        String tersMetin = "";
        int index = metin.length()-1;
        while (index>=0){
            tersMetin+=metin.charAt(index);
            index--;
        }
        return tersMetin;
    }


}
