package javapoo.gerenciador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Java", "Caio Mouta");

        // javaColecoes.getAulas().add(new Aula("Lambdas",21));

        javaColecoes.adiciona(new Aula("Lambdas", 21));
        javaColecoes.adiciona(new Aula("Jakarta", 21));
        javaColecoes.adiciona(new Aula("Spring boot", 21));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());

        System.out.println(javaColecoes);


        }
    }

