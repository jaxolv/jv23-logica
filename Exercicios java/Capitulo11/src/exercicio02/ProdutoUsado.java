package exercicio02;
// ProdutoUsado: - dataFabricacao; + etiquetaPreco();
public class ProdutoUsado extends Produto {
    private String dataFabricacao;

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public double etiquetaPreco() {
        return this.getPreco()*0.95;
    }
    
    @Override
    public String toString() {
        return "O produto " + this.getNome() + " foi fabricado em " + this.getDataFabricacao() + " custa R$ " + this.etiquetaPreco() + " (5% de desconto por ser usado).";
    }
}
