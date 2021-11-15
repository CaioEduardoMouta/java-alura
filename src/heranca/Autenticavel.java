package heranca;
/*
Ela é um contrato onde quem assina e reponsável
por incrementar os métodos
Todos os metodos de uma interface são abstratos e públicos
 */


public abstract interface Autenticavel  {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

}
