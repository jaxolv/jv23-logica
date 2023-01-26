programa {
  funcao inicio() {
    inteiro jogadas = 0, x, y, xaux, yaux
    caracter tabuleiro[3][3] = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}}
    caracter vencedor = ' '

    enquanto (jogadas < 8) {
      // PEÇA X:
      escreva("Informe a posição para X:\n")
      escreva("LIN: ")
      leia(x)
      escreva("COL: ")
      leia(y)

      // AVALIANDO SE A POSIÇÃO INFORMADA JÁ ESTÁ OCUPADA:
      se (tabuleiro[x][y]=='X' ou tabuleiro[x][y]=='O') {
        xaux = x
        yaux = y
        faca {
          escreva("Esta posição já foi ocupada. Tente novamente: ")
          escreva("LIN: ")
          leia(x)
          escreva("COL: ")
          leia(y)
        } enquanto (xaux==x e yaux==y)
      }
      tabuleiro[x][y] = 'X'

      // EXIBINDO TABULEIRO:
      para (inteiro i = 0; i < 3; i++) {
        para (inteiro j = 0; j < 3; j++) {
          escreva("[", tabuleiro[i][j], "]")
        }
        escreva("\n")
      }

      // ANALISANDO POSSÍVEL VITÓRIA DO JOGADOR X:
      para (inteiro i = 0; i < 3; i++) {
        para (inteiro j = 0; j < 3; j++) {
          se ((tabuleiro[i][0]=='X') e (tabuleiro[i][1]=='X') e (tabuleiro[i][2]=='X')) {
            jogadas = 9
            vencedor = 'X'
          }
          se ((tabuleiro[0][j]=='X') e (tabuleiro[1][j]=='X') e (tabuleiro[2][j]=='X')) {
            jogadas = 9
            vencedor = 'X'
          }
          se ((tabuleiro[0][0]=='X') e (tabuleiro[1][1]=='X') e (tabuleiro[2][2]=='X')) {
            jogadas = 9
            vencedor = 'X'
          }
          se ((tabuleiro[0][2]=='X') e (tabuleiro[1][1]=='X') e (tabuleiro[2][0]=='X')) {
            jogadas = 9
            vencedor = 'X'
          }
        }
      }
      
      // EM CASO DE NÃO VITÓRIA, A JOGADA É CONTADA:
      jogadas++

      escreva("Informe a posição para O:\n")
      escreva("LIN: ")
      leia(x)
      escreva("COL: ")
      leia(y)
      tabuleiro[x][y] = 'O'

      para (inteiro i = 0; i < 3; i++) {
        para (inteiro j = 0; j < 3; j++) {
          escreva("[", tabuleiro[i][j], "]")
        }
        escreva("\n")
      }

      jogadas++

      para (inteiro i = 0; i < 3; i++) {
        para (inteiro j = 0; j < 3; j++) {
          se ((tabuleiro[i][0]=='O') e (tabuleiro[i][1]=='O') e (tabuleiro[i][2]=='O')) {
            jogadas = 9
            vencedor = 'O'
          }
          se ((tabuleiro[0][j]=='O') e (tabuleiro[1][j]=='O') e (tabuleiro[2][j]=='O')) {
            jogadas = 9
            vencedor = 'O'
          }
          se ((tabuleiro[0][0]=='O') e (tabuleiro[1][1]=='O') e (tabuleiro[2][2]=='O')) {
            jogadas = 9
            vencedor = 'O'
          }
          se ((tabuleiro[0][2]=='O') e (tabuleiro[1][1]=='O') e (tabuleiro[2][0]=='O')) {
            jogadas = 9
            vencedor = 'O'
          }
        }
      }
    }

    se (vencedor == 'X') {
      escreva("Fim de jogo! Jogador X venceu!") 
    } senao se (vencedor == 'O') {
      escreva("Fim de jogo! Jogador O venceu")
    } senao {
      escreva("O jogo acabou empatado. Comecem novamente!")
    }
  }
}
