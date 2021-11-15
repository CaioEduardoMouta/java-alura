package heranca.banco;

public class ContaPoupanca extends Conta{

    //Não existe herança de construtores
    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }
}
