programa {
  funcao inicio() {
    // 4) Escreva um algoritmo que gera e escreve os 4 primeiros números perfeitos. Um número perfeito é aquele que é igual à soma dos seus
    // divisores. Ex: 6 = 1+2+3, 28 = 1+2+4+7+14.

    // VAR
    inteiro n, mod, soma
    
    // INÍCIO
    escreva("Informe um número para descobrirmos se ele é um número perfeito: ")
    leia(n)

    soma = 0

    para (inteiro i = n; i > 0; i--) {
      mod = n % i
      se (mod == 0) {
        soma += i
      }
    }

    se (soma == n * 2) {
      escreva(n, " é um número perfeito.")
    } senao {
      escreva(n, " não é um número perfeito.")
    }
  }
}
