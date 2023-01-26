programa {
  funcao inicio() {
    // 5) Suponha que a empresa "Google" decidiu conceder um aumento de salários a seus funcionários de acordo com a tabela ao lado. Escreva
    // um algoritmo que lê, para cada funcionário, o seu nome e o seu salário atual. Após receber estes dados, o algoritmo calcula o novo
    // salário e escreve na tela as seguintes informações: <% de aumento> <salario atual> <salario novo>

    // VAR
    real novo, atual, aumento
    cadeia nome

    // INÍCIO
    escreva("Informe seu nome: ")
    leia(nome)
    escreva("Informe seu salário: ")
    leia(atual)

    novo = atual

    se (atual > 0 e atual < 4000) {
      novo += atual * 0.2
    } senao se (atual >= 4000 e atual < 7000 ) {
      novo += atual * 0.15
    } senao se (atual >= 7000 e atual < 10000 ) {
      novo += atual * 0.12
    } senao se (atual >= 10000 e atual < 12000 ) {
      novo += atual * 0.10
    } senao se (atual >= 12000 e atual < 16000 ) {
      novo += atual * 0.07
    }

    escreva(nome, ", seu novo salário será de R$ ", novo, ")

    // FIM DE PROGRAMA
  }
}
