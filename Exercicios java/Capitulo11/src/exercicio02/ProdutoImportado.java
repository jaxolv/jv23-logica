package exercicio02;
// ProdutoUsado: - dataFabricacao; + etiquetaPreco();
public class ProdutoImportado extends Produto {
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
        return this.getPreco()*1.2;
    }
    
    @Override
    public String toString() {
        return "O produto " + this.getNome() + " foi fabricado em " + this.getDataFabricacao() + " custa R$ " + this.etiquetaPreco() + " (20% de tributos por ser importado).";
    }
}
