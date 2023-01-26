programa {
  funcao inicio() {
    // 10) Faça um programa que receba as informações de produtos:
    // O preço,
    // A categoria (1 – limpeza; 2 – alimentação; ou 3 – vestuário),
    // A situação (R – produtos que necessitam de refrigeração; e N – produtos que não necessitam de refrigeração).
    // Em caso de preço <= R$ 25, aumento será de: 1 - 5%, 2 - 8% e 3 - 10%
    // Em caso de preço > R$ 25, aumento será de: 1 - 12%, 2 - 15% e 3 - 18%
    // Calcule o "Preço com desconto" de acordo com a seguinte regra:
    // O produto que preencher pelo menos um dos seguintes requisitos terá um desconto equivalente a 5% do preço; caso contrário,
    // terá um desconto de 8%. Os requisitos são: Categoria: 2, Situação: R

    // VAR
    real preco, aumento, desconto
    inteiro categoria
    caracter situacao

    // INÍCIO
    escreva("Informe o preço do produto: ")
    leia(preco)
    escreva("Informe a categoria do produto: \n")
    escreva("[1] Limpeza\n[2] Alimentação\n[3] Vestuário\n")
    leia(categoria)
    escreva("Informe a situação do produto: \n")
    escreva("[R] Produtos que necessitam de refrigeração\n[N] Produtos que não necessitam de refrigeração\n")
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
          escreva("Valor não informado")
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
          escreva("Valor não informado")
      }
    }

    escreva("Preço com aumento: R$ ", aumento, "\n")

    se ( (nao(categoria == 2) e situacao == "R") ou (categoria == 2 e nao(situacao == "R") ) ) {
      desconto *= 0.95
    } senao se (categoria == 2 e situacao == "R") {
      desconto *= 0.92
    }

    escreva("Preço com desconto: R$ ", desconto, "\n")
  }
}
