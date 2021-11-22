package javaio;


import java.io.*;

public class TesteEscritaFileWrite {

    public static void main(String[] args) throws IOException {

//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);


        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        bw.write("Caio Eduardo Mouta");
        bw.write(System.lineSeparator());
        bw.newLine();
        bw.write("Senhora Mãe");
        /*
        System.lineSeparator(), garantimos
        que a nova linha no arquivo de texto
        é criada baseada nos caracteres do
        sistema operacional.
         */
        bw.write(System.lineSeparator());
        bw.write("Marlene e Maya");

        bw.close();
    }
}
