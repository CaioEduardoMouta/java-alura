package javapoo.gerenciador;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "Programador Full Stack";
        String aula2 = "Data Science";
        String aula3 = "Internet das Coisas";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula: aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é" + primeiraAula);

        for (int i =0; i < aulas.size(); i++){
            System.out.println("aula :" + aulas.get(i));
        }

        System.out.println(aulas.size());

        aulas.forEach(aula -> {
            System.out.println("Percorrendo:");
            System.out.println("Aula :" + aula);
        });

        aulas.add("Ajax com Mysql");
        System.out.println(aulas);
        Collections.sort(aulas);

        System.out.println(aulas);


    }
}
