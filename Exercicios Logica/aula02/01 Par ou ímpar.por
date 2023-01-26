programa {
  funcao inicio() {
    // 1) Crie um algoritmo que lê um dado número e decida se ele é par ou ímpar. Imprima o resultado.

    // VAR
    inteiro num

    // INÍCIO
    escreva("Informe a seguir um número inteiro: ")
    leia(num)
    se (num != 0) {
      se (num % 2 == 0) {
        escreva("O número ", num, " é par.")
      } senao {
        escreva("O número ", num, " é ímpar.")
      }
    } senao {
      escreva("Este número é nulo.")
    }
  }
}
