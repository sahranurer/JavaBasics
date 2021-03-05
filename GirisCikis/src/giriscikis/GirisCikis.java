package giriscikis;

import java.util.Scanner;

public class GirisCikis {
  public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Bir değer giriniz:");
            String deger = s.nextLine();
            System.out.print(deger);
            System.out.println("");
        }
        catch(Exception e){
            System.out.println("Bir hata oluştu.");
  }
        
    }
    
}
