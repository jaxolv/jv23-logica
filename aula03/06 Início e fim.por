programa {
  funcao inicio() {
    // 6) Fa�a um algoritmo que gere uma contagem inteligente. O programa deve ler dois n�meros (inicial e final). Caso o n�mero inicial
    // seja maior que o final, escreva os n�meros intermedi�rios em ordem decrescente. Mas se o n�mero inicial for menor que o final,
    // escreva os n�meros intermedi�rios em ordem crescente. Imprima o resultado.

    // VAR
    inteiro a, b
    
    // IN�CIO
    escreva("Informe um primeiro n�mero inteiro: ")
    leia(a)
    escreva("Informe um segundo n�mero inteiro: ")
    leia(b)

    se (a < b) {
      para (inteiro i = a; i < b; i++) {
        escreva(i, ", ")
      }
      escreva(b, ".")
    }

    se (a > b) {
      para (inteiro i = a; i > b; i--) {
        escreva(i, ", ")
      }
      escreva(b, ".")
    }
  }
}
