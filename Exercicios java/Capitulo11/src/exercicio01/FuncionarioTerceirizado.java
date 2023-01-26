package exercicio01;

// FuncionarioTercerizado: - nome, - horas, - valorPorHora; + pagamento();

import exercicio01.Funcionario;


public class FuncionarioTerceirizado extends Funcionario{
    
    @Override
    public double pagamento() {
        return (this.getHoras()*this.getValorHora())*1.1;
    }
    
    @Override
    public String toString() {
        return "O funcionario terceirizado " + this.getNome() + " que recebe R$ " + this.getValorHora() +
                " por hora, ganha, ao todo, R$ " + this.pagamento() + ".";
    }
}
