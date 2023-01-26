programa {
  // 4: Escreva o algoritmo, usando função, que calcule o fatorial de um número. A definição de fatorial é:
  // F(n) = 1, se n = 0 ou n = 1 F(n) = n.F(n-1), se n>1;
  // onde n é um número inteiro positivo. Uma propriedade (facilmente verificável) dos fatoriais é que: n! = n . (n-1)!
  // Esta propriedade é chamada de propriedade recursiva: o fatorial de um número pode ser calculado através do fatorial de seu antecessor.

  // VAR
  inteiro numero

  funcao inteiro fat(inteiro n) {
    se (n == 0 ou n == 1) {
      n = 1
    } senao {
      para (inteiro i = n; i > 1; i--) {
        n *= (i - 1)
      }
    }
    escreva(n)
  }
    
  funcao inicio() {
    // INÍCIO
    escreva("Informe um número inteiro para descobrirmos seu fatorial: ")
    leia(numero)
    escreva(numero, "! = ")
    fat(numero)
  }
}
