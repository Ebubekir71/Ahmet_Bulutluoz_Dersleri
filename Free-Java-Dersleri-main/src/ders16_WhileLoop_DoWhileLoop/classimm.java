package ders16_WhileLoop_DoWhileLoop;

public class classimm {
    public static String dongu(String metinim){
        String tersMetin = "";
        int index = metinim.length()-1;
        while (index>=0){
            tersMetin+=metinim.charAt(index);
            index--;
        }
        return tersMetin;
    }
}
