package Poo.bankcomposto;

public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarlene = new Conta();
        System.out.println(contaDaMarlene.getSaldo());

        contaDaMarlene.titular = new Cliente();
        System.out.println(contaDaMarlene.titular);

        contaDaMarlene.titular.nome = "Marlene";
        System.out.println(contaDaMarlene.titular.nome);
    }
}
