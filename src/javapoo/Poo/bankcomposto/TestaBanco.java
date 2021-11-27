package javapoo.Poo.bankcomposto;

public class TestaBanco {

    public static void main(String[] args) {
        Cliente caio = new Cliente();
        caio.nome = "Caio";
        caio.cpf = "222.111.333-44";
        caio.profissao = "Programação";

        Conta contaDoCaio = new Conta();
        contaDoCaio.deposita(100);

        contaDoCaio.titular = caio;
        System.out.println(contaDoCaio.titular.nome);
        System.out.println(contaDoCaio.titular);
        System.out.println(caio);
    }

}