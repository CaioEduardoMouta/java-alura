package biblioteca.br.com.banco;


import heranca.br.com.safra.banco.modelo.Conta;
import heranca.br.com.safra.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

    public static void main(String[] args) {

        Conta c = new ContaCorrente(123,321);

        c.deposita(200.3);

        System.out.println(c.getSaldo());
    }
}