programa {
  funcao inicio() {
    // 9) Faça um programa que lê 4 valores I, A, B e C onde I é um número inteiro e positivo e A, B, e C são quaisquer valores reais.
    // O programa deve escrever os valores lidos e:
    // se I = 1, escrever os três valores A, B e C em ordem crescente;
    // se I = 2, escrever os três valores A, B e C em ordem decrescente;
    // se I = 3, escrever os três valores A, B, e C de forma que o maior valor fique entre os outros dois;
    // se I não for um dos três valores acima, dar uma mensagem indicando este comportamento.

    // VAR
    inteiro num
    real a, b, c, max, min, mid

    // INÍCIO
    escreva("Informe um valor para A: ")
    leia(a)
    escreva("Informe um valor para B: ")
    leia(b)
    escreva("Informe um valor para C: ")
    leia(c)

    max = a
    se (max < b) { max = b }
    se (max < c) { max = c }

    min = a
    se (min > b) { min = b }
    se (min > c) { min = c }

    se ((max == a e min == b) ou (min == a e max == b)) { mid = c }
    se ((max == b e min == c) ou (min == b e max == c)) { mid = a }
    se ((max == a e min == c) ou (max == c e min == a)) { mid = b }

    escreva("Escolha um número para ordenar os números digitados:\n")
    escreva("[1] Ordem crescente\n[2] Ordem decrescente\n[3] O maior entre os demais\n")
    leia(num)

    escolha (num) {
      caso 2:
        escreva(max, ", ", mid, ", ", min)
      pare

      caso 1:
        escreva(min, ", ", mid, ", ", max)
      pare

      caso 3:
        escreva(mid, ", ", max, ", ", min)
      pare

      caso contrario:
        escreva("Opção inválida.")
    }
  }
}
