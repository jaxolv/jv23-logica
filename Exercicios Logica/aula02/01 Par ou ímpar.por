programa {
  funcao inicio() {
    // 1) Crie um algoritmo que l� um dado n�mero e decida se ele � par ou �mpar. Imprima o resultado.

    // VAR
    inteiro num

    // IN�CIO
    escreva("Informe a seguir um n�mero inteiro: ")
    leia(num)
    se (num != 0) {
      se (num % 2 == 0) {
        escreva("O n�mero ", num, " � par.")
      } senao {
        escreva("O n�mero ", num, " � �mpar.")
      }
    } senao {
      escreva("Este n�mero � nulo.")
    }
  }
}
