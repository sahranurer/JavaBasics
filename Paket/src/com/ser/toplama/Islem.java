package com.ser.toplama;

import java.util.Scanner;

public class Islem {
    public Islem() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Toplamak İstediğiniz İki Sayı Giriniz");
        System.out.println("Birinci sayı : ");
        int a = scanner.nextInt();
        System.out.println("İkinci sayı : ");
        int b = scanner.nextInt();
        int sonuc = a+b;
        System.out.println("Sonuc Hesaplanıyor...");
        Thread.sleep(3000);
        System.out.println("Islem Sonucu : "+sonuc);
        
    }
}
