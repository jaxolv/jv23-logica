programa {
  funcao inicio() {
    // 7) Um funcionário de uma empresa recebe, anualmente, aumento salarial. Sabe-se que:
    // a) esse funcionário foi contratado em 2010, com salário inicial de R$2.000,00;
    // b) Em 2011, ele recebeu aumento de 1,5%, sobre o seu salário inicial;
    // c) A partir de 2012 (inclusive), os aumentos salariais sempre corresponderam ao dobro do percentual do ano anterior.
    // Faça um programa que determine o salário desse funcionário dos anos de 2010 ao ano atual(2022). Apresente todos os valores.

    // VAR
    real sal = 2000, perc = 1.5 / 100
    inteiro ano = 2010
    
    // INÍCIO
    para (inteiro i = 2010; i <= 2022; i++) {
      escreva("Em ", i, " este funcionário ganhava R$ ", sal, ".\n")
      sal += sal * perc
      perc *= 2
    }
  }
}
