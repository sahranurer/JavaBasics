package javaklubu1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class JavaKlubu1 {

    public static void main(String[] args) {
       ArrayList<String> arraylist= new ArrayList();
       arraylist.add("ENSAR ER");
       arraylist.add("SUZAN ER");
       arraylist.add("SAHRA ER");
       Iterator<String> i1 = arraylist.iterator();
       while(i1.hasNext()){
           System.out.println("Uye--"+i1.next());
       }
        System.out.println("");
        System.out.println("");
        ListIterator i2 = arraylist.listIterator();
        while(i2.hasNext()){
            Object o1 = i2.next();
            i2.set(o1+"/");
            i1=arraylist.iterator();
            while(i1.hasNext()){
                System.out.println("Uye-"+i1.next());
            }
        }
        System.out.println("");
        System.out.println("");
        while(i2.hasPrevious()){
            System.out.println("Uye-"+i2.previous());
        }
    }
    
}
