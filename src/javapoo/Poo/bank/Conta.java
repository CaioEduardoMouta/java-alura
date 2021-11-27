package javapoo.Poo.bank;


public class Conta {
    int agencia = 42;
    int numero;
    double saldo;
    String titular;

    public void deposita(double valor){
        this.saldo = this.saldo + valor;
    }

    public boolean saca(double valor) {
        if(this.saldo >= valor){
            this.saldo = this.saldo - valor;
            return true;
        } else{
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else
            return false;
    }
}
