programa {
  funcao inicio() {
    // 3) Fa�a um algoritmo que receba o valor do sal�rio de uma pessoa e o valor de um financiamento pretendido. Caso o financiamento seja
    // menor ou igual a 5 vezes o sal�rio da pessoa, o algoritmo dever� escrever "Financiamento Concedido"; sen�o, ele dever� escrever
    // "Financiamento Negado". Independente de conceder ou n�o o financiamento, o algoritmo escrever� depois a frase "Obrigado por nos consultar."

    // VAR
    real salario, financ

    // IN�CIO
    escreva("Informe a seguir o seu sal�rio: ")
    leia(salario)
    escreva("Informe a seguir o valor do financiamento que deseja fazer: ")
    leia(financ)

    se (financ <= 5 * salario) {
      escreva("\nFinanciamento Concedido\n")
    } senao {
      escreva("\nFinanciamento Negado\n")
    }

    escreva("Obrigado por nos consultar.")
  }
}
