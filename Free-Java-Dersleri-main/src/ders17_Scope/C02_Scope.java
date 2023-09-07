package ders17_Scope;

public class C02_Scope {
    static int classLevelStatic =12 ;
    String strClassLevelStaticOlmayan = "Java Güzeldir";

    public static void main(String[] args) {
        System.out.println(classLevelStatic);
//        System.out.println( strClassLevelStaticOlmayan );
//        static olmayan bir variable statigin icerisine giremez
        int sayiMain=20;
        for (int i = 0; i < 10; i++) {
            int sayiForLoop=5;
            System.out.println(classLevelStatic);
        }
    }
    public static void staticMethod(){
        System.out.println(classLevelStatic);
        String strStaticMethod = "Java Candir";
    }

    public void staticOlmayanMethod(){
        System.out.println(classLevelStatic);
        boolean blStaticOlmayanMethod = true;
        System.out.println( strClassLevelStaticOlmayan );   //Burada static olmayan variable calisir
                                                            // cünkü method olarakta static degil
    }
}
