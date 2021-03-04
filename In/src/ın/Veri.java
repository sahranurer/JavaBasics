
package ın;

import java.util.Scanner;

public class Veri {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Adınızı Giriniz : ");
        String ad = scanner.nextLine();
        System.out.println("Kullanıcının adı : "+ad);
        System.out.println("Lütfen Bir Sayi Giriniz : ");
        int sayi = scanner.nextInt();
        System.out.println("Girilen Sayi : "+sayi);
        System.out.println("Lütfen Boyunuzu Giriniz : ");
        double boy = scanner.nextDouble();
        System.out.println("Girilen boy(metre cinsinden) : "+boy);
       
    }
    
}
