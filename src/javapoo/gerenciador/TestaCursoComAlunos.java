package javapoo.gerenciador;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAlunos {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Java", "Caio Mouta");

        javaColecoes.adiciona(new Aula("Lambdas",21));
        javaColecoes.adiciona(new Aula("Jakarta",21));
        javaColecoes.adiciona(new Aula("Spring boot",21));

        Aluno a1 = new Aluno("Mouta",18994);
        Aluno a2 = new Aluno("Carrazedo",21345);
        Aluno a3 = new Aluno("Eduardo",22211);
        Aluno a4 = new Aluno("Alves",22211);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);


        System.out.println("Todos os alunos matriculados ");

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterator = alunos.iterator();
        while(iterator.hasNext()) {
            Aluno proximo = iterator.next();
            System.out.println(proximo);
        }

        Vector<Aluno> vetor = new Vector<>();

//        for (Aluno a: javaColecoes.getAlunos()) {
//            System.out.println(a);
//        }

//        javaColecoes.getAlunos().forEach(a -> {
//            System.out.println(a);
//        });

        System.out.println("O aluno "+ a1 + " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        Aluno mouta = new Aluno("Mouta",18994);
        System.out.println("O Mouta está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(mouta));

        System.out.println("O a1 é == ao Mouta");
        System.out.println(a1.equals(mouta));

        System.out.println(a1.hashCode() == mouta.hashCode());
    }
}
