programa {
  funcao inicio() {
    // 2) Fa�a um Algoritmo que leia um dado n�mero e imprima na tela se este � um n�mero primo ou n�o.

    // VAR
    inteiro n, c, mod
    
    // IN�CIO
    c = 0

    escreva("Informe qualquer n�mero inteiro para descobrir se ele � primo: ")
    leia(n)

    para (inteiro i = n; i > 0; i--) {
      mod = n % i
      se (mod == 0) { c++ }
    }

    se (c == 2 ou n == 1) {
      escreva("O n�mero ", n, " � primo.")
    } senao {
      escreva("O n�mero ", n, " n�o � primo.")
    }
  }
}
