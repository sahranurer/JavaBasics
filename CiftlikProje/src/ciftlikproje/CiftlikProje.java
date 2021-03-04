package ciftlikproje;

public class CiftlikProje {

    public static void main(String[] args) {
        byte kopek = 2;
        int inek = 8;
        short koyun =3;
        long sutSatisFiyati=2;
        float gunlukSutMiktari=14.15f;
        System.out.println("Kopek Sayisi = "+kopek);
        System.out.println("İnek Sayisi = "+inek);
        System.out.println("Koyun Sayısı = "+koyun);
        double sutFiyati = sutSatisFiyati*gunlukSutMiktari;
        int toplamHayvanSayisi=kopek+inek+koyun;
        System.out.println("sutFiyati = " +sutFiyati);
        System.out.println("Toplam Hayvan Sayisi = "+toplamHayvanSayisi);
        
    }
    
}
