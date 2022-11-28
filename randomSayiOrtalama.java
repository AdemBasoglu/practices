package practices;

import java.util.Random;

public class randomSayiOrtalama {
    public static void main(String[] args) {

        rastgele100SayiOrtalama();
    }

    private static void rastgele100SayiOrtalama() {
        Random rastgele = new Random();
        int counter = 0;
        int rastgeleSayi = 0;
        int toplam = 0;

        do {

            rastgeleSayi = rastgele.nextInt(1000);
            toplam += rastgeleSayi;
            System.out.println("rastgeleSayi = " + rastgeleSayi);
            counter++;

        } while (counter < 100);
        System.out.println("Rastgele 100 sayinin ortalamasi : " + toplam / 100);
    }
}
