package exercicio05;

public class Retangulo {
    double largura, altura;
    
    double area() {
        return largura * altura;
    }
    
    double perimetro() {
        return 2*(largura+altura);
    }
    
    double diagonal() {
        return Math.sqrt(Math.pow(largura,2) + Math.pow(altura,2));
    }
    
    void imprimaResultados() {
        System.out.printf("A área do retângulo é de %.2f.%n", area());
        System.out.printf("O perímetro do retângulo é de %.2f.%n", perimetro());
        System.out.printf("A diagonal do retângulo é de %.2f.%n", diagonal());
    }
}
