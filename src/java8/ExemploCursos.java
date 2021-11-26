package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Curso {
    private String nome;
    private int alunos;

    public Curso (String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
  }
    public class ExemploCursos {
        public static void main(String[] args) {
            List<Curso> cursos = new ArrayList<Curso>();
            cursos.add(new Curso("Python",45));
            cursos.add(new Curso("JavaScript",145));
            cursos.add(new Curso("Java 16",453));
            cursos.add(new Curso("Node.js",45));

            cursos.sort(Comparator.comparing(Curso::getAlunos));

            int sum = cursos.stream()
                    .filter(c -> c.getAlunos() >= 100)
                    .mapToInt(Curso::getAlunos)
                    .sum();

            System.out.println(sum);
        }
}
