class SirketVeCalisanlari extends Thread {

    public SirketVeCalisanlari(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        super.run(); 
        System.out.println("Benim adım "+getName()+", "+sirket()+" adlı şirkette çalııyorum.");
    }
    public String sirket(){
        return getThreadGroup().getName();
    }
    
}


public class Sirketler {
    public static void main(String[] args){
        ThreadGroup avrupa = new ThreadGroup("Avrupa");
        ThreadGroup asya = new ThreadGroup("Asya");
        ThreadGroup afrika = new ThreadGroup("Afrika");
        
        SirketVeCalisanlari c1 = new SirketVeCalisanlari(avrupa,"Sevda");
        SirketVeCalisanlari c2 = new SirketVeCalisanlari(avrupa,"Kemal");
        avrupa.list();
        SirketVeCalisanlari c3 = new SirketVeCalisanlari(asya,"Merve");
        SirketVeCalisanlari c4 = new SirketVeCalisanlari(asya,"Kazım");
        asya.list();
        SirketVeCalisanlari c5 = new SirketVeCalisanlari(afrika,"Hikmet");
        SirketVeCalisanlari c6 = new SirketVeCalisanlari(afrika,"Ensar");
        afrika.list();
        System.out.println("");
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
    }
}
