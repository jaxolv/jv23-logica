programa {
  // 1) Fa�a um algoritmo para subtrair dois valores usando procedimentos. Imprima o resultado.
  // VAR
  inteiro num, res

  funcao inteiro par_impar(inteiro x) {
    // PROCEDIMENTO
    res = x % 2
  }

  funcao inicio() {
    // IN�CIO
    escreva("Informe um n�mero inteiro: ")
    leia(num)

    par_impar(num)
    
    se (res == 0 e num != 0) {
      escreva("O n�mero ", num, " � par.")
    } senao se (res == 1) {
      escreva("O n�mero ", num, " � �mpar.")
    } senao {
      escreva("Este n�mero � nulo.")
    }
  }
}
