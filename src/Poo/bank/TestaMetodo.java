package Poo.bank;

public class TestaMetodo {

    public static void main(String[] args) {
        Conta contaDoCaio = new Conta();
        contaDoCaio.saldo = 100;
        contaDoCaio.deposita(50);
        System.out.println(contaDoCaio.saldo);
        boolean conseguiuRetirar = contaDoCaio.saca(20);
        contaDoCaio.saca(20);
        System.out.println(contaDoCaio.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarlene = new Conta();
        contaDaMarlene.deposita(1000);
        boolean sucessoTransferencia = contaDaMarlene.transfere(300, contaDoCaio);

        if(sucessoTransferencia){
            System.out.println("Transferência com sucesso");
        } else {
            System.out.println("saldo indisponível");
        }

        System.out.println(contaDaMarlene.saldo);
        System.out.println(contaDoCaio.saldo);

        contaDoCaio.titular = "Caio Mouta";
        System.out.println(contaDoCaio.titular);
    }
}
