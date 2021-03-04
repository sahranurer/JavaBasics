package havaalanigiseprojesi;

import java.util.Scanner;

public class HavaalaniGiseProjesi {
     public static int toplam_maliyet_hesapla(int toplamGecirilenDakika){
         int havaalaniGirisUcreti=50;
         int dakikaMaliyeti=2;
         return ((toplamGecirilenDakika*dakikaMaliyeti)+toplamGecirilenDakika);
     }
    public static int toplam_maliyet_hesapla(int toplamGecirilenDakika,int otoparktaGecenSure){
        int havaalaniGirisUcreti=50;
        int dakikaMaliyeti=2;
        int otoparkUcreti=3;
        return ((dakikaMaliyeti*dakikaMaliyeti)+(otoparktaGecenSure*otoparkUcreti)+havaalaniGirisUcreti);
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String message = "Havaalanına Hoşgeldiniz\n"
                +"Havaalanı giriş ücreti 50 TL'dir.\n"
                +"Havaalanına araçsız girişler için A kapısından araçlı girişler"
                +"için B kapısından giriş yapılmalıdır.\n"
                +"Havaalanına geçirdiğiniz her dakika için ücrete tabi tutulacaksınız"
                +"ve bu ücreti çıkışta ödeyeceksiniz.\n"
                +"Havaalanında geçirdiğiniz her dakika için 2 TL ücret alınır\n"
                +"Havaalanında geçirdiğiniz her dakika için 2 TL ve ek olarak"
                +"otoparkta geçirdiğiniz her dakika için 3 TL ücret alınır.";
        System.out.println(message);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Hangi kapıdan giriş yapacaksınız ? ");
        String kapiSecimi = scanner.nextLine();
        while(true){
            if (kapiSecimi.equals("A")) {
                String a1 = "Havaalanı çıkış gişesine Hoş Geldiniz \n"
                        +"Lütfen havaalanında geçirdiğiniz toplam dakikayı giriniz";
                System.out.println(a1);
                int toplamGecirilenDakika = scanner.nextInt();
                System.out.println("Toplam Odeme Miktarı :"+toplam_maliyet_hesapla(toplamGecirilenDakika));
                System.out.println("Odeme işleminiz gerçekleşiyor...");
                Thread.sleep(2000);
                System.out.println("Odeme işleminiz gerçekleştirildi.İyi Günler Dileriz...");
                return;
            }
            else if(kapiSecimi.equals("B")){
                String b1 = "Havaalanı çıkış gişesine Hoş Geldiniz \n"
                        +"Lütfen havaalanında geçirdiğiniz toplam dakikayı giriniz";
                System.out.println(b1);
                int toplamGecirilenDakika = scanner.nextInt();
                System.out.println("Aracınızın otoparkta kaldığı süreyi giriniz");
                int otoparktaGecenSure=scanner.nextInt();
                System.out.println("Toplam Odeme Miktarı:"+toplam_maliyet_hesapla(toplamGecirilenDakika,otoparktaGecenSure));
            System.out.println("Odeme işleminiz gerçekleşiyor...");
                Thread.sleep(2000);
                System.out.println("Odeme işleminiz gerçekleştirildi.İyi Günler Dileriz...");
                return;
            }
            else{
                System.out.println("Hatalı işlem yaptınız.");
            }
        }
       
        
    }
    
}
