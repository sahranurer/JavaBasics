package semafor;

public class semafor {

   private int sayi;

    public semafor(int sayi) {
        this.sayi = sayi;
    }
   
   public synchronized void baglanti_al(){
       while(sayi==0){
           System.out.println(Thread.currentThread().getName()+"--> bekliyor.");
           try{
               wait();
           }catch(Exception e){
               
           }
       }
        System.out.println(Thread.currentThread().getName()+"--> bağlantı sağlandı.");
        sayi--;
   }
   public synchronized void baglanti_birak(){
       System.out.println(Thread.currentThread().getName()+"--> bağlantı koptu.");
        sayi++;
   }
    
}
class Veritabanı{
    public void baglanti_sagla(){
        
    }
    public void baglanti_kes(){
        
    }
}

class İslemler extends Thread{
    semafor s1 ;
    Veritabanı v1;

    public İslemler(semafor s1, Veritabanı v1) {
        this.s1 = s1;
        this.v1 = v1;
    }

    @Override
    public void run() {
        super.run(); 
        s1.baglanti_al();
        v1.baglanti_sagla();
        
        s1.baglanti_birak();
        v1.baglanti_kes();
    }
    
    
    
}

class SemaforCalistir{
    public SemaforCalistir(int sayi){
        semafor s = new semafor(sayi);
        Veritabanı v = new Veritabanı();
        
        İslemler t0 = new İslemler(s,v);
        İslemler t1 = new İslemler(s,v);
        İslemler t2 = new İslemler(s,v);
        İslemler t3 = new İslemler(s,v);
        
        t0.start();
        t1.start();
        t2.start();
        t3.start();
        
        
    }
    public static void main(String[] args){
        SemaforCalistir s = new SemaforCalistir(2);
    }
}

