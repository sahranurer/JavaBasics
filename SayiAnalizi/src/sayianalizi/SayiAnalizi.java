package sayianalizi;

import java.util.Scanner;


public class SayiAnalizi {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Girniz : ");
        int x = s.nextInt();
        System.out.print("İkinci Sayiyi Giriniz : ");
        int y = s.nextInt();
        System.out.println("Ucuncu Sayiyi Giriniz : ");
        int z = s.nextInt();
        System.out.println("Uc Sayı Arasından En Kucuk Sayi: "+Math.min(Math.min(x, y), Math.min(y, z)));
        System.out.println("Uc Sayı Arasından En Buyuk Sayi: "+Math.max(Math.max(x, y), Math.max(y, z)));
    }
    
}
