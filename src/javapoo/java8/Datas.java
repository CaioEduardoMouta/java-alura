package javapoo.java8;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate copa = LocalDate.of(2022, Month.NOVEMBER,5);

        int anos = copa.getYear() - hoje.getYear();

        System.out.println(anos);

        Period periodo = Period.between(hoje, copa);
        System.out.println(periodo.getDays());

        LocalDate proximasCopas = copa.plusYears(4);
        System.out.println(proximasCopas);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String valorFormatado = proximasCopas.format(formatador);
        System.out.println(valorFormatado);

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatador));

        LocalTime intervalo = LocalTime.of(15,30);
        System.out.println(intervalo);
        
    }
}
