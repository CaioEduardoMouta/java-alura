package javapoo.javaio;


import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {

        //PrintStream ps = new PrintStream("lorem2.txt");

        PrintWriter ps = new PrintWriter("lorem2.txt");

        ps.println("Caio Eduardo Carrazedo Mouta");
        ps.println();
        ps.println();
        ps.println();
        ps.println("Maya e Marlene Mouta");

        ps.close();

        System.out.println();
    }
}
