package javapoo.javaio;


import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Caio Eduardo Mouta");
        bw.newLine();
        bw.newLine();
        bw.write("Marlene e Maya");

        bw.close();
    }
}
