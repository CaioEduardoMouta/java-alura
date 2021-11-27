package javapoo.gerenciador;

import java.util.*;

public class TestaAlunos {

    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Caio Mouta");
        alunos.add("Carrazedo");
        alunos.add("Eduardo");
        alunos.add("Martins");
        alunos.add("Alves");
        alunos.add("Caio Mouta");

        boolean caioEstaMatriculado = alunos.contains("Caio Mouta");
        alunos.remove("Sérgio Lopes");
        System.out.println(caioEstaMatriculado);

        System.out.println(alunos.size());

        for (String aluno: alunos) {
            System.out.println(aluno);
        }

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });
        System.out.println(alunos);

        List<String> alunosEmLista = new ArrayList<>(alunos);
    }
}
