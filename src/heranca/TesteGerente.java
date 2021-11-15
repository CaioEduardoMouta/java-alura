package heranca;



public class TesteGerente {

    public static void main(String[] args) {

        Autenticavel gerente = new Gerente();
        Autenticavel adm = new Administrador();


        Gerente g1 = new Gerente();
        g1.setNome("Ca");
        g1.setCpf("111222333-00");
        g1.setSalario(5000.99);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        g1.setSenha(222);
        boolean autenticou = g1.autentica(2222);

        System.out.println(autenticou);

        System.out.println(g1.getBonificacao());
    }
}
