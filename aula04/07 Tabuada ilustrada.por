programa {
  // 7) Escreva um programa que l� um valor inteiro (maior ou igual a 1 e menor ou igual a 10) e exibe a tabuada (at� 10) de multiplica��o
  // do n�mero lido. --> Funcao LeNumero(n1,n2:inteiro);

  // VAR
  inteiro numero

  funcao inteiro tabuada(inteiro num) {
    se (num < 1 ou num > 10) {
      escreva("Execute o programa novamente informando apenas um n�mero inteiro maior ou igual a 1 e menor ou igual a 10.\n")
    } senao {
      para (inteiro i = 1; i <= 10; i++) { escreva(num, " * ", i, " = ", num * i, "\n") }
    }
  }

  funcao inicio() {
    // IN�CIO
    escreva("Informe um n�mero para realizar a sua tabuada: ")
    leia(numero)
    tabuada(numero)
  }
}
