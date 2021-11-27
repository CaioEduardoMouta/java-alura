package javapoo.gerenciador;

public class TestaBuscaAlunosNoCurso {

    public static void main(String[] args) throws NoSuchFieldException {


        Curso javaColecoes = new Curso("Dominando Java", "Caio Mouta");

        javaColecoes.adiciona(new Aula("Lambdas", 21));
        javaColecoes.adiciona(new Aula("Jakarta", 21));
        javaColecoes.adiciona(new Aula("Spring boot", 21));

        Aluno a1 = new Aluno("Mouta", 18994);
        Aluno a2 = new Aluno("Carrazedo", 21345);
        Aluno a3 = new Aluno("Eduardo", 22211);
        Aluno a4 = new Aluno("Alves", 22211);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        javaColecoes.matricula(a4);

        System.out.println(javaColecoes.getAlunos());
        System.out.println("Quem é o aluno com matricula 21345?");
        Aluno aluno = javaColecoes.buscaMatriculado(21345);
        System.out.println("Aluno :" + aluno);

    }
}
