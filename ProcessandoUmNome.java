import java.util.Scanner;

public class ProcessandoUmNome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeCompleto = input.nextLine();
        input.close();

        String nomeFormatado = formatarNome(nomeCompleto);

        System.out.printf("Seu nome é: %s \n", nomeFormatado);
    }

    public static String formatarNomeUsuario(String nomeCompleto) {
        String[] nomes = nomeCompleto.split(" ");
        String primeiroNome = nomes[0];
        String ultimoNome = nomes[nomes.length - 1];

        return ultimoNome + ", " + primeiroNome.charAt(0);
    }
}