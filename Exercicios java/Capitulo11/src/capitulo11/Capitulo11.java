package capitulo11;

import java.util.Scanner;

public class Capitulo11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o nome da pessoa jurídica: ");
        
        PessoaJuridica pj = new PessoaJuridica("11112223334");
        
        pj.setNome(sc.next());
        pj.pessoaJuridica();
        
        System.out.println("Informe o nome da pessoa física: ");
        
        PessoaFisica pf = new PessoaFisica("11122233344");
        
        pf.setNome(sc.next());
        pf.pessoaFisica();
    }
}
