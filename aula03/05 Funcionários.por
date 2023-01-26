programa {
  funcao inicio() {
    // 5) Escreva um algoritmo que leia informações sobre um grupo de 250 pessoas e calcule alguns dados estatísticos.
    // Para cada pessoa do grupo deve leia o nome da pessoa, a altura, o peso e o sexo (“F” para feminino e “M” para o masculino).
    // Calcule e escreva: A quantidade total de homens e mulheres e o percentual de cada. A média de peso das pessoas
    // (somatório dos pesos de todas as pessoas pela quantidade de pessoas).
    // O nome da pessoa mais alta.

    // VAR
    real peso, altura, maiorAltura = 0, somaPeso, mediaPeso
    cadeia nome, nomeAlto = ""
    caracter sexo
    inteiro contF = 0, contM = 0
    
    // INÍCIO
    somaPeso = 0

    para (inteiro i = 0; i < 250; i++) {
      escreva("Informe o nome do(a) funcionário(a): ")
      leia(nome)

      escreva("Informe a altura do(a) funcionário(a); ")
      leia(altura)
      se (altura > maiorAltura) {
        maiorAltura = altura
        nomeAlto = nome
      }

      escreva("Informe o peso do(a) funionário(a): ")
      leia(peso)
      somaPeso += peso

      escreva("Informe, através do caractere respectivo, qual o sexo do(a) funcionário(a): ")
      escreva("\n[F] Mulher\n[M] Homem\n")
      leia(sexo)
      enquanto (sexo != 'F' e sexo != 'M') {
        escreva("Resposta inválida. Tente novamente: ")
        escreva("\n[F] Mulher\n[M] Homem\n")
        leia(sexo)
      }
      se (sexo == 'F') {contF++} senao se (sexo == 'M') {contM++}

      escreva(i+1, " funcionário(s) cadastrado(s).\n")
      escreva("\n")

    }

    

    real percentualF = (contF / (contF + contM)) * 100
    real percentualM = (contM / (contF + contM)) * 100
    escreva("No quadro de funcionários, temos ", contF, " mulheres (", percentualF, "%) e ", contM, " homens (", percentualM, "%).\n")

    real mediaPeso = somaPeso / (contF + contM)
    escreva("A média de peso do quadro de funcionários é de ", mediaPeso, "kg.\n")

    escreva("A última pessoa mais alta do quadro de funcionários registrada se chama ", nomeAlto, ".\n")
  }
}
