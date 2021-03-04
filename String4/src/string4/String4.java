package string4;

public class String4 {

    public static void main(String[] args) {
       StringBuffer s1 = new StringBuffer("StringBuffer , String sınıfına alternatif olarak oluşturulmuştur");
       s1.delete(0, 13);
        System.out.println("Son durumda buffer :"+s1);
       StringBuilder s2 = new StringBuilder("StringBuilder,String sınıfına alternatif olarak oluşturulmuştur");
      s2.append(" bir sınıftır");
        System.out.println("son durum:"+s2);
    }
    
}
