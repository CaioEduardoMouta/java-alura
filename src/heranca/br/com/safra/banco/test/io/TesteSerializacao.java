package heranca.br.com.safra.banco.test.io;

import heranca.br.com.safra.banco.modelo.Cliente;
import heranca.br.com.safra.banco.modelo.ContaCorrente;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException {
        Cliente cliente = new Cliente();
        cliente.setNome("Caio");
        cliente.setProfissao("Progrmador");
        cliente.setCpf("11122233344");

        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(222.3);
        cc.setTitular(cliente);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(cliente);
        oos.close();
    }
}
