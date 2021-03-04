package sayitahminoyunuprojesi;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunuProjesi {

    public static void main(String[] args) {
        short tahmin_hakki = 6;
        String message = "Sayı Tahmin Oyununa Hoşgeldiniz\n"
                + "Oyunumuzda 0 ile 20 arasında sayı tahmini ve tahmin hakkınız 6 dır.\n"
                + "Tahmin hakkı bitiminde oyun sonlanır \n"
                + "Ancak eğer isterseniz tekrar rastgele bir sayı atayarak oyuna başlayabilirsiniz\n"
                + "Oyun Başladı \nBaşarılar... \n"
                + " Tahmin ettiğiniz sayı giriniz : ";
        while (true) {
            System.out.println(message);
            Random random = new Random();
            int tahmin_edilecek_sayi = random.nextInt(20);
            Scanner scanner = new Scanner(System.in);
            for (int i = tahmin_hakki; i > 0; i--) {
                int tahmin_edilen_sayi = scanner.nextInt();
                if (tahmin_edilecek_sayi == tahmin_edilen_sayi) {
                    String message2 = "Tebrikler ! Doğru tahmin yaptınız \n"
                            + "Tekrar oynamak için 1'e çıkış yapmak için 0'a basınız \n";
                    System.out.println(message2);
                    int secim = scanner.nextInt();
                    if (secim == 0) {
                        System.out.println("Çıkış Yapılıyor...");
                        return;
                    } else {
                        break;
                    }

                } else if (tahmin_edilecek_sayi != tahmin_edilen_sayi) {
                    System.out.println("Hatalı tahmin yaptınız" + " " + "Kalan tahmin hakkınız:" + (i - 1));
                    if (i == 1) {
                        String message3 = "Tahmin hakkınız bitti\n"
                                + "Tekrar oynamak için 1'e çıkmak için 0'a basınız.";
                        System.out.println(message3);
                        int secim = scanner.nextInt();
                        if (secim == 0) {
                            System.out.println("Çıkış Yapılıyor...");
                            return;
                        } else {
                            break;
                        }
                    }
                tahminOrani(tahmin_edilen_sayi ,tahmin_edilecek_sayi);
                }
                
            }

        }
        
    }
    static void tahminOrani(int tahmin_edilen_sayi , int tahmin_edilecek_sayi){
     int f = tahmin_edilen_sayi-tahmin_edilecek_sayi;
        if(f<=0 && f>-2|| f>=0 && f<2){
                System.out.println("Sayıya çok yaklaştınız");
                
            }
            else if(f<=-2 && f>-4 || f>=2 &&f<4){
                
                System.out.println("Sayıya yaklaşıyorsunuz");
                
            }
            else if(f<=-4 &&f>-14 || f>=4 &&f< 14){
                System.out.println("Sayıdan uzaklaşıyorsunuz");
            }
            else if(f<=-15 && f>-19 || f>=15 && f<=19){
                System.out.println("Sayıdan çok uzaklaştınız");
            }
    }
    
}



