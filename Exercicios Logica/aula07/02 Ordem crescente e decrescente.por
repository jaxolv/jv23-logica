programa {
  funcao inicio() {
    /* 2) Escreva um algoritmo que leia um vetor com 8 valores numéricos positivos e negativos. Ordene esses números de forma crescente
    e de forma decrescente. Imprima o seguinte resultado:
    a) Vetor digitado
    b) Vetor em ordem Crescente
    c) Vetor em ordem decrescente. */

    inteiro v[8], vc[8], vd[8], aux

    escreva("Digite 8 números inteiros, entre positivos e negativos:\n")
    para (inteiro i = 0; i < 8; i++) {
      leia(v[i])
      vc[i] = v[i]
      vd[i] = v[i]
    }

    para (inteiro j = 0; j < 8; j++) {
      para (inteiro i = 1; i < 8; i++) {
        aux = vc[i]
        enquanto (vc[i] < vc[i-1]) {
          vc[i] = vc[i-1]
          vc[i-1] = aux
        }
      }
    }

    para (inteiro j = 0; j < 8; j++) {
      para (inteiro i = 1; i < 8; i++) {
        aux = vd[i]
        enquanto (vd[i] > vd[i-1]) {
          vd[i] = vd[i-1]
          vd[i-1] = aux
        }
      }
    }

    escreva("Vetor original: {", v, "}\n")
    escreva("Vetor em ordem crescente: {", vc, "}\n")
    escreva("Vetor em ordem decrescente: {", vd, "}\n")
  }
}
