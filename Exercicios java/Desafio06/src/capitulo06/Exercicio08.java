package capitulo06;

public class Exercicio08 {
    /** Crie um programa que faça um jogo da mega sena de forma randômica. Os números devem ser escolhidos
     * de forma aleatória. Imprima o resultado. */
    
    public static void main(String[] args) {
        System.out.print("Os números sorteados foram ");
        System.out.println(sorteio() + ".");
    }
    
    public static int random() { return (int) Math.ceil(100*Math.random()); }
    
    public static String sorteio() {
        int[] numeros = new int[6];
        
        numeros[0] = random();
        for (int i=1; i<6; i++) { numeros[i] = random();}
        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                if (i!=j) { numeros[i] = numeros[i]==numeros[j] ? random() : numeros[i]; }
            }
        }
        for (int j=0; j<6; j++) {
            for (int i=1; i<6; i++) {
                int aux = numeros[i];
                while (numeros[i] < numeros[i-1]) {
                    numeros[i] = numeros[i-1];
                    numeros[i-1] = aux;
                }
            }
        }
        return numeros[0] + ", " + numeros[1] + ", " + numeros[2] + ", "
                + numeros[3] + ", " + numeros[4] + ", " + numeros[5];
    }
}
