programa {
  // 7: Fa�a um algoritmo para preencher uma matriz de quarta ordem e mostre na tela:
  // - Os elementos da diagonal principal;
  // - Os elementos do triangulo superior - Os elementos do triangulo inferior
  // - A matriz completa;

  // VAR
  inteiro matriz[4][4], principal[4], superior[6], inferior[6], posicaoSuperior = 0, posicaoInferior = 0

  funcao inicio() {
    escreva("Digite n�meros inteiros aleat�rios:\n")
    para (inteiro i = 0; i < 4; i++) {
      para (inteiro j = 0; j < 4; j++) {
        leia(matriz[i][j])
      }
    }

    escreva("\nMatriz completa:\n")
    para (inteiro i = 0; i < 4; i++) {
      para (inteiro j = 0; j < 4; j++) {
        se (i == j) { principal[i] = matriz[i][j] }

        se (j > i) {
          superior[posicaoSuperior] = matriz[i][j]
          posicaoSuperior++
        }

        se ( i > j) {
          inferior[posicaoInferior] = matriz[i][j]
          posicaoInferior++
        }

        se (matriz[i][j] < 10) { escreva("[ ", matriz[i][j], "]")) } senao { escreva("[", matriz[i][j], "]")) }
      }
      escreva("\n")
    }

    escreva("Elementos da diagonal principal: ", principal, "\n")
    escreva("Elementos do tri�ngulo superior: ", superior, "\n")
    escreva("Elementos do tri�ngulo inferior: ", inferior, "\n")
    
  }
}
