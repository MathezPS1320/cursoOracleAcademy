import java.util.Random;

public class ComputeMethods {

    public double fahrenheitParaCelsius(double grausFahrenheit) {
        double grausCelsius = 5.0 / 9.0 * (grausFahrenheit - 32);
        return grausCelsius;
    }
    
    public double hipotenusa(double a, double b) {
        double hipotenusa = Math.sqrt(a * a + b * b);
        return hipotenusa;
    }
    
    public int mexerDados() {
        Random random = new Random();
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int soma = dado1 + dado2;
        return soma;
    }
}