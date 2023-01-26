programa {
  funcao inicio() {
    // 1) Faça um Algoritmo que calcule o fatorial de um número qualquer. O usuário deve digitar o número no qual ele deseja obter o
    // resultado do fatorial na tela. Repita este processo até que o usuário não tenha mais interesse em obter cálculo de fatorial.

    // VAR
    caracter parar
    inteiro fat, n
    
    // INÍCIO
    parar = 'S'

    enquanto (parar != 'N') {
      escreva("Informe o número do qual deseja saber seu fatorial:\n")
      leia(fat)

      escreva("O fatorial de ", fat, " é ")

      para (inteiro i = fat; i > 1; i--) {
        fat *= (i - 1)
      }

      escreva(fat, "\n")

      escreva("Deseja informar outro número?\n[S] Sim\n[N] Não\n")
      leia(parar)
    }

    escreva("Até mais!")
  }
}
