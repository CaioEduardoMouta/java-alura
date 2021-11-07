package Poo.bankencapsulado;


public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(1337,222);

        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());
        Cliente caio = new Cliente();
        caio.setNome("Caio Mouta");

        conta.setTitular(caio);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");

        System.out.println(titularDaConta);
        System.out.println(caio);
        System.out.println(conta.getTitular());

    }


}
