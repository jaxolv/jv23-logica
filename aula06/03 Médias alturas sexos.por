programa {
  funcao inicio() {
    // 3) Fa�a um programa que leia um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 5 pessoas.
    // Calcule a maior e a menor altura do grupo;
    // Calcule a m�dia de altura das mulheres e a m�dia de altura dos homens. Imprima os resultados.

    /* 1.8 - M
      2 - M
      1.65 - F
      1.7 - F
      1.75 - F 
      
      RESULTADOS ESPERADOS:
      A maior altura registrada � de 2m.
      A menor altura registrada � de 1.65m.
      A m�dia de altura das pessoas do sexo feminino � de 1.7m.
      A m�dia de altura das pessoas do sexo masculino � de 1.9m. */

    // VAR
    real alturas[5], contF = 0, contM = 0, maior = 0, menor = 0, medF = 0, medM = 0
    caracter sexos[5]

    para (inteiro i = 0; i < 5; i++) {
      escreva("Informe a altura da pessoa:\n")
      leia(alturas[i])
      escreva("Informe o seu sexo:\n[F] Mulher\n[M] Homem\n")
      leia(sexos[i])
      se (sexos[i] == 'F') {
        medF += alturas[i]
        contF++
      } senao se (sexos[i] == 'M') {
        medM += alturas[i]
        contM++
      } senao {
        enquanto (sexos[i] != 'F' e sexos[i] != 'M') {
          escreva("Informe corretamente o sexo da pessoa:\n[F] Mulher\n[M] Homem\n")
          leia(sexos[i])
        }
      }

      se (i == 0) {
        maior = alturas[0]
        menor = alturas[0]
      }

      se (maior < alturas[i]) { maior = alturas[i]}
      se (menor > alturas[i]) { menor = alturas[i]}
    }

    medF /= contF
    medM /= contM

    escreva("A maior altura registrada � de ", maior, "m.\n")
    escreva("A menor altura registrada � de ", menor, "m.\n")
    escreva("A m�dia de altura das pessoas do sexo feminino � de ", medF, "m.\n")
    escreva("A m�dia de altura das pessoas do sexo masculino � de ", medM, "m.\n")
  }
}












