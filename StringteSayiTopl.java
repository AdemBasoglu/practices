package practices;

import java.util.ArrayList;
import java.util.List;

public class StringteSayiTopl {
    public static void main(String[] args) {
        float sum = 0;
        //String bir listede ki fiyatları toplama
        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$54.45");
        myList.add("$23.60");
        myList.add("$23.60");
        myList.add("$23.60");
        myList.add("$23.60");

        for (String each : myList
        ) {
            each=each.replaceAll("[A-Z,a-z,$,€,£,₺]","");
            sum+=Double.parseDouble(each);

        }
        System.out.print("sayilarin toplami : ");
        System.out.printf("%2.2f", sum);

}}
