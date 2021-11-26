package java8;

import sun.awt.image.ByteComponentRaster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import static java.util.Comparator.*;

public class OrdenaStrings {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<String>();
        palavras.add("Clean Code");
        palavras.add("Deitel");
        palavras.add("Design Patterns");

        palavras.sort((String s1, String s2) -> {
                if(s1.length() < s2.length())
                    return -1;
                if(s1.length() > s2.length())
                    return 1;
                return 0;

        });

       // palavras.sort((s1,s2) -> Integer.compare(s1.length(),s2.length()));

        palavras.sort(comparing(s -> s.length()));
        palavras.sort(comparing(String::length));

        Function<String, Integer> funcao = String::length;
        Function<String, Integer> funcao2 = s -> s.length();

        Comparator<String> comparador = comparing(funcao);
        palavras.sort(comparador);

        System.out.println(palavras);

//        for (String p : palavras) {
//            System.out.println(p);
//        }

        Consumer<String> impressor = System.out::println;
        palavras.forEach(impressor);


        palavras.forEach(System.out::println);

    }
}


class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length())
            return -1;
        if(s1.length() > s2.length())
            return 1;
        return 0;
    }
}
