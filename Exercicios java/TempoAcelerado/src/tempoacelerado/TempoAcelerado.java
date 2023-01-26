package tempoacelerado;

import java.util.Locale;
import java.util.Scanner;

public class TempoAcelerado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int min, seg;
        double vel;

        System.out.print("min: ");
        min = sc.nextInt();
        System.out.print("seg: ");
        seg = sc.nextInt();
        System.out.print("velocidade: ");
        vel = sc.nextDouble();
        System.out.printf("%dm%ds x %.2f = ", min, seg, vel);
        
        int minutes = conversor(min, seg, vel, 1);
        int segundos = conversor(min, seg, vel, 2);
        
        System.out.printf("%dm%ds%n", minutes, segundos);
    }
    
    public static int conversor(int minutes, int seconds, double velocity, int option) {
        seconds += minutes*60;
        seconds /= velocity;
        
        int secondsConverted = seconds % 60;
        int minutesConverted = seconds - secondsConverted;
        minutesConverted /= 60;
        
        switch (option) {
            case 1:
                return minutesConverted;
            case 2:
                return secondsConverted;
            default:
                return 0;
        }
    }
}
