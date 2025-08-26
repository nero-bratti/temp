dois dos quatro testes falharam

o teste para ver se novos rankings são inseridos depois de 10
(são inseridos até 20)

e o teste do tamanho do array de scores, pelo mesmo motivo acima

foi um pouco dificil pensar em testes que encontrariam erros, levando em conta as especificação
e que, de certa forma, certas coisas funcionam mesmo estando erradas

Pela técnica de particionamento identifiquei

Teste para quando há menos de 10 scores -- deve inserir de qualquer jeito

Teste para quando é mais de 10 scores -- então deve testar a pontuação para decidir se
    caso maior que a pontuação minima -- adicionado ao score e apaga o antigo
    caso menor, não inserir
    caso igual -- não há especificação

Maria Eduarda Weiland Machado Bratti