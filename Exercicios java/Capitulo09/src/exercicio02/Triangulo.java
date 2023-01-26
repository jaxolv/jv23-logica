package exercicio02;

public class Triangulo implements Medidas{
    private double base, altura, ladoA, ladoB, ladoC;

    public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
    public String getNomeFigura() {
        return "triângulo";
    }
    
    public double getArea() {
        return (this.getAltura()*this.getBase())/2;
    }
    
    public double getPerimetro() {
        return this.getLadoA()+this.getLadoB()+this.getLadoC();
    }
}
