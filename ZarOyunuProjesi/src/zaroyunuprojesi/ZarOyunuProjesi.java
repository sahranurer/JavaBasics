package zaroyunuprojesi;

import java.util.Scanner;

public class ZarOyunuProjesi {

    public static void main(String[] args) {
        char t ='t';
        int o1 =0;
        int o2 =0;
        int sayac=0;
        int z1,z2 =0;
        int fark ;
        Scanner scanner = new Scanner(System.in);
        String m1 ="Birinci oyuncunun sahip olduğu para miktarı:";
        System.out.print(m1);
        o1=scanner.nextInt();
        String m2 = "İkinci oyuncunun sahip olduğu para miktarı:";
        System.out.print(m2);
        o2=scanner.nextInt();
        while(o1>0 && o2>0 && t=='t'){
            sayac++;
            System.out.println("Şu anda oyunun "+sayac+"turundasınız.");
            z1=((int)(Math.random()*6+1));
            z2=((int)(Math.random()*6+1));
            System.out.println("O1 oyuncusunun attığı sayının değeri:"+z1);
            System.out.println("O2 oyuncusunun attığı sayının değeri:"+z2);
            if (z1<z2) {
                fark=z2-z1;
                o1=o1-fark;
                o2+=fark;
                System.out.println("o1 oyuncunusun kalan parası:"+o1);
            }
            else if (z2<z1) {
                fark=z1-z2;
                o2=o2-fark;
                o1+=fark;
                System.out.println("o2 oyuncusunun kalan parası:"+o2);
            }
            else{
                System.out.println("Lütfen tekrar zar atınız");
            }
            if (o1<=0 || o2<=0) {
                break;
            }
            else{
                System.out.println("Tekrar zar atmak için t'ye basınız");
                t = scanner.next().charAt(0);
            }
            
        }
        if (o1<o2) {
            System.out.println("2.oyuncu "+sayac+" turda kazandı");
        }
        else{
            System.out.println("1.oyuncu "+sayac+" turda kazandı");
        }
        
    }
    
}
