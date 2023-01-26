programa {
  funcao inicio() {
    // 4) Escreva um Algoritmo que calcule a média de um aluno numa dada disciplina e imprima o resultado.
    // Regra: Durante o semestre o aluno faz 3 avaliações com notas de 0 a 10. É considerado aprovado, o aluno que consegue nota igual
    // ou superior a 7. Se este ficar com nota menor que 7 e maior ou igual a 5, será considerado de recuperação. No entanto, se a nota
    // for abaixo de 5, o aluno será considerado reprovado e deverá repetir o semestre.

    // VAR
    real n1, n2, n3, med

    // INÍCIO
    escreva("informe a primeira nota do aluno: ")
    leia(n1)
    escreva("informe a segunda nota do aluno: ")
    leia(n2)
    escreva("informe a terceira nota do aluno: ")
    leia(n3)

    med = (n1 + n2 + n3) / 3

    escreva("A média do aluno foi ", med, "\n")

    se (med < 5) {
      escreva("Aluno reprovado.")
    } senao se (med >= 5 e med < 7) {
      escreva("Aluno em recuperação.")
    } senao {
      escreva("Aluno aprovado.")
    }
    
    // FIM DE PROGRAMA
  }
}
