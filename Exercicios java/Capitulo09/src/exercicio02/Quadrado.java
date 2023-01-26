package exercicio02;

public class Quadrado implements Medidas{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    public String getNomeFigura() {
        return "quadrado";
    }
    
    public double getArea() {
        return Math.pow(lado, 2);
    }
    
    public double getPerimetro() {
        return lado*4;
    }
}
