# language: pt

Funcionalidade:  Propondo lances

Cenario:  Propondo um unico lance valido
    Dado um lance valido
    Quando propoe o leilao
    Entao o lance aceito

    Cenario:  Propondo varios lances validos
        Dado um lance de 10.0 reais do usuario "fulano"
        E um lance de 15.0 reais do usuario "beltrano"
        Quando propoe o lance
        Entao os lances sao aceitos

    Esquema do Cenario: Propondo um lance invalido
        Dado um lance de <valor> reais e do usuario '<nomeUsuario>'
        Quando propoe ao leilao
        Entao o lance nao e aceito

 Exemplos:
    |valor | nomeUsuario |
    |0     | beltrano    |
    |-1    | cigano     |

  Cenario:  Propondo uma sequencia de lances
    Dado dois lances
      |valor    | nomeUsuario |
      | 10.0    | beltrano    |
      | 15.0    | beltrano    |
    E um lance de 15.0 reais do usuario "fulano"
    Quando propoe o lance
    Entao o segundo lance nao e aceito