# language: pt
Funcionalidade: Apenas usuarios cadastrados podem se logar

Cenario: Propondo um unico lance valido
  Dado o usuario valido
  Quando realiza login
  Entao é redirecionado para a pagina de leiloes

Cenario: Um usuario invalido não consegue se logar
  Dado o usuario invalido
  Quando tenta se logar
  Entao continua na pagina de login