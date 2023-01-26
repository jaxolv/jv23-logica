programa {
  // 1) Faça um algoritmo para subtrair dois valores usando procedimentos. Imprima o resultado.
  // VAR
  inteiro a, b, res

  funcao inteiro subtrair(inteiro x, inteiro y) {
    // PROCEDIMENTO
    res = x - y
  }

  funcao inicio() {
    // INÍCIO
    escreva("Informe o primeiro número inteiro: ")
    leia(a)
    escreva("Informe o segundo número inteiro: ")
    leia(b)

    subtrair(a, b)
    escreva(a, " - ", b, " = ", res)
  }
}
