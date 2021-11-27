package javapoo.heranca.br.com.safra.banco.test;

public class TesteString {

    public static void main(String[] args) {
        
        String vazio = "   Alura      ";
        String outroVazio = vazio.trim();

        System.out.println(vazio.contains("Alu"));
        System.out.println(outroVazio);

        int a = 3;
        String nome= "Caio";
//        String outro = new String("Alura");

        System.out.println(nome.length());

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
        }

        String sub = nome.substring(1);
        System.out.println(sub);

        int pos = nome.indexOf("io");
        System.out.println(pos);

//        char c = nome.charAt(0);
//        System.out.println(c);

//        char c = 'C';
//        char d = 'c';
//
//        String outro = nome.replace(c,d);

        //nome.toLowerCase();


//        System.out.println(nome);
//        System.out.println(outro);

    }
}
