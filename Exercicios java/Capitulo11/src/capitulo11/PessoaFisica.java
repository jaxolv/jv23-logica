package capitulo11;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }
    
    @Override
    public String getNome() {
        return this.nome;
    }
    
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void pessoaFisica() {
        System.out.printf("Pessoa física de nome %s portadora do CPF de número %s.%n", this.getNome(), this.getCpf());
    }
}
