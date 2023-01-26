package exercicio02;
// SuperClass: Produto: - nome, - preco; + etiquetaPreco();

public abstract class Produto {
    protected String nome;
    protected double preco;
    
    public abstract double etiquetaPreco();
}
