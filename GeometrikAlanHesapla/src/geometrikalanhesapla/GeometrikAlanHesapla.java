/*
 * x Altıgenin bir kenar uzunluğu ve r dairenin yarıçapı olmak üzere 
   Altıgenin alanı -->  Alan = 6/ (√3 * s^2)/ 4  
   Dairenin alanı --> pi*r^2
 */
package geometrikalanhesapla;

import java.util.Scanner;

public class GeometrikAlanHesapla {

    public static void main(String[] args) {
     Scanner s = new Scanner (System.in);
        System.out.println("Altıgenin kenar uzunluğunu giriniz : ");
        int kenar = s.nextInt();
        System.out.println("Dairenin yarıcap uzunluğunu giriniz : ");
        int yaricap = s.nextInt();
        System.out.println("Altıgenin alanı : "+(6*((kenar*kenar*Math.sqrt(3))/4)));
        System.out.println("Dairenin alanı : "+Math.PI*yaricap*yaricap);
        
    }
    
}
