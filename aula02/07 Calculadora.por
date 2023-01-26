programa {
  funcao inicio() {
    // 7) Crie um algoritmo que simule uma calculadora, ou seja, que permite ao usuário escolher a operação matemática que ele deseja
    // (soma, subtração, multiplicação e divisão). Após a escolha da operação desejada, o resultado deve ser impresso na tela.
    // O usuário deve ler dois números para fazer uso da calculadora.

    // VAR
    inteiro n1, n2, num
    real resultado

    // INÍCIO
    escreva("Informe, conforme indicado a seguir, qual operação deseja fazer:\n")
    escreva("[1] Soma\n[2] Subtração\n[3] Multiplicação\n[4] Divisão\n[5] Sair\n")
    leia(num)

    se (num == 5) {
      escreva("Operação cancelada.")
    } senao {
      escreva("Informe o primeiro número da operação desejada:")
      leia(n1)
      escreva("Informe o segundo número: ")
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
          escreva("Opção inválida.")
      }
    }
    // FIM DE PROGRAMA
  }
}
