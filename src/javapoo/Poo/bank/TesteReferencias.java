package javapoo.Poo.bank;

public class TesteReferencias {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira "+primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("saldo da segunda Conta" + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("saldo da segunda Conta: "+segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta) {
            System.out.println("São a mesma Conta");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
