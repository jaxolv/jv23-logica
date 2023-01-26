programa {
  funcao inicio() {
    // 6) Faça um algoritmo que gere uma contagem inteligente. O programa deve ler dois números (inicial e final). Caso o número inicial
    // seja maior que o final, escreva os números intermediários em ordem decrescente. Mas se o número inicial for menor que o final,
    // escreva os números intermediários em ordem crescente. Imprima o resultado.

    // VAR
    inteiro a, b
    
    // INÍCIO
    escreva("Informe um primeiro número inteiro: ")
    leia(a)
    escreva("Informe um segundo número inteiro: ")
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
