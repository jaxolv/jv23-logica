package exercicio02;

public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    
    @Override
    public double area() {
        return Math.pow(raio, 2) * Math.PI;
    }
}
