programa {
  funcao inicio() {
    // 1) Fa�a um Algoritmo que calcule o fatorial de um n�mero qualquer. O usu�rio deve digitar o n�mero no qual ele deseja obter o
    // resultado do fatorial na tela. Repita este processo at� que o usu�rio n�o tenha mais interesse em obter c�lculo de fatorial.

    // VAR
    caracter parar
    inteiro fat, n
    
    // IN�CIO
    parar = 'S'

    enquanto (parar != 'N') {
      escreva("Informe o n�mero do qual deseja saber seu fatorial:\n")
      leia(fat)

      escreva("O fatorial de ", fat, " � ")

      para (inteiro i = fat; i > 1; i--) {
        fat *= (i - 1)
      }

      escreva(fat, "\n")

      escreva("Deseja informar outro n�mero?\n[S] Sim\n[N] N�o\n")
      leia(parar)
    }

    escreva("At� mais!")
  }
}
