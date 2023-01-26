package exercicio02;

import java.util.Locale;
import java.util.Scanner;

/* Suponha que uma dada empresa trabalha com a venda de produtos que precisam ser organizados através de dados como preços e etc.
 * Crie um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final, mostre a etiqueta de preço de cada
   produto na mesma ordem em que foram digitados. Todo produto possui nome e preço. Produtos importados possuem uma taxa de
   alfândega, e produtos usados possuem data de fabricação.
 * Estes dados específicos devem ser acrescentados na etiqueta de preço conforme exemplo. Para produtos importados, a taxa e
   alfândega deve ser acrescentada ao preço final do produto. Implementar o programa conforme especificado abaixo:
 * SuperClass: Produto: - nome, - preco; + etiquetaPreco();
 * SubClass 1: ProdutoImportado: - taxaAlfandega; + precoTotal(), + etiquetaPreco();
 * SubClass 2: ProdutoUsado, - dataFabricacao; + etiquetaPreco();
 * Leve em consideração que a etiqueta a ser impressa como resultado final, deve seguir a ideia proposta abaixo. Este é apenas
   uma exemplo de como deve ser impresso o resultado conforme os dados fornecidos.
 * ETIQUETAS PREÇO:
 * Tablet R$ 2800.00 (Taxa Alfandega: $ 20.00)
 * Notebook $ 8000.00
 * Iphone10 (usado) $ 900.00 (Data de Fabricacao: 25/04/2018)
 */

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o nome do produto usado, o seu preço original e sua data de fabricação: ");
        ProdutoUsado usa = new ProdutoUsado();
        usa.setNome(sc.next());
        usa.setPreco(sc.nextDouble());
        usa.setDataFabricacao(sc.next());
        System.out.println(usa.toString());
        
        System.out.println("Informe o nome do produto importado, o seu preço original e sua data de fabricação: ");
        ProdutoImportado imp = new ProdutoImportado();
        imp.setNome(sc.next());
        imp.setPreco(sc.nextDouble());
        imp.setDataFabricacao(sc.next());
        System.out.println(imp.toString());
    }
}
