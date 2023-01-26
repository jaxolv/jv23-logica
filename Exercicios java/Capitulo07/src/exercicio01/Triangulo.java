package exercicio01;

public class Triangulo {
    double a, b, c;
    
    
    double area() {
        double p = (a+b+c)/2;
        double x = p*(p-a)*(p-b)*(p-c);
        double s = Math.sqrt(x);
        return s;
    }
    
    void imprimirArea() {
        System.out.printf("A área deste triângulo é de %.2f%n", area());
    }
    
    void verificacao() {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            imprimirArea();
        } else {
            System.out.println("Não é um triângulo.");
        }
    }
}
