programa {
  funcao inicio() {
    // 2) Faça um Algoritmo que leia um dado número e imprima na tela se este é um número primo ou não.

    // VAR
    inteiro n, c, mod
    
    // INÍCIO
    c = 0

    escreva("Informe qualquer número inteiro para descobrir se ele é primo: ")
    leia(n)

    para (inteiro i = n; i > 0; i--) {
      mod = n % i
      se (mod == 0) { c++ }
    }

    se (c == 2 ou n == 1) {
      escreva("O número ", n, " é primo.")
    } senao {
      escreva("O número ", n, " não é primo.")
    }
  }
}
