programa {
  funcao inicio() {
    // 4) Escreva um algoritmo que gera e escreve os 4 primeiros n�meros perfeitos. Um n�mero perfeito � aquele que � igual � soma dos seus
    // divisores. Ex: 6 = 1+2+3, 28 = 1+2+4+7+14.

    // VAR
    inteiro n, mod, soma
    
    // IN�CIO
    escreva("Informe um n�mero para descobrirmos se ele � um n�mero perfeito: ")
    leia(n)

    soma = 0

    para (inteiro i = n; i > 0; i--) {
      mod = n % i
      se (mod == 0) {
        soma += i
      }
    }

    se (soma == n * 2) {
      escreva(n, " � um n�mero perfeito.")
    } senao {
      escreva(n, " n�o � um n�mero perfeito.")
    }
  }
}
