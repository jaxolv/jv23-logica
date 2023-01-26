programa {
  funcao inicio() {
    // 8) Um determinado material radioativo perde metade de sua massa a cada 50 segundos. Dada a massa inicial, em gramas, fazer um programa
    // que determine o tempo necessário para que essa massa se torne menor que 0,5 grama. Escreva a massa inicial, a massa final e o tempo
    // calculado em horas, minutos e segundos.

    // 5000000000000000000000000000000000000000

    // VAR
    real mI, mF
    inteiro segundos = 0, minutos = 0, horas = 0
    
    // INÍCIO
    escreva("Informe o valor da massa inicial: ")
    leia(mI)
    mF = mI

    enquanto (mF > 0.5) {
      mF /= 2
      segundos += 50
    }

    se (segundos > 60) {
      minutos = segundos / 60
      segundos = segundos % 60

      se (minutos > 60) {
        horas = minutos / 60
        minutos = minutos - (horas * 60)
        escreva(horas, " hora(s), " minutos, " minuto(s) e ")
      }

      escreva(minutos, " minuto(s) e ")
    }

    escreva(segundos, " segundo(s).")
  }
}
