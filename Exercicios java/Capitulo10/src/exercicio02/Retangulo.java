package exercicio02;

public class Retangulo extends Forma{
    private double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }
    
    @Override
    public double area() {
        return this.getAltura() * this.getLargura();
    }
}
