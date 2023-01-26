package exercicio02;


/** NOME: Carro;
 * ATRIBUTOS: + cor, + marca, + ano, + marcha, + ligado ,+ velocidadeAtual, + velocidadeMaxima;
 * MÉTODOS: + ligar(), + desligar(), + acelerar(), + pegarMarcha();
 **********************************
 X Use o construtor para definir o início padrão do carro. Ele deve estar desligado e marcha zero;
 X Insira dos os getters e setters;
 X Dentro do método desligado, avise com uma mensagem "Carro está desligado";
 X Dentro do método ligar(), avise com a mensagem quando estiver ligado "O carro está ligado". E ao acelerar
   que apresente o valor da velocidade Atual;
 X Dentro do método acelerar crie a lógica necessária. Considere uma quantidade/aumento de 10km/h para cada
   acelerada que for incrementado;
 X Dentro do método acelerar crie a lógica necessária. Considere a seguinte marcha:
 * (-1) Ré : velocidade < 0;
 * (0 ) Ponto Morto : velocidade = 0;
 * (1 ) Media: 0 < velocidade < 40;
 * (2 ) Alta : 40 =< velocidade =< 80;
 * (3 ) qualquer valor diferente do previsto.
 * Por fim, instancie dois objetos carro. Teste os carros com características e comportamentos diferentes. > */

public class Carro {
    public String cor, marca;
    public boolean ligado;
    public int ano, marcha;
    public double velocidadeAtual, velocidadeMaxima;

    public Carro() {
        this.ligado = false;
        this.velocidadeAtual = 0;
        this.velocidadeMaxima = 200;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMarcha() {
        return marcha;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void desligar() {
        setLigado(false);
        System.out.println("O carro está desligado.");
    }

    public void ligar() {
        setLigado(true);
        System.out.println("O carro está ligado.");
    }

    public void acelerar() {
        if (getVelocidadeAtual() <= getVelocidadeMaxima()) {
            this.velocidadeAtual += 10;
        } else {
            System.out.println("Você atingiu a velocidade máxima.\nReduza imediatamente para evitar riscos de acidentes.");
        }
    }

    public void pegarMarcha() {
        if (getVelocidadeAtual()<0) {
            this.marcha = -1;
            System.out.println("Marcha ré ACIONADA.");
        } else if (getVelocidadeAtual()==0) {
            this.marcha = 0;
        } else if (getVelocidadeAtual()>0 && getVelocidadeAtual()<40) {
            this.marcha = 1;
        } else if (getVelocidadeAtual()>=40 && getVelocidadeAtual()<=80) {
            this.marcha = 2;
        } else {
            this.marcha = 3;
        }
        System.out.println("Velocidade atual: " + getVelocidadeAtual());
        System.out.println("Marcha atual: " + getMarcha());
    }

    public void reduzir() {
        if (getVelocidadeAtual() < 0) {
            System.out.println("Não é indicado aumentar a velocidade do carro na marcha ré.");
        } else {
            this.velocidadeAtual -= 10;
        }
    }
    
    public void imprimirDados() {
        System.out.printf("Marca: %s%nAno: %d%nCor: %s%n", getMarca(), getAno(), getCor());
    }
}
