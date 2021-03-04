package aracgecisustunluguproje;

import java.util.PriorityQueue;
import java.util.Scanner;

public class AracGecisUstunluguProje {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       PriorityQueue<Arac> a = new PriorityQueue<>();
       String message = "Sürücü adı ve arac türünü giriniz.\n"
               +"Arac türleri Kargo,İtfaiye,Polis veya Ambulans olabilir.\n";
        System.out.println(message);
        while(a.size()<4){
            System.out.print("Sürücü Adı:");
            String ad = scanner.nextLine();
            System.out.print("Arac Türü:");
            String tur = scanner.nextLine();
            a.add(new Arac(ad,tur));
        }
        int b =1;
        while(!a.isEmpty()){
            System.out.println("");
            System.out.println("Aracın trafikte geçiş üstünlüğü sıralaması:"+b);
            System.out.println(a.poll());
            b++;
        }
    }
    
}
