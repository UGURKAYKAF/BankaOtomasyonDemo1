import java.util.Scanner;

public class Faiz {

    void hesapla(double oran){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Faiz'e yatirilacak ana parayi girinzi");
        int anapara=scanner.nextInt();
        System.out.println("Faiz kac gunluk olsun");
        int gun=scanner1.nextInt();
        double ıslem1= anapara*oran;
        double ıslem2=ıslem1*gun;
        double ıslem3=ıslem2/36500;
        System.out.println("Faiz'den gelen para : "+ıslem3);
    }
}
