package practices;

import java.util.Random;
import java.util.Scanner;

public class Ali {
    public static void main(String[] args) {

        int sayac = 0;

        Scanner scan = new Scanner(System.in);
        //Random metodumuzu oluşturuyoruz..

        Random rastgele = new Random();
        int sayi = 1 + rastgele.nextInt(10);


        //Üretilen sayıyı sayi değişkenimize atadık
        System.out.println("Lutfen bir sayi giriniz");
        int tahmin = scan.nextInt();
        // Kullcanıcı tarafından tahminini aldık..

        sayac++;

        while (tahmin != sayi) {

            if (tahmin > 20 || tahmin < 0) {
                System.out.println("Tahmininiz 1-20 arasında olmalıdır!!!: ");
                System.out.println("-------------------- ");
                tahmin = scan.nextInt();
            }

            if (tahmin < sayi) {
                System.out.println("tahmininiz daha buyuk bir sayi olmalidir,tekrar deneyin: ");
                System.out.println("---------------------------- ");
                tahmin = scan.nextInt();
                sayac++;

            } else {
                System.out.println("tahmininiz daha kucuk bir sayi olmalidir,tekrar deneyin: ");
                System.out.println("---------------------------- ");
                tahmin = scan.nextInt();
                sayac++;
            }
        }

        System.out.println("Tebrikler " + sayac + " denemede " + sayi + " buldunuz");
        System.out.println("----------------------");
    }
}


