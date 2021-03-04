package javaklubu1;

import java.util.Iterator;
import java.util.Vector;

public class JavaKlubu2 {

    public static void main(String[] args) {
       Vector<String> v = new Vector();
       v.add("EYUP ENSAR ER");
       v.add("ALİ KAHRAMAN");
       v.add("TURAN KIRMIZI");
       v.add("YILDIZ KOSE");
       Iterator<String> i1 = v.iterator();
       while(i1.hasNext()){
           System.out.println("Uye-"+i1.next());
       }
        System.out.println("");
        System.out.println("");
        String [] array = new String[4];
        v.toArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Uye-"+array[i]);
        }
    }
    
}
