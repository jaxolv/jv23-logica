programa {
  funcao inicio() {
    // 2) Escreva um programa que leia um n�mero inteiro. Se o n�mero lido for positivo, escreva uma mensagem indicando se ele � par ou �mpar.
    // Se o n�mero for negativo, escreva a seguinte mensagem �Este n�mero n�o � positivo�.

    // VAR
    inteiro num

    // IN�CIO
    escreva("Informe a seguir um n�mero inteiro: ")
    leia(num)
    se (num >= 0) {
      se (num % 2 == 0) {
        escreva("O n�mero ", num, " � par.")
      } senao {
        escreva("O n�mero ", num, " � �mpar.")
      }
    } senao {
      escreva("Este n�mero n�o � positivo.")
    }
  }
}
