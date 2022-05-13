import java.util.Scanner;

public class BaseKrediManager {
    void hesapla (double oran){
        Scanner scanner = new Scanner(System.in);
        //double orn=oran;
        double odencek,alınan;
        int gun;
        System.out.println("Istediginiz Kredi Tutarini Giriniz");
        int tutar = scanner.nextInt();
        double faizTutari=oran*tutar;
        double toplamTutar= tutar+faizTutari;
        System.out.println("Faiz tutariniz : "+faizTutari);
        System.out.println("Bankaya odenecek faizli tutar : "+toplamTutar);

    }
}
