package donusum;

public class Donusum {

    public static void main(String[] args) {
        String a = "5";
        int sayiA = Integer.valueOf(a);
        int sayiB = Integer.parseInt(a);
        System.out.println("String --> Integer : "+sayiA);
        System.out.println("String --> Integer : "+sayiB);
        int b = 4 ;
        String a1 = String.valueOf(b);
        String a2 = Integer.toString(b);
        System.out.println("Integer-->String : "+a1);
        System.out.println("Integer-->String : "+a2);
        
        String aa = "15";
        double aa1= Double.parseDouble(a);
        System.out.println("String --> Double : "+aa1);
    }
    
}
