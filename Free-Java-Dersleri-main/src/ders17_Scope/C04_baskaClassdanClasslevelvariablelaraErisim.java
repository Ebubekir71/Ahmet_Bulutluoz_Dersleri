package ders17_Scope;

public class C04_baskaClassdanClasslevelvariablelaraErisim {
    public static void main(String[] args) {
        System.out.println(C03_ClassLevelVariablelar.bls);      // false
        System.out.println(C03_ClassLevelVariablelar.chrs);     // java
        System.out.println(C03_ClassLevelVariablelar.strs);     // 0
        System.out.println(C03_ClassLevelVariablelar.sayis);    // a

        C03_ClassLevelVariablelar obj = new C03_ClassLevelVariablelar();
        System.out.println(obj.bli);    //false
        System.out.println(obj.chri);   // ''
        System.out.println(obj.stri);   // 0
        System.out.println(obj.sayii);  // 23

        System.out.println(obj.bls);
        System.out.println(obj.strs);
    }
}
