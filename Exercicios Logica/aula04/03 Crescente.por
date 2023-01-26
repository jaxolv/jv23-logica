programa {
  // 3) Faça um programa que leia 4 números e em seguida imprima o resultado em ordem crescente.
  // Use o conceito de Procedimento para desenvolver o código.

  // VAR
  inteiro n1, n2, n3, n4

  funcao inteiro crescente(inteiro a, inteiro b) {
    // PROCEDIMENTO
    enquanto (a < b) {
      // a == 10; b == 5 => 10 < 5 ? FALSO
      inteiro aux = a // aux == 5
      a = b
      b = aux

    }
  }

  funcao inicio() {
    // INÍCIO
    escreva("Informe o 1o número: ")
    leia(n1)
    escreva("Informe o 2o número: ")
    leia(n2)
    escreva("Informe o 3o número: ")
    leia(n3)
    escreva("Informe o 4o número: ")
    leia(n4)
  }
}
