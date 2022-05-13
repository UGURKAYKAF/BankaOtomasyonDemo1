import java.util.Scanner;

import java.util.Scanner;

public class Secim {
    void secim(float bakiye) {

        Scanner scanner = new Scanner(System.in);
        int secim;
        System.out.println("yapmak istediginiz islemi seciniz");
        System.out.println("1-Para Cekme");
        System.out.println("2-Para Yatirma");
        System.out.println("3-Kredi Islemleri");
        System.out.println("4-Faiz Islemleri");

        secim = scanner.nextInt();
        float bakiyeCurrent = 0;
        if (bakiye == 0) {
            System.out.println("Hesap bakiyenizi giriniz");
            bakiyeCurrent = scanner.nextFloat();


        }else{
            bakiyeCurrent=bakiye;
        }

        CekYatır cekYatır = new CekYatır();
        float bakiye1 = cekYatır.bakiye(bakiyeCurrent);

        BakiyeUtil util = new BakiyeUtil();
        util.ok(secim, bakiye1);


    }

}