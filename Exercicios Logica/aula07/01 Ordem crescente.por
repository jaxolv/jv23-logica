programa {
  funcao inicio() {
    /* 1) Crie um algoritmo para ordenar um vetor de tamanho 10. Leia todos os valores e depois coloque em ordem crescente. */

    inteiro v[10] = {7, 3, 6, 1, 0, 9, 5, 2, 4, 8}, aux
    escreva(v, "\n")

    para (inteiro j = 0; j < 10; j++) {
      para (inteiro i = 1; i < 10; i++) {
        aux = v[i]
        enquanto (v[i] < v[i-1]) {
          v[i] = v[i-1]
          v[i-1] = aux
        }
      }
    }

    escreva(v)
  }
}
