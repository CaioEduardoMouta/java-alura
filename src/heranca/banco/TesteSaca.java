package heranca.banco;

public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123,321);

        conta.deposita(200.99);

        try{
            conta.saca(200.0);
        } catch (SaldoInsuficienteException ex){
            System.out.println("Ex "+ ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
