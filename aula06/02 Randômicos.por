programa {
  funcao inicio() {
    // 2) Construa um algoritmo que leia 50 valores inteiros e positivos de forma rand�mica e fa�a as seguintes tarefas:
    // Encontre o maior valor; encontre o menor valor; Calcule a m�dia dos n�meros lidos.

    // VAR
    inteiro aleatorios[50], cont = 0
    real media = 0

    escreva("Informe quaisquer n�meros inteiros que desejar:\n")
    para (inteiro i = 0; i < 50; i++) {
      leia(aleatorios[i])
      media += aleatorios[i]
      cont++
    }

    media /= cont

    escreva("A m�dia de todos os ", cont," n�meros digitados � ", media, ".")
  }
}
