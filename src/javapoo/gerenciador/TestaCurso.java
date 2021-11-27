package javapoo.gerenciador;

import java.util.List;

public class TestaCurso {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Java", "Caio Mouta");

       // javaColecoes.getAulas().add(new Aula("Lambdas",21));

        javaColecoes.adiciona(new Aula("Lambdas",21));
        javaColecoes.adiciona(new Aula("Jakarta",21));
        javaColecoes.adiciona(new Aula("Spring boot",21));

        List<Aula> aulas = javaColecoes.getAulas();

        System.out.println(javaColecoes.getAulas());


    }
}
