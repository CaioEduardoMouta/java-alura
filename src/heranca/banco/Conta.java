package heranca.banco;

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){
        heranca.banco.Conta.total++;
        //System.out.println("O total de contas é" + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //System.out.println("estou criando uma Conta" + this.numero);
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteException{
        if(this.saldo < valor){
            throw new SaldoInsuficienteException("Saldo: "+ this.saldo +
                    " Valor: " + valor);
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
        this.saca(valor);
            destino.deposita(valor);

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
