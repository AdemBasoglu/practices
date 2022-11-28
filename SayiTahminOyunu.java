package practices;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random rastgele = new Random();
        int rastgeleSayi = 1 + rastgele.nextInt(19);
        //System.out.println("rastgeleSayi = " + rastgeleSayi);
        int counter = 0;

        int userSayi;
        System.out.println("lutfen bir sayi tahmin ediniz");
        userSayi = scan.nextInt();

        counter++;
        do {
            if (userSayi < 0 || userSayi > 20) {
                System.out.println("lutfen 1 ile 20 arasinda bir sayi giriniz");
                counter++;
                userSayi = scan.nextInt();
            } else if (rastgeleSayi > userSayi) {
                System.out.println("lutfen daha buyuk bir sayi giriniz");
                counter++;
                userSayi = scan.nextInt();
            } else {
                System.out.println("lutfen daha kucuk bir sayi giriniz");
                counter++;
                userSayi = scan.nextInt();
            }

            }while (rastgeleSayi != userSayi); {
            System.out.println("TEBRIKLER!!!" + " sansli sayi " + rastgeleSayi + "/// " + counter + " kadar tahminde sayiyi bildiniz");
        }
    }
}


