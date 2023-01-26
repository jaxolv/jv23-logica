package resolucao;

import java.awt.Toolkit;
import java.awt.Dimension;

public class Resolucao {
    public static void main(String[] args) {
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension dimensao = tela.getScreenSize();
        System.out.println("A largura da tela desse sistema é: " + dimensao.width);
        System.out.println("A altura da tela desse sistema é: " + dimensao.height);
    }
}
