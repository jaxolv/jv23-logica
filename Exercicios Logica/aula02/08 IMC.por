programa {
  funcao inicio() {
    // 8) Escreva um algoritmo que calcule o IMC de uma pessoa e imprima a situa��o em que ela se encontra. Resolva de duas formas:
    // 1) se..ent�o..sen�o. 2) escolha..caso.

    // VAR
    real massa, altura, imc

    // IN�CIO
    escreva("Informe seu peso em kg: ")
    leia(massa)
    escreva("Informe sua altura em metros: ")
    leia(altura)
    imc = massa / (altura * altura)

    escreva("Seu IMC � ", imc, ": ")

    se (imc >= 40) {
      escreva("obesidade m�rbida.")
    } senao se (imc >= 35) {
      escreva("obesidade severa.")
    } senao se (imc >= 30) {
      escreva("obesidade.")
    } senao se (imc >= 25) {
      escreva("sobrepeso.")
    } senao se (imc >= 18.5) {
      escreva("saud�vel.")
    } senao se (imc >= 17) {
      escreva("magreza leve.")
    } senao se (imc >= 16) {
      escreva("magreza moderada.")
    } senao {
      escreva("magreza grave.")
    }

    // FIM DE PROGRAMA
  }
}
