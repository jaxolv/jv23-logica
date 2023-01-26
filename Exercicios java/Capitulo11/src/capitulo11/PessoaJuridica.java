package capitulo11;

public class PessoaJuridica extends Pessoa{
    private String cnpj;

    public PessoaJuridica(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void pessoaJuridica() {
        System.out.printf("Pessoa jurídica de nome %s portadora do CNPJ de número %s.%n", this.getNome(), this.getCnpj());
    }
}
