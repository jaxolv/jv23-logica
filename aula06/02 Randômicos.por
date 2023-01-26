programa {
  funcao inicio() {
    // 2) Construa um algoritmo que leia 50 valores inteiros e positivos de forma randômica e faça as seguintes tarefas:
    // Encontre o maior valor; encontre o menor valor; Calcule a média dos números lidos.

    // VAR
    inteiro aleatorios[50], cont = 0
    real media = 0

    escreva("Informe quaisquer números inteiros que desejar:\n")
    para (inteiro i = 0; i < 50; i++) {
      leia(aleatorios[i])
      media += aleatorios[i]
      cont++
    }

    media /= cont

    escreva("A média de todos os ", cont," números digitados é ", media, ".")
  }
}
