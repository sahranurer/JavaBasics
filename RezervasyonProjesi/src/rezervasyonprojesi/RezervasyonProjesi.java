package rezervasyonprojesi;

import java.util.Scanner;

public class RezervasyonProjesi {
    public static void main(String[] args) {
        String [] a = new String[12];
        a[9]="ERSİN TAN";
        a[1]="SUZAN ER";
        a[8]="MELİKE KUTUK";
        String giris="Pansiyonumuza Hoşgeldiniz\n"
                +"Pansiyonumuzda 12 adet oda bulunmaktadır.1'den 12'ye kadar numaralı odalar bulunmaktadır.\n";
        String bilgiler="Lütfen pansiyonumuzda kalmak için adınızı ve soyadınızı\n"
                +"kalmak istediğiniz oda numarasını giriniz.";
        System.out.println(giris+bilgiler);
        System.out.println(" ");
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adınız:");
        String ad = scanner.nextLine();
        System.out.print("Soyadınız:");
        String soyad = scanner.nextLine();
         while(true){
             System.out.print("Hoşgeldiniz "+ad+" Bey/Hanım "+" lütfen almak istediğiniz odayı seçiniz:");
             int oda = scanner.nextInt();
             for (int i = 0; i < a.length; i++) {
                 if (a[oda]!=null) {
                     System.out.println("Resepsyonist'e uyarı mesajı--> "+(oda)+" numaralı odada "+a[oda]+" bulunuyor");
                     System.out.println(" ");
                     System.out.println(" ");
                     System.out.println(ad+"Bey/Hanım "+oda+" numaralı odanız doludur.Lütfen başka bir oda seçiniz");
                     break;
                 }
                 else{
                     System.out.println(ad+" Bey/Hanım "+(oda)+"'ya yerleşebilirsiniz.");
                     break;
                 }
             }
    }
        
             
    }
    
}
