programa {
  // 6) Fa�a uma algoritmo para corrigir uma prova, a partir de um gabarito. Primeiro leia o gabarito, ou seja, leia a resposta de 5 quest�es.
  // Em seguida leia o nome de 3 alunos e leia as respectivas respostas das 5 quest�es marcada por eles. Confira o resultado e imprima na tela,
  // ou seja, a nota alcan�ada por cada aluno. Imprima tamb�m a m�dia da turma.
  // VAR
  inteiro notas[3]
  cadeia nomes[3]


  funcao inicio() {
    // IN�CIO
    caracter gabaritoFinal[5] = {'a', 'c', 'c', 'd', 'b'}

    para (inteiro i = 0; i < 3; i++) {
      inteiro acertos = 0

      escreva("Informe o nome do aluno: ")
      leia(nomes[i])

      escreva("Informe abaixo o gabarito de ", nomes[i], ": \n")
      para (inteiro j = 0; j < 5; j++) {
        caracter questao
        leia(questao)

        se (questao == gabaritoFinal[j]) {
          acertos++
        }
      }

      notas[i] = acertos
    }

    real media = 0

    para (inteiro i = 0; i < 3; i++) {
      escreva(nomes[i], ": ", notas[i], "\n")
      media += notas[i]
    }

    media /= 3
    escreva("A m�dia da turma foi de ", media)
  }
}