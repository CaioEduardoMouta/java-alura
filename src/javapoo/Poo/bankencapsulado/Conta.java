package javapoo.Poo.bankencapsulado;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){
        javapoo.Poo.bankencapsulado.Conta.total++;
        System.out.println("O total de contas é" + javapoo.Poo.bankencapsulado.Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou criando uma Conta" + this.numero);
    }

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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Não pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero <= 0){
            System.out.println("Não pode valor <= 0");
            return;
        }
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return total;
    }
}
