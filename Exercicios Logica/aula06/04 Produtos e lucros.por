programa {
  /* 4) Imagine que você tenha um comércio local e esteja totalmente perdido sobre as contas do negócio. Sendo assim resolve fazer um
  programa que realiza o levantamento sobre os produtos. Para isto, escreve um programa que lê cada mercadoria com o nome, preço de
  compra e preço de venda. Tendo em mãos o código, determine e escreva quantas mercadorias proporcionam:
  • Lucro menor 10%;
  • Lucro entre 10% e 20%;
  • Lucro maior que 20%.
  • O valor total de compra e de venda de todas as mercadorias.
  • O lucro total.*/

  /*           0            1           2
  Produto1: 0 [valorCompra][valorVenda][lucro]
  Produto2: 1 [valorCompra][valorVenda][lucro]
  Produto3: 2 [valorCompra][valorVenda][lucro]
  ProdutoX: Y [valorCompra][valorVenda][lucro]
  */

  // VAR
  cadeia produtos[3]
  real totalCompra = 0, totalVenda = 0
  inteiro contagem = 0
  inteiro n

  funcao inicio() {
    /*NOME / VALOR DE COMPRA / VALOR DE VENDA*/
    escreva("Quantos produtos serão cadastrados? ")
    leia(n)

    real valores[n][3]
    // 0 - valor de compra, 1 - valor de venda, 2 - percentual de lucro

    para (inteiro i = 0; i < n; i++) {
      escreva("Informe o nome do produto: ")
      leia(produtos[i])
      escreva("Informe o valor de compra do produto: ")
      leia(valores[i][0])
      escreva("Informe o valor de venda do produto: ")
      leia(valores[i][1])
      valores[i][2] = 100 - ((valores[i][0] / valores[i][1]) * 100)
    }

    escreva("Produtos com menos que 10% de lucro:\n")
    para (inteiro i = 0; i < n; i++) {
      se (valores[i][2] < 10) {
        escreva("- ", produtos[i], "\n")
        contagem++
      }
    }

    se (contagem == 0) {
      escreva("- Não há produtos nesta categoria.\n")
    }

    contagem = 0
    escreva("Produtos entre 10% e 20% de lucro:\n")
    para (inteiro i = 0; i < n; i++) {
      se (valores[i][2] >= 10 e valores[i][2] <= 20) {
        escreva("- ", produtos[i], "\n")
        contagem++
      }
    }
    se (contagem == 0) {
      escreva("- Não há produtos nesta categoria.\n")
    }

    contagem = 0
    escreva("Produtos com mais que 20% de lucro:\n")
    para (inteiro i = 0; i < n; i++) {
      se (valores[i][2] > 20) {
        escreva("- ", produtos[i], "\n")
        contagem++
      }
    }
    se (contagem == 0) {
      escreva("- Não há produtos nesta categoria.\n")
    }

    para (inteiro i = 0; i < n; i++) {
      totalCompra += produtos[i][0]
    }

    para (inteiro i = 0; i < n; i++) {
      totalVenda += produtos[i][1]
    }

    escreva("O total das compras é de R$ ", totalCompra)
    escreva("O total das vendas é de R$ ", totalVenda)
  }
}
