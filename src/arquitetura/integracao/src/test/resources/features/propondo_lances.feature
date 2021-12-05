# language: pt

Funcionalidade:  Propondo lances

Cenario:  Propondo um unico lance valido
    Dado um lance valido
    Quando propoe o leilao
    Entao o lance aceito

    Cenario:  Propondo varios lances validos
        Dado varios lances validos
        Quando propoe o lance
        Entao os lances sao aceitos
