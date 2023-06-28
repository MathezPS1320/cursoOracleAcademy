import java.util.Scanner;

public class ValidatePin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int senhaPin;

        do {
            System.out.println("Insira o PIN cadastrado: ");
            senhaPin = input.nextInt();

            if (senhaPin != 2023) {
                System.out.println("PIN inválido. Tente novamente");
            }
        } while (senhaPin != 2023);

        System.out.println("PIN válido, acesso permitido.");

        input.close();
    }
}
