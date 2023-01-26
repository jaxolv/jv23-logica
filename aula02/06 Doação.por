programa {
  funcao inicio() {
    // 6) Escreva o algoritmo "Programa Solid�rio". O doador deve clicar nas op��es (mostradas abaixo) para efetuar a sua doa��o. Imprima o
    // resultado na tela com o valor da doa��o e uma mensagem de agradecimento. Utilize a estrutura Escolha...Caso.
    // [1] para doar R$10
    // [2] para doar R$25
    // [3] para doar R$50
    // [4] para doar outros valores
    // [5] para cancelar (Por favor, n�o cancele! Pense nas criancinhas!)

    // VAR
    inteiro num
    real valor

    // IN�CIO
    escreva("Bem-vindo ao Programa Solid�rio\nInforme abaixo o valor que deseja doar: ")
    escreva("[1] para doar R$10\n[2] para doar R$25\n[3] para doar R$50\n[4] para doar outros valores\n[5] para cancelar\n")
    leia(num)

    escolha (num) {
      caso 1:
        escreva("Doa��o no valor de R$ 10,00 realizada.")
      pare
      caso 2:
        escreva("Doa��o no valor de R$ 25,00 realizada.")
      pare
      caso 3:
        escreva("Doa��o no valor de R$ 50,00 realizada.")
      pare
      caso 4:
        escreva("Informe o valor que deseja doar: ")
        leia(valor)
        escreva("Doa��o no valor de R$ ", valor ," realizada.")
      pare
      caso 5:
        escreva("Pense nas criancinhas, SEU MONSTRO! :(")
      pare
    }

    escreva("\nObrigado pela visita.")

    // FIM DE PROGRAMA
  }
}
