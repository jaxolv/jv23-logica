programa {
  // 1) Fa�a um algoritmo para subtrair dois valores usando procedimentos. Imprima o resultado.
  // VAR
  inteiro a, b, res

  funcao inteiro subtrair(inteiro x, inteiro y) {
    // PROCEDIMENTO
    res = x - y
  }

  funcao inicio() {
    // IN�CIO
    escreva("Informe o primeiro n�mero inteiro: ")
    leia(a)
    escreva("Informe o segundo n�mero inteiro: ")
    leia(b)

    subtrair(a, b)
    escreva(a, " - ", b, " = ", res)
  }
}
