programa {
  funcao inicio() {
    // 2) Escreva um programa que leia um número inteiro. Se o número lido for positivo, escreva uma mensagem indicando se ele é par ou ímpar.
    // Se o número for negativo, escreva a seguinte mensagem “Este número não é positivo”.

    // VAR
    inteiro num

    // INÍCIO
    escreva("Informe a seguir um número inteiro: ")
    leia(num)
    se (num >= 0) {
      se (num % 2 == 0) {
        escreva("O número ", num, " é par.")
      } senao {
        escreva("O número ", num, " é ímpar.")
      }
    } senao {
      escreva("Este número não é positivo.")
    }
  }
}
