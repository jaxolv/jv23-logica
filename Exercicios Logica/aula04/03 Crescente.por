programa {
  // 3) Fa�a um programa que leia 4 n�meros e em seguida imprima o resultado em ordem crescente.
  // Use o conceito de Procedimento para desenvolver o c�digo.

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
    // IN�CIO
    escreva("Informe o 1o n�mero: ")
    leia(n1)
    escreva("Informe o 2o n�mero: ")
    leia(n2)
    escreva("Informe o 3o n�mero: ")
    leia(n3)
    escreva("Informe o 4o n�mero: ")
    leia(n4)
  }
}
