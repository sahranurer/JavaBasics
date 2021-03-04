
package string2;


public class String2 {

    
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "Kotlin";
        int sonuc = s1.compareTo(s2);
        int sonuc2 = s2.compareTo(s3);
        System.out.println(sonuc);
        System.out.println(sonuc2);
        String m1 = "String A";
        String m2 = "String B ";
        boolean cikti = m1.equals(m2);
        System.out.println("m1 ve m2 denk mi ? "+cikti);
    }
    
}
