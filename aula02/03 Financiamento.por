programa {
  funcao inicio() {
    // 3) Faça um algoritmo que receba o valor do salário de uma pessoa e o valor de um financiamento pretendido. Caso o financiamento seja
    // menor ou igual a 5 vezes o salário da pessoa, o algoritmo deverá escrever "Financiamento Concedido"; senão, ele deverá escrever
    // "Financiamento Negado". Independente de conceder ou não o financiamento, o algoritmo escreverá depois a frase "Obrigado por nos consultar."

    // VAR
    real salario, financ

    // INÍCIO
    escreva("Informe a seguir o seu salário: ")
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
