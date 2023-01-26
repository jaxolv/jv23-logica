programa {
  // 1) Faça um algoritmo para subtrair dois valores usando procedimentos. Imprima o resultado.
  // VAR
  inteiro num, res

  funcao inteiro par_impar(inteiro x) {
    // PROCEDIMENTO
    res = x % 2
  }

  funcao inicio() {
    // INÍCIO
    escreva("Informe um número inteiro: ")
    leia(num)

    par_impar(num)
    
    se (res == 0 e num != 0) {
      escreva("O número ", num, " é par.")
    } senao se (res == 1) {
      escreva("O número ", num, " é ímpar.")
    } senao {
      escreva("Este número é nulo.")
    }
  }
}
