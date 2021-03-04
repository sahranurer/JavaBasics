package javaklubu;

import java.util.LinkedList;

public class JavaKlubu {

    public static void main(String[] args) {
       LinkedList<String> linkedlist = new LinkedList();
       linkedlist.add("AYŞE KARAMAN");
       linkedlist.add("MEHMET TURAN");
       linkedlist.add("RECEP KUTLU");
        for (String s:linkedlist) {
            System.out.println("Uye-"+s);
        }
        System.out.println("");
        System.out.println("2.indeksteki üye->"+linkedlist.get(2));
        linkedlist.add(0,"MUSA KARA");
        for (int i = 0; i<linkedlist.size(); i++) {
            System.out.println("Uye->"+linkedlist.get(i));   
        }
    }
    
}
