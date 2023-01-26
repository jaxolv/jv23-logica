programa {
  funcao inicio() {
    // 10) Fa�a um programa que receba as informa��es de produtos:
    // O pre�o,
    // A categoria (1 � limpeza; 2 � alimenta��o; ou 3 � vestu�rio),
    // A situa��o (R � produtos que necessitam de refrigera��o; e N � produtos que n�o necessitam de refrigera��o).
    // Em caso de pre�o <= R$ 25, aumento ser� de: 1 - 5%, 2 - 8% e 3 - 10%
    // Em caso de pre�o > R$ 25, aumento ser� de: 1 - 12%, 2 - 15% e 3 - 18%
    // Calcule o "Pre�o com desconto" de acordo com a seguinte regra:
    // O produto que preencher pelo menos um dos seguintes requisitos ter� um desconto equivalente a 5% do pre�o; caso contr�rio,
    // ter� um desconto de 8%. Os requisitos s�o: Categoria: 2, Situa��o: R

    // VAR
    real preco, aumento, desconto
    inteiro categoria
    caracter situacao

    // IN�CIO
    escreva("Informe o pre�o do produto: ")
    leia(preco)
    escreva("Informe a categoria do produto: \n")
    escreva("[1] Limpeza\n[2] Alimenta��o\n[3] Vestu�rio\n")
    leia(categoria)
    escreva("Informe a situa��o do produto: \n")
    escreva("[R] Produtos que necessitam de refrigera��o\n[N] Produtos que n�o necessitam de refrigera��o\n")
    leia(situacao)

    aumento = preco
    desconto = preco

    se (preco > 25) {
      escolha (categoria) {
        caso 1:
          aumento += preco * 0.12
        pare

        caso 2:
          aumento += preco * 0.15
        pare

        caso 3:
          aumento += preco * 0.18
        pare

        caso contrario:
          escreva("Valor n�o informado")
      }
    } senao {
      escolha (categoria) {
        caso 1:
          aumento += preco * 0.05
        pare

        caso 2:
          aumento += preco * 0.08
        pare

        caso 3:
          aumento += preco * 0.10
        pare

        caso contrario:
          escreva("Valor n�o informado")
      }
    }

    escreva("Pre�o com aumento: R$ ", aumento, "\n")

    se ( (nao(categoria == 2) e situacao == "R") ou (categoria == 2 e nao(situacao == "R") ) ) {
      desconto *= 0.95
    } senao se (categoria == 2 e situacao == "R") {
      desconto *= 0.92
    }

    escreva("Pre�o com desconto: R$ ", desconto, "\n")
  }
}
