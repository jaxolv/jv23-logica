programa {
  funcao inicio() {
    // 5) Suponha que a empresa "Google" decidiu conceder um aumento de sal�rios a seus funcion�rios de acordo com a tabela ao lado. Escreva
    // um algoritmo que l�, para cada funcion�rio, o seu nome e o seu sal�rio atual. Ap�s receber estes dados, o algoritmo calcula o novo
    // sal�rio e escreve na tela as seguintes informa��es: <% de aumento> <salario atual> <salario novo>

    // VAR
    real novo, atual, aumento
    cadeia nome

    // IN�CIO
    escreva("Informe seu nome: ")
    leia(nome)
    escreva("Informe seu sal�rio: ")
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

    escreva(nome, ", seu novo sal�rio ser� de R$ ", novo, ")

    // FIM DE PROGRAMA
  }
}
