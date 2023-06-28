import java.util.Scanner;

public class DisplayMultiples {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Digite um número positivo: ");
            int numeroDigitado = input.nextInt();
            
            System.out.printf("%nTabuada do %d:%n", numeroDigitado);
            
            for (int tabuada = 1; tabuada <= 12; tabuada++) {
                int resultado = numeroDigitado * tabuada;
                System.out.printf("%d x %d = %d%n", numeroDigitado, tabuada, resultado);
            }
        }
    }
}
