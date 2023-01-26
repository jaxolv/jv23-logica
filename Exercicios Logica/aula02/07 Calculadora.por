programa {
  funcao inicio() {
    // 7) Crie um algoritmo que simule uma calculadora, ou seja, que permite ao usu�rio escolher a opera��o matem�tica que ele deseja
    // (soma, subtra��o, multiplica��o e divis�o). Ap�s a escolha da opera��o desejada, o resultado deve ser impresso na tela.
    // O usu�rio deve ler dois n�meros para fazer uso da calculadora.

    // VAR
    inteiro n1, n2, num
    real resultado

    // IN�CIO
    escreva("Informe, conforme indicado a seguir, qual opera��o deseja fazer:\n")
    escreva("[1] Soma\n[2] Subtra��o\n[3] Multiplica��o\n[4] Divis�o\n[5] Sair\n")
    leia(num)

    se (num == 5) {
      escreva("Opera��o cancelada.")
    } senao {
      escreva("Informe o primeiro n�mero da opera��o desejada:")
      leia(n1)
      escreva("Informe o segundo n�mero: ")
      leia(n2)

      escolha (num) {
        caso 1:
          resultado = n1 + n2
          escreva("Resultado: ", resultado)
        pare
        caso 2:
          resultado = n1 - n2
          escreva("Resultado: ", resultado)
        pare
        caso 3:
          resultado = n1 * n2
          escreva("Resultado: ", resultado)
        pare
        caso 4:
          resultado = n1 / n2
          escreva("Resultado: ", resultado)
        pare
        caso contrario:
          escreva("Op��o inv�lida.")
      }
    }
    // FIM DE PROGRAMA
  }
}
