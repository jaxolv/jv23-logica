programa {
  funcao inicio() {
    // 4) Escreva um Algoritmo que calcule a m�dia de um aluno numa dada disciplina e imprima o resultado.
    // Regra: Durante o semestre o aluno faz 3 avalia��es com notas de 0 a 10. � considerado aprovado, o aluno que consegue nota igual
    // ou superior a 7. Se este ficar com nota menor que 7 e maior ou igual a 5, ser� considerado de recupera��o. No entanto, se a nota
    // for abaixo de 5, o aluno ser� considerado reprovado e dever� repetir o semestre.

    // VAR
    real n1, n2, n3, med

    // IN�CIO
    escreva("informe a primeira nota do aluno: ")
    leia(n1)
    escreva("informe a segunda nota do aluno: ")
    leia(n2)
    escreva("informe a terceira nota do aluno: ")
    leia(n3)

    med = (n1 + n2 + n3) / 3

    escreva("A m�dia do aluno foi ", med, "\n")

    se (med < 5) {
      escreva("Aluno reprovado.")
    } senao se (med >= 5 e med < 7) {
      escreva("Aluno em recupera��o.")
    } senao {
      escreva("Aluno aprovado.")
    }
    
    // FIM DE PROGRAMA
  }
}
