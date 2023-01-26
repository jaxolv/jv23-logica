programa {
  // 4: Escreva o algoritmo, usando fun��o, que calcule o fatorial de um n�mero. A defini��o de fatorial �:
  // F(n) = 1, se n = 0 ou n = 1 F(n) = n.F(n-1), se n>1;
  // onde n � um n�mero inteiro positivo. Uma propriedade (facilmente verific�vel) dos fatoriais � que: n! = n . (n-1)!
  // Esta propriedade � chamada de propriedade recursiva: o fatorial de um n�mero pode ser calculado atrav�s do fatorial de seu antecessor.

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
    // IN�CIO
    escreva("Informe um n�mero inteiro para descobrirmos seu fatorial: ")
    leia(numero)
    escreva(numero, "! = ")
    fat(numero)
  }
}
