package stringtrim;

import java.util.ArrayList;

public class StringTrim {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(4);
        String s = list.toString();
        System.out.println("String'e donüştürülen değer-1 : "+s);
        Integer y = 1923;
        String s2 = s.toString();
        System.out.println("String'e donüştürülen değer-2 : "+s2);
        String s3 = " Giriş";
        System.out.println("Trim metodu kullanılmadan çıktı :"+s3);
        System.out.println("Trim metodu kullanılarak çıktı :"+s3.trim());
        
        
        
    }
    
}
