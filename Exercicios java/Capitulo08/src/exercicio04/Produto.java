package exercicio04;

public class Produto {
    private int codigo, quantidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    double valorFinal() {
        switch (getCodigo()) {
            case 1:
                return 7 * getQuantidade();
            case 2:
                return 9 * getQuantidade();
            case 3:
                return 11 * getQuantidade();
            case 4:
                return 5 * getQuantidade();
            case 5:
                return 4 * getQuantidade();
            default:
                return 0;
        }
    }
    
    void produtos() {
        System.out.println("CÓDIGO   PRODUTO             PREÇO\n" + 
                           "1        Cachorro-Quente     7.00\n" +
                           "2        X-Salada            9.00\n" +
                           "3        X-Bacon             11.00\n" +
                           "4        Torrada             5.00\n" +
                           "5        Refrigerante        4.00");
    }
}
