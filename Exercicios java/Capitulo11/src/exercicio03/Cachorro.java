package exercicio03;

public class Cachorro extends Lobo{
    @Override
    public void emitirSom() {
        System.out.println("Au au au au...");
    }
    
    public String reagir(String frase) {
        if (frase=="Olá" || frase=="Vamos passear") {
            return "Abanar e latir";
        } else {
            return "Rosnar";
        }
    }
    
    public String reagir(int hora, int minutos) {
        if (hora < 12) {
            return "Abanar";
        } else if (hora <= 18) {
            return "Abanar e latir";
        } else {
            return "Ignorar";
        }
    }
    
    public String reagir(boolean dono) {
        if (dono==true) {
            return "Abanar e latir";
        } else {
            return "Rosnar";
        }
    }
    
    public String reagir(int idade, double peso) {
        if (idade<=5) {
            if (peso<=20) {
                return "Abanar";
            } else {
                return "Latir";
            }
        } else {
            if (peso>20) {
                return "Rosnar";
            } else {
                return "Ignorar";
            }
        }
    }
}
