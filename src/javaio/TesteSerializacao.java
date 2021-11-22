package javaio;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

    	Cliente cliente = new Cliente();
    	cliente.setNome("Caio");
    	cliente.setProfissao("Programador");
    	cliente.setCpf("22233311144");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
        oos.writeObject(cliente);
        oos.close();

//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
//        String nome = (String) ois.readObject();
//        ois.close();
//        System.out.println(nome);
    }
}
