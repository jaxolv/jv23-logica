package exercicio06;

public class Funcionario {
    String nome;
    double imposto, salarioBruto, aumento;
    
    double salarioLiquido() {
        return salarioBruto*((100-imposto)/100.00);
    }
    
    void aumentoSalario() {
        salarioBruto += salarioBruto*(aumento/100);
    }
}
