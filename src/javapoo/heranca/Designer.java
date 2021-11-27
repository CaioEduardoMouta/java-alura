package javapoo.heranca;

import javapoo.heranca.Funcionario;

public class Designer extends Funcionario {

    public double getBonificacao(){
       System.out.println("Bonificação do Designer");
       return 200;
    }


}
