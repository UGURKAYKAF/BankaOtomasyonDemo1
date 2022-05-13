import java.util.Scanner;

public class ParaYatır extends CekYatır {
    float paraYatirmaIslemi(float a,float bakiye){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hesabinizdan yatirmak istediginiz tutari giriniz : ");
        a=scanner.nextFloat();
        bakiye=bakiye+a;
        System.out.println("Yeni bakiyeniz : "+bakiye);
        System.out.println("hesabiniza yatirilan tutar : "+a);
        return  bakiye;
    }
}
