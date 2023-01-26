programa {
  // 5) Faça um algoritmo para exibir os 10 primeiros elementos de uma série de Fibonacci usando procedimentos com passagem
  // de parâmetros por referência.

  // VAR
  inteiro res

  funcao inteiro fibonacci(inteiro posicao) {
    inteiro i = 0, s = 1
    inteiro res = s

    para (inteiro c = 0; c < posicao; c++) {
      escreva(i, " -> ")
      s += i
      i = res
      res = s
    }
    escreva(i, ".")
  }
    
  funcao inicio() {
    // INÍCIO
    fibonacci(10)
  }
}
