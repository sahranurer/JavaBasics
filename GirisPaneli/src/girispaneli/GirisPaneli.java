package girispaneli;

import java.util.Scanner;

public class GirisPaneli {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kullanici_adi ="sahraer";
        String kullanici_sifresi="112233";
        System.out.print("Kullanıcı adınızı giriniz:");
        String kullanici_adi1 = scanner.nextLine();
        System.out.println("Kullanıcı şifrenizi giriniz:");
        String kullanici_sifresi1 = scanner.nextLine();
        if (kullanici_adi.equals(kullanici_adi1)&& kullanici_sifresi.equals(kullanici_sifresi1)) {
            String bildirim = "Giriş Başarılı \n"
                    +"Hoşgeldiniz";
            System.out.println(bildirim);
            return;
            
        }
        else if (kullanici_adi.equals(kullanici_adi1) &&! kullanici_sifresi.equals(kullanici_sifresi1)){
            String bildirim =("Girmiş olduğunuz şifre hatalı");
            System.out.println(bildirim);
            return;
        }
        else if (!kullanici_adi.equals(kullanici_adi1) && kullanici_sifresi.equals(kullanici_sifresi1) ) {
            String bildirim = ("Girmiş olduğunuz kullanici adi hatalı");
            System.out.println(bildirim);
            return;
        }
        else{
            String bildirim = ("Girmiş olduğunuz kullanıcı adı ve şifre hatalı");
            System.out.println(bildirim);
            return;
        }
    }
    
}
