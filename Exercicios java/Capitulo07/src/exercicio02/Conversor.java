package exercicio02;

public class Conversor {
    double valorDolar, reais;
    
    double conversao() {
        return valorDolar * reais;
    }
    
    double compra() {
        return conversao() * 1.06;
    }
}
