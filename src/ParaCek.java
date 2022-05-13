import java.util.Scanner;

public class ParaCek {
    float paraCekmeIslemi(float a,float bakiye){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hesabinizdan cekmek istediginiz tutari giriniz : ");
        a=scanner.nextFloat();
        bakiye=bakiye-a;
        System.out.println("Yeni bakiyeniz : "+bakiye);
        System.out.println("hesabinizdan cekilen tutar : "+a);
        return bakiye;
    }
}
